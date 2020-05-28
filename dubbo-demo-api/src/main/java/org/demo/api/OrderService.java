package org.demo.api;

import org.demo.entity.OrderDO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Description: 订单
 * @Author MengQingHao
 * @Date 2020/5/27 6:12 下午
 */
public interface OrderService {

    /**
     * find orders by user id
     * @param userId
     * @return org.demo.entity.OrderDO
     * @author MengQingHao
     * @date 2020/5/27 6:15 下午
     */
    List<OrderDO> getByUser(@NotNull Long userId);

    /**
     * find order by orderNo
     * @param orderNo
     * @return org.demo.entity.OrderDO
     * @author MengQingHao
     * @date 2020/5/27 6:17 下午
     */
    OrderDO getByOrderNo(@NotBlank String orderNo);

}
