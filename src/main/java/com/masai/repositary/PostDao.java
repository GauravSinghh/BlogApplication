package com.masai.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Post;

public interface PostDao extends JpaRepository<Post, Long>{

}
