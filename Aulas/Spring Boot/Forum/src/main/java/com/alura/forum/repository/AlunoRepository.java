package com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alura.forum.modelo.Alunos;

@Repository
public interface AlunoRepository extends JpaRepository<Alunos, Long>{


}
