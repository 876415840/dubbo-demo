package org.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.demo.api.UserService;
import org.demo.entity.UserDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 用户接口测试
 * @Author MengQingHao
 * @Date 2020/5/27 5:35 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/user/{id}")
    public String findById(@PathVariable Long id){
        UserDO userDO = userService.getById(id);
        if (userDO == null) {
            return "null";
        }
        return JSON.toJSONString(userDO);
    }

    @GetMapping("/users")
    public List<UserDO> listUser(){
        return userService.getAll();
    }
}
