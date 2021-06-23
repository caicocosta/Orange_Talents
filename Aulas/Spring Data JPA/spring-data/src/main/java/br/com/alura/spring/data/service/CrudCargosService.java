package br.com.alura.spring.data.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.repository.CargoRepository;

@Service
public class CrudCargosService {
	
	private boolean system;

	private CargoRepository cargoRepository;
	
	public CrudCargosService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}
	
	public void inicial(Scanner scanner) {		
		
		while(system) {	
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Atualizar");
			int action = scanner.nextInt();
			
			switch (action) {
			case 1:
				salvar(scanner);
				break;
			case 2:
				atualizar(scanner);
				break;
			default:
				system = false;
				break;
			}
		}	
	}
	
	public void salvar(Scanner scanner) {
		System.out.println("Descricao do cargo: ");
		String descricao = scanner.next();
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);
		cargoRepository.save(cargo);
		System.out.println("Cargo salvo com sucesso!");
	}
	
	private void atualizar(Scanner scanner) {
		System.out.println("Id: ");
		int id = scanner.nextInt();
		System.out.println("Nova descricao do cargo: ");
		String descricao = scanner.next();
		Cargo cargo = new Cargo();
		cargo.setId((long)id);
		cargo.setDescricao(descricao);
		cargoRepository.save(cargo);
		System.out.println("Cargo atualizado com sucesso!");
	}
}
