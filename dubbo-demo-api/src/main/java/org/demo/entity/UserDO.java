package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: user
 * @Author MengQingHao
 * @Date 2020/5/27 5:09 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDO implements Serializable {

    private Long id;
    private String name;
    private String passwrod;

}
