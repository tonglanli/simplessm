package priv.xiaohan.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.xiaohan.ssm.model.ArtArticle;
import priv.xiaohan.ssm.model.User;
import priv.xiaohan.ssm.service.IArticleService;
import priv.xiaohan.ssm.service.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private IArticleService articleService;

    @RequestMapping("/showArticle")
    public String toIndex(HttpServletRequest request, Model model) {
        long userId = Integer.parseInt(request.getParameter("id"));
        ArtArticle artArticle = this.articleService.getArtArticleByID(userId);
        //绑定对象到User.jsp
        model.addAttribute("article", artArticle);
        return "Article";

    }
}