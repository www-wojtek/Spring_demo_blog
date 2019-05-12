package pl.wojtek.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wojtek.demo.entities.Post;

@Repository
public interface PostRepository extends JpaRepository <Post, Long> {
}
