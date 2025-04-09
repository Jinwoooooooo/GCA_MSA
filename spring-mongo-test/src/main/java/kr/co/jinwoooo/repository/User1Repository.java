package kr.co.jinwoooo.repository;

import kr.co.jinwoooo.document.User1Document;
import org.springframework.data.domain.Limit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface User1Repository extends MongoRepository<User1Document, String> {

    Optional<User1Document> findByUid(String uid);
    public void deleteByUid(String uid);
    public boolean existsByUid(String uid);
}
