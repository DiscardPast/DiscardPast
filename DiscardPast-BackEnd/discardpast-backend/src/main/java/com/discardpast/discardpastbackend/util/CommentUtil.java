package com.discardpast.discardpastbackend.util;

import com.discardpast.discardpastbackend.bean.Comment;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class CommentUtil {

    //评论Key(评论属于Article/Code/Comment)
    private static String[] commentKey = {"code","article","comment","article"};
    //评论者昵称
    private static String[] commentName = {"小明","小红","Jack","Alice"};
    //评论者头像
    private static File commentImage;
    //评论者评论时间
    private static Date commentDate = new Date(System.currentTimeMillis());
    //评论者评论内容
    private static String[] commentContent = {"小明到此一游","小红到此一游","Jack到此一游","Alice到此一游"};
    //评论喜欢人数
    private static Integer[] commentLike = {100,25,64,38};
    //评论不喜欢人数
    private static Integer[] commentDislike = {2,3,4,5};
    //评论回复评论
    private static Comment commentComment;

    public static List<Comment> getCommentList(){
        List<Comment> commentList = new ArrayList<Comment>();
        for(int i = 0;i < 4;i++)
        {
            Comment comment = new Comment();
            comment.setCommentKey(commentKey[i]);
            comment.setCommentName(commentName[i]);
            comment.setCommentImage(commentImage);
            comment.setCommentDate(commentDate);
            comment.setCommentContent(commentContent[i]);
            comment.setCommentLike(commentLike[i]);
            comment.setCommentDislike(commentDislike[i]);
            comment.setCommentComment(commentComment);
            commentList.add(comment);
        }
        return commentList;
    }
}
