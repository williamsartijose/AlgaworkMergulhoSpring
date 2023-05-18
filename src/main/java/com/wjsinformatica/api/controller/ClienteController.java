package com.wjsinformatica.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wjsinformatica.domain.model.Cliente;
import com.wjsinformatica.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
public class ClienteController {

	
	private ClienteRepository clienteRepository;
	

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return clienteRepository.findByNome("William");
				
		

	}
}
