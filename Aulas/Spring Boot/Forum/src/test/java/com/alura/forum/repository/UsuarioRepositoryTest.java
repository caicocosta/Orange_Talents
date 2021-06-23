package com.alura.forum.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.alura.forum.modelo.Usuario;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Test
	public void deveriaRetornarEmail() {
		
		/*Usuario user = new Usuario();
		user.setEmail("sales.c.costa@gmail.com");
		user.setNome("Caico Costa");
		user.setIdade(28);
		
		em.persist(user);*/
		
		String email = "aluno@email.com";
		Usuario usuario = usuarioRepository.findByEmail(email);
		Assertions.assertNotNull(usuario);
		Assertions.assertEquals(email, usuario.getEmail());
		
	}
	
	@Test
	public void deveriaRetornarNull() {
		String email = "adfasfasdfdf@gmail.com";
		Usuario usuario = usuarioRepository.findByEmail(email);
		Assertions.assertNull(usuario);
		
	}	

}
