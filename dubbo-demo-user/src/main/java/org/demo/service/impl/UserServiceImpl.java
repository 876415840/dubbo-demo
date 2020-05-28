package org.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.demo.api.UserService;
import org.demo.entity.UserDO;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Author MengQingHao
 * @Date 2020/5/27 5:13 下午
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    private List<UserDO> users = new ArrayList(){{add(new UserDO(1L, "A", "a"));add(new UserDO(2L, "B", "b"));add(new UserDO(3L, "C", "c"));}};
    @Override
    public UserDO getById(@NotNull Long id) {
        Optional<UserDO> optional = users.stream().filter(user -> id.equals(user.getId())).findFirst();
        if (!optional.isPresent()) {
            return null;
        }
        return optional.get();
    }

    @Override
    public List<UserDO> getAll() {
        return users;
    }
}
