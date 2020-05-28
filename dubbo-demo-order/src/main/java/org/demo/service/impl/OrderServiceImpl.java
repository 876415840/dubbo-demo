package org.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.demo.api.OrderService;
import org.demo.api.ProductService;
import org.demo.entity.Order;
import org.demo.entity.OrderDO;
import org.demo.entity.OrderDetail;
import org.demo.entity.OrderDetailDO;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Description: 订单
 * @Author MengQingHao
 * @Date 2020/5/27 6:18 下午
 */
@Service(interfaceClass = OrderService.class)
@Component
public class OrderServiceImpl implements OrderService {

    private List<Order> orders = new ArrayList(){{
        add(new Order(1L, "no_1", 1L));
        add(new Order(2L, "no_2", 2L));
        add(new Order(3L, "no_3", 1L));
        add(new Order(4L, "no_4", 3L));
        add(new Order(5L, "no_5", 2L));
    }};

    private List<OrderDetail> orderDetails = new ArrayList(){{
        add(new OrderDetail(1L, "no_1", 1L, 2));
        add(new OrderDetail(2L, "no_1", 2L, 3));
        add(new OrderDetail(3L, "no_2", 2L, 4));
        add(new OrderDetail(4L, "no_2", 3L, 1));
        add(new OrderDetail(5L, "no_3", 1L, 2));
        add(new OrderDetail(6L, "no_3", 3L, 7));
        add(new OrderDetail(7L, "no_4", 1L, 2));
        add(new OrderDetail(8L, "no_4", 4L, 1));
        add(new OrderDetail(9L, "no_5", 4L, 6));
    }};

    @Reference
    private ProductService productService;

    @Override
    public List<OrderDO> getByUser(@NotNull Long userId) {
        List<Order> orderList = orders.stream().filter(order -> userId.equals(order.getUserId())).collect(Collectors.toList());
        if (orderList.size() == 0) {
            return new ArrayList<>();
        }
        Map<String, List<OrderDetail>> orderDetailsByMap = orderDetails.stream().collect(Collectors.groupingBy(OrderDetail::getOrderNo));
        return orderList.stream().map(order -> {
            List<OrderDetail> orderDetailList = orderDetailsByMap.get(order.getOrderNo());
            List<OrderDetailDO> orderDetailDOList = orderDetailList.stream().map(detail -> new OrderDetailDO(detail.getId(), detail.getOrderNo(), productService.getProductById(detail.getProductId()), detail.getNum())).collect(Collectors.toList());

            return new OrderDO(order.getId(), order.getOrderNo(), order.getUserId(), orderDetailDOList);
        }).collect(Collectors.toList());
    }

    @Override
    public OrderDO getByOrderNo(@NotBlank String orderNo) {
        Optional<Order> optional = orders.stream().filter(order -> orderNo.equals(order.getOrderNo())).findFirst();
        if (!optional.isPresent()) {
            return null;
        }
        Order order = optional.get();
        OrderDO orderDO = new OrderDO();
        orderDO.setId(order.getId());
        orderDO.setUserId(order.getUserId());
        orderDO.setOrderNo(orderNo);
        List<OrderDetailDO> orderDetailList = orderDetails.stream().filter(detail -> orderNo.equals(detail.getOrderNo()))
                .map(detail -> new OrderDetailDO(detail.getId(), detail.getOrderNo(), productService.getProductById(detail.getProductId()), detail.getNum())).collect(Collectors.toList());
        orderDO.setOrderDetails(orderDetailList);
        return orderDO;
    }

}
