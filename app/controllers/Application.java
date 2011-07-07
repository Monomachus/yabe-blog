package controllers;

import java.util.List;

import models.Post;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        Post frontPost = Post.find("order by postedAt desc").first();
        List<Post> olderPosts = Post.find("order by postedAt desc").from(1).fetch(10);
        render(frontPost, olderPosts);
    }
}