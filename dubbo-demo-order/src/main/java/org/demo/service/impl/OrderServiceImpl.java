package org.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.demo.api.OrderService;
import org.demo.entity.OrderDO;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
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

    private List<OrderDO> orders = new ArrayList(){{
        add(new OrderDO(1L, "no_1", 1L));
        add(new OrderDO(2L, "no_2", 1L));
        add(new OrderDO(3L, "no_3", 1L));
        add(new OrderDO(4L, "no_4", 2L));
        add(new OrderDO(5L, "no_5", 2L));
        add(new OrderDO(6L, "no_6", 3L));
        add(new OrderDO(7L, "no_7", 3L));
        add(new OrderDO(8L, "no_8", 3L));
    }};

    @Override
    public List<OrderDO> getByUser(@NotNull Long userId) {
        return orders.stream().filter(order -> userId.equals(order.getUserId())).collect(Collectors.toList());
    }

    @Override
    public OrderDO getByOrderNo(@NotBlank String orderNo) {
        Optional<OrderDO> optional = orders.stream().filter(order -> orderNo.equals(order.getOrderNo())).findFirst();
        if (!optional.isPresent()) {
            return null;
        }
        return optional.get();
    }
}
