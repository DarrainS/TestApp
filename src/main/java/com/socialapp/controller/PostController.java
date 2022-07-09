package com.socialapp.controller;

import com.socialapp.model.PostEntity;
import com.socialapp.service.PostService;
import com.socialapp.service.ResponseObjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/insertpost")
    public ResponseEntity<ResponseObjectService> insertPost(@RequestBody PostEntity inputPost) {
        return new ResponseEntity<ResponseObjectService>(postService.insertPost(inputPost), HttpStatus.OK);
    }
	/*
	 * @PostMapping("/myposts") public ResponseEntity<ResponseObjectService>
	 * findPostByUserId(@RequestBody IdObjectEntity inputUserId) { return new
	 * ResponseEntity<ResponseObjectService>(postService.findPostByUserId(
	 * inputUserId), HttpStatus.OK); }
	 * 
	 * @PostMapping("/lovepost") public ResponseEntity<ResponseObjectService>
	 * lovePost(@RequestBody DoubleIdObjectEntity doubleId) { return new
	 * ResponseEntity<ResponseObjectService>(postService.updatePostByLove(doubleId),
	 * HttpStatus.OK); }
	 */
}
