package com.example.SocialMedia.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @DBRef
    private User user;

    private String bio;
    private String profilePicture;
    @DBRef
    private List<Repost> reposts = new ArrayList<>();
    @DBRef
    private List<Post> posts=new ArrayList<>();
    @DBRef(lazy = true)
    private List<Friendship> friendships;

    @DBRef(lazy = true)
    private List<Follow> followers;
}
