package com.routemenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.routemenu.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
