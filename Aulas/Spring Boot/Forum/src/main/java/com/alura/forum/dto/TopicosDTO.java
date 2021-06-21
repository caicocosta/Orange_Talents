package com.alura.forum.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.alura.forum.modelo.Topico;

public class TopicosDTO {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime datacriacao;
	
	public TopicosDTO(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.datacriacao = topico.getDataCriacao();
	}
	
	public static List<TopicosDTO> converter(List<Topico> topico){
		return topico.stream()
					 .map(TopicosDTO::new)
					 .collect(Collectors.toList());
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public LocalDateTime getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(LocalDateTime datacriacao) {
		this.datacriacao = datacriacao;
	}
	
	
}
