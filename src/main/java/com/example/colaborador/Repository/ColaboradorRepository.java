package com.example.colaborador.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colaborador.model.ColaboradorModel;

@Repository 
public interface ColaboradorRepository extends JpaRepository<ColaboradorModel,Long>{
	
		
		 Optional<ColaboradorModel> findById(Long id);
			Optional<ColaboradorModel> findByNome(String colaborador);
			Optional<ColaboradorModel> fintByCpf(String cpf);
		}
	