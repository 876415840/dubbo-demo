package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 商品
 * @Author MengQingHao
 * @Date 2020/5/28 11:07 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDO implements Serializable {

    /**
     * 对象必须实现Serializable接口
     */
    private static final long serialVersionUID = -1263647893987597188L;

    private Long id;
    private String name;
    private String desc;
    private Integer price;

}
