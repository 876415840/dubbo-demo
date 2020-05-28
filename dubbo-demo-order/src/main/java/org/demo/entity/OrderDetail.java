package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 订单详情
 * @Author MengQingHao
 * @Date 2020/5/28 11:50 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

    private Long id;
    private String orderNo;
    private Long productId;
    private Integer num;
}
