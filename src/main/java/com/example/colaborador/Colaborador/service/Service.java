package com.example.colaborador.Colaborador.service;

import java.util.Optional;

import com.example.colaborador.Repository.ColaboradorInterface;
import com.example.colaborador.Repository.ColaboradorRepository;
import com.example.colaborador.model.ColaboradorModel;

public class Service {
	 //salvando um cliente no banco de dados
	public Optional<Object> salvarColaborador(ColaboradorModel novoColaborador) {
		Optional<ColaboradorModel> colaborador = ColaboradorRepository.findByNome(novoColaborador.getC());
		if (cliente.isPresent()) {
			return Optional.empty();
		} else {
			
			return Optional.ofNullable(clienteRepository.save(novoCliente));
		}
	}
  
	
}
