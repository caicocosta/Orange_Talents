package com.alura.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.modelo.Alunos;
import com.alura.forum.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;
	@PostMapping
	public Alunos cadastrar(@RequestBody Alunos aluno) {
		return alunoRepository.save(aluno);
	}
}
