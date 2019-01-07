package priv.xiaohan.ssm.service;
import priv.xiaohan.ssm.model.ArtArticle;
import priv.xiaohan.ssm.model.User;

/**
 * Created by xiaohan on 2017/3/15.
 */

public interface IArticleService {
    public ArtArticle getArtArticleByID(long id);
}