package com.wjsinformatica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wjsinformatica.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("William");
		cliente1.setTelefone("18 99787-353");
		cliente1.setEmail("Williamsarti@gmail.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("19 99786-5789");
		cliente2.setEmail("mariasilva@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);

	}
}
