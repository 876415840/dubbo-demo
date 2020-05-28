package org.demo.api;

import org.demo.entity.ProductDO;

import javax.validation.constraints.NotNull;

/**
 * @Description: 商品
 * @Author MengQingHao
 * @Date 2020/5/28 11:22 上午
 */
public interface ProductService {

    /**
     * get product by id
     * @param id
     * @return org.demo.entity.ProductDO
     * @author MengQingHao
     * @date 2020/5/28 11:27 上午
     */
    ProductDO getProductById(@NotNull Long id);
}
