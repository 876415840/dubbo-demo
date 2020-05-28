package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 订单详情
 * @Author MengQingHao
 * @Date 2020/5/28 11:28 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDO implements Serializable {

    private static final long serialVersionUID = 3121725718210656931L;

    private Long id;
    private String orderNo;
    private ProductDO product;
    private Integer num;
}
