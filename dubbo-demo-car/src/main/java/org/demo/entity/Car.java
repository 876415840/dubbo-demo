package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author MengQingHao
 * @Date 2020/5/28 2:11 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private Long id;
    private Long userId;
    private Long productId;
    private Integer num;
}
