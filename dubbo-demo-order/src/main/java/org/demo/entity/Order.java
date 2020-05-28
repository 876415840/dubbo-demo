package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 订单
 * @Author MengQingHao
 * @Date 2020/5/28 11:33 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;
    private String orderNo;
    private Long userId;
}
