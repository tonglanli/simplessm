package priv.xiaohan.ssm.service.impl;

import org.springframework.stereotype.Service;
import priv.xiaohan.ssm.dao.UserDao;
import priv.xiaohan.ssm.model.User;

import javax.annotation.Resource;
import java.util.List;
import priv.xiaohan.ssm.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

    @Resource
    private UserDao userdao;

    public User getUserByID(int id) {
        return this.userdao.selectByPrimaryKey(id);
    }
}