package org.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.demo.api.ProductService;
import org.demo.entity.ProductDO;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Description: 商品
 * @Author MengQingHao
 * @Date 2020/5/28 2:00 下午
 */
@Service(interfaceClass = ProductService.class)
@Component
public class ProductServiceImpl implements ProductService {

    private List<ProductDO> products = new ArrayList(){{
        add(new ProductDO(1L, "玻璃茶杯", "精致玻璃茶杯", 3450));
        add(new ProductDO(2L, "鼠标垫", "小熊鼠标垫", 1899));
        add(new ProductDO(3L, "热水壶", "美的热水壶", 9999));
        add(new ProductDO(4L, "纸抽", "绵柔面巾纸", 550));
    }};


    @Override
    public ProductDO getProductById(@NotNull Long id) {
        Optional<ProductDO> optional = products.stream().filter(product -> id.equals(product.getId())).findFirst();
        if (!optional.isPresent()) {
            return null;
        }
        return optional.get();
    }
}
