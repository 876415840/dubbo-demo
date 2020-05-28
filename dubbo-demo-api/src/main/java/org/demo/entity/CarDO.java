package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 购物车
 * @Author MengQingHao
 * @Date 2020/5/28 11:06 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDO implements Serializable {

    /**
     * 对象必须实现Serializable接口
     */
    private static final long serialVersionUID = -6653985005842696515L;

    private Long id;
    private Long userId;
    private ProductDO product;
    private Integer num;

}
