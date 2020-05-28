package org.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.demo.api.CarService;
import org.demo.entity.CarDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 购物车
 * @Author MengQingHao
 * @Date 2020/5/28 2:18 下午
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @Reference
    private CarService carService;

    @GetMapping("/car/{userId}")
    public List<CarDO> getCarByUserId(@PathVariable Long userId) {

        return carService.getUserCar(userId);
    }
}
