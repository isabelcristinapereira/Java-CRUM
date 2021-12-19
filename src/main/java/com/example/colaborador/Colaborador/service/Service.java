package com.example.colaborador.Colaborador.service;

import java.util.Optional;

import com.example.colaborador.Repository.ColaboradorInterface;
import com.example.colaborador.Repository.ColaboradorRepository;
import com.example.colaborador.model.ColaboradorModel;

public class Service {
	 
	public Optional<Object> salvarColaborador(ColaboradorModel novoColaborador) {
		Optional<ColaboradorModel> colaborador = ColaboradorRepository.findByColaborador(novoColaborador.getColaborador());
		if (colaborador.isPresent()) {
			return Optional.empty();
		} else {
			
			return Optional.ofNullable(ColaboradorRepository.save(novoColaborador));
		}
	}
	
	public Optional<ColaboradorModel> buscarPeloCpfPresente(String cpf) {

		Optional<ColaboradorModel> colaboradorSalvo = ColaboradorRepository.findById(cpf);

		if (colaboradorSalvo.isEmpty()) {

			return Optional.empty(); //retorno objeto vazio
		} 

		return Optional.ofNullable(colaboradorSalvo.get()); 
	}
  
	
}
