package com.discardpast.discardpastbackend.controller;

import com.discardpast.discardpastbackend.Repository.CommentRepository;
import com.discardpast.discardpastbackend.bean.Comment;
import com.discardpast.discardpastbackend.util.CommentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping(value = "/commentList")
    private List<Comment> getComment()
    {
        return commentRepository.findAll();
    }

    @PostMapping(value = "/commentList")
    private List<Comment> commentAdd()
    {
        return commentRepository.save(CommentUtil.getCommentList());
    }
}
