package com.example.SocialMedia.Service;

import com.example.SocialMedia.Dto.CreatePostDto;
import com.example.SocialMedia.Entity.Post;
import com.example.SocialMedia.Enum.PrivacySetting;
import com.example.SocialMedia.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post createPost(CreatePostDto createPostDto) throws  IOException {
        Post post = new Post();
        post.setText(createPostDto.getText());
        post.setImage(createPostDto.getImage());
        post.setVideo(createPostDto.getVideo());
        post.setPrivacySetting(createPostDto.getPrivacySetting());
        return postRepository.save(post);
    }
}
