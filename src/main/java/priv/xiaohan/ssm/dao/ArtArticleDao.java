package priv.xiaohan.ssm.dao;

import priv.xiaohan.ssm.model.ArtArticle;
import priv.xiaohan.ssm.model.User;

public interface ArtArticleDao {
    int deleteByPrimaryKey(Long id);

    int insert(ArtArticle record);

    int insertSelective(ArtArticle record);

    ArtArticle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArtArticle record);

    int updateByPrimaryKey(ArtArticle record);
}