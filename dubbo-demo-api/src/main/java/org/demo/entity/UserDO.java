package org.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 用户
 * @Author MengQingHao
 * @Date 2020/5/27 5:09 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDO implements Serializable {

    /**
     * 对象必须实现Serializable接口
     */
    private static final long serialVersionUID = -80197309413772343L;

    private Long id;
    private String name;
    private String passwrod;

}
