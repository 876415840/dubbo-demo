package org.demo.api;

import org.demo.entity.CarDO;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Description: 购物车
 * @Author MengQingHao
 * @Date 2020/5/28 11:23 上午
 */
public interface CarService {

    /**
     * get car by user id
     * @param userId
     * @return java.util.List<org.demo.entity.CarDO>
     * @author MengQingHao
     * @date 2020/5/28 2:15 下午
     */
    List<CarDO> getUserCar(@NotNull Long userId);
}
