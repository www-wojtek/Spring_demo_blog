package pl.wojtek.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojtek.demo.entities.Post;
import pl.wojtek.demo.repositories.PostRepository;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
return postRepository.findAll();

    }

    public void insert(Post post) {
        postRepository.save(post);
    }
}
