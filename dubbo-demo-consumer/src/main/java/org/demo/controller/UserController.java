package org.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.demo.api.UserService;
import org.demo.entity.UserDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: user接口测试
 * @Author MengQingHao
 * @Date 2020/5/27 5:35 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/findById/{id}")
    public UserDO findById(@PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping("/listUser")
    public List<UserDO> listUser(){
        return userService.getAll();
    }
}
