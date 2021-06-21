package com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.dto.TopicosDTO;
import com.alura.forum.modelo.Topico;
import com.alura.forum.repository.TopicosRepository;

@RestController
@RequestMapping("/topicos")
public class Topicos {
	
	@Autowired
	private TopicosRepository topicosRepository;
	
	@GetMapping
	public List<TopicosDTO> listar(){
		List<Topico> topicos = topicosRepository.findAll(); 
		
		return TopicosDTO.converter(topicos);
	}
}
