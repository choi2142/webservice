package com.choi.springwebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepostitory extends JpaRepository<Posts, Long>{

}
