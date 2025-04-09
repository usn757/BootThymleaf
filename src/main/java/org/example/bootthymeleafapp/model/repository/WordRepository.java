package org.example.bootthymeleafapp.model.repository;

import org.example.bootthymeleafapp.model.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// UUID 썼으므로 long 아니라 String
@Repository
public interface WordRepository extends JpaRepository<Word, String> {

    // findAll -> PK (Primary Key : 기본키)
    List<Word> findAllByOrderByCreatedAtDesc(); // 최신것부터 정렬
}