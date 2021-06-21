package com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alura.forum.modelo.Topico;

@Repository
public interface TopicosRepository extends JpaRepository<Topico, Long>{

}
