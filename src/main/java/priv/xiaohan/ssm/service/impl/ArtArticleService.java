package priv.xiaohan.ssm.service.impl;

import org.springframework.stereotype.Service;
import priv.xiaohan.ssm.dao.ArtArticleDao;
import priv.xiaohan.ssm.dao.UserDao;
import priv.xiaohan.ssm.model.ArtArticle;
import priv.xiaohan.ssm.model.User;
import priv.xiaohan.ssm.service.IArticleService;
import priv.xiaohan.ssm.service.IUserService;

import javax.annotation.Resource;

@Service("artArticleService")
public class ArtArticleService implements IArticleService {

    @Resource
    private ArtArticleDao artArticleDao;

    public ArtArticle getArtArticleByID(long id) {
        return this.artArticleDao.selectByPrimaryKey(id);
    }
}