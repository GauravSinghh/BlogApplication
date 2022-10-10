package com.masai.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Comment;

public interface CommentDao extends JpaRepository<Comment, Long>{

}
