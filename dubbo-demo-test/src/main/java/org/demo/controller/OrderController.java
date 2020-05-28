package org.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.demo.api.OrderService;
import org.demo.entity.OrderDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 订单接口测试
 * @Author MengQingHao
 * @Date 2020/5/27 6:24 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Reference
    private OrderService orderService;

    @GetMapping("/orders/{userId}")
    public List<OrderDO> findByUserId(@PathVariable Long userId) {
        return orderService.getByUser(userId);
    }

    @GetMapping("/order/{orderNo}")
    public String findByOrderNo(@PathVariable String orderNo) {
        OrderDO orderDO =  orderService.getByOrderNo(orderNo);
        if (orderDO == null) {
            return "null";
        }
        return JSON.toJSONString(orderDO);
    }
}
