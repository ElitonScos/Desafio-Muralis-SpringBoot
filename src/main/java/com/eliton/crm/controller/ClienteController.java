package com.eliton.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eliton.crm.model.Cliente;
import com.eliton.crm.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> Listar() {
		return clienteRepository.findAll();
	}
	
    @PostMapping	
	public Cliente adcionar(@RequestBody Cliente cliente) {
    	return clienteRepository.save(cliente);
	}

}
