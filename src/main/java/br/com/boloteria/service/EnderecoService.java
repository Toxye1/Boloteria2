package br.com.boloteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boloteria.domain.Endereco;
import br.com.boloteria.repository.EnderecoRepository;


@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository endRepo;

	public List<Endereco> findAll() {
		List<Endereco> list = endRepo.findAllCat();

		return list;
	}


}
