package com.myblogRevision.myblogRevision.Serivce.ServiceImpl;

import com.myblogRevision.myblogRevision.Entity.Post;
import com.myblogRevision.myblogRevision.Payload.PostDto;
import com.myblogRevision.myblogRevision.Repository.PostRepository;
import com.myblogRevision.myblogRevision.Serivce.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository){
        this.postRepository=postRepository;

    }



    @Override
    public PostDto createPost(PostDto postDto) {
        Post p = new Post();
        p.setName(postDto.getName());
        p.setCourse(postDto.getCourse());
        p.setLocation(postDto.getLocation());

        Post post = postRepository.save(p);
        PostDto dto = new PostDto();
        p.setName(post.getName());
        p.setCourse(post.getCourse());
        p.setLocation(post.getLocation());


        return null;
    }
}
