package org.demo.api;

import org.demo.entity.UserDO;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Description: user service
 * @Author MengQingHao
 * @Date 2020/5/27 5:10 下午
 */
public interface UserService {

    /**
     * find by id
     * @param id
     * @return org.demo.entity.UserDO
     * @author MengQingHao
     * @date 2020/5/27 5:11 下午
     */
    UserDO getById(@NotNull Long id);

    /**
     * find all
     * @param
     * @return java.util.List<org.demo.entity.UserDO>
     * @author MengQingHao
     * @date 2020/5/27 5:12 下午
     */
    List<UserDO> getAll();
}
