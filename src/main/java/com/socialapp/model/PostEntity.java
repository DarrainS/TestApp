package com.socialapp.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "post")
public class PostEntity {
    @Id
    private String id;

    private String userId;

    private String content;

    private Instant createdAt;

    List<String> like = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
	public PostEntity(String id, String userId, String originalUserId, String content, String image, Instant createdAt, List<String> like) {
		super();
		this.id = id;
		this.userId = userId;
		this.content = content;
		this.createdAt = createdAt;
		this.like = like;
	}
	
	public PostEntity(String userId, String content) {
		this.userId = userId;
		this.content = content;
	}
	
	public PostEntity() {
		
	}
    
}
