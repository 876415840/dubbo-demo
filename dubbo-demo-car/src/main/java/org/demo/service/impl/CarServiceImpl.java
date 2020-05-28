package org.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.demo.api.CarService;
import org.demo.api.ProductService;
import org.demo.entity.Car;
import org.demo.entity.CarDO;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 购物车
 * @Author MengQingHao
 * @Date 2020/5/28 2:09 下午
 */
@Service(interfaceClass = CarService.class)
@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList(){{
        add(new Car(1L, 1L, 1L, 1));
        add(new Car(2L, 2L, 2L, 2));
        add(new Car(3L, 3L, 3L, 4));
        add(new Car(4L, 1L, 4L, 3));
        add(new Car(5L, 2L, 3L, 1));
    }};

    @Reference
    private ProductService productService;

    @Override
    public List<CarDO> getUserCar(@NotNull Long userId) {
        return cars.stream().filter(car -> userId.equals(car.getUserId()))
                .map(car -> new CarDO(car.getId(), userId, productService.getProductById(car.getProductId()), car.getNum())).collect(Collectors.toList());
    }
}
