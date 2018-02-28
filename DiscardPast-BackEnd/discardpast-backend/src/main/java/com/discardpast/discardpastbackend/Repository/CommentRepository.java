package com.discardpast.discardpastbackend.Repository;

import com.discardpast.discardpastbackend.bean.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
