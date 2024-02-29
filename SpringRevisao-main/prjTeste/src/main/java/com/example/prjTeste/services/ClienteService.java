package com.example.prjTeste.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prjTeste.entities.Cliente;
import com.example.prjTeste.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService (ClienteRepository ClienteRepository) {
		this.clienteRepository = ClienteRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllCliente(){
		return clienteRepository.findAll();
	}
	
	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
	

}
