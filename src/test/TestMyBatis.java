import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import priv.xiaohan.ssm.model.User;
import priv.xiaohan.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private IUserService userService = null;


    @Test
    public void test() {
        User user = userService.getUserByID(1);
        System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}