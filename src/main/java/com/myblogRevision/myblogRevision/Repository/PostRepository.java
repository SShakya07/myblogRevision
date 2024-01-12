package com.myblogRevision.myblogRevision.Repository;

import com.myblogRevision.myblogRevision.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
