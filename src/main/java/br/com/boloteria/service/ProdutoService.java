package br.com.boloteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boloteria.domain.Produto;
import br.com.boloteria.repository.ProdutoRepository;


@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository prodRepo;

	public List<Produto> findAll() {
		List<Produto> list = prodRepo.findAllCat();

		return list;
	}


}
