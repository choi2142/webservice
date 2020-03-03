package com.choi.springwebservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.choi.springwebservice.domain.posts.PostsRepostitory;
import com.choi.springwebservice.dto.posts.PostsMainResponseDto;
import com.choi.springwebservice.dto.posts.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {
	private PostsRepostitory postsRepository;
	
	  @Transactional
	    public Long save(PostsSaveRequestDto dto){
	        return postsRepository.save(dto.toEntity()).getId();
	    }
	
	  @Transactional(readOnly = true)
	    public List<PostsMainResponseDto> findAllDesc() {
	        return postsRepository.findAllDesc()
	        		.map(PostsMainResponseDto::new)
	                .collect(Collectors.toList());
	    }
}
