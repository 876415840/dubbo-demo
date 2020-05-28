package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 订单
 * @Author MengQingHao
 * @Date 2020/5/27 6:13 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDO implements Serializable {

    /**
     * 对象必须实现Serializable接口
     */
    private static final long serialVersionUID = 6134240930086881736L;

    private Long id;
    private String orderNo;
    private Long userId;
}
