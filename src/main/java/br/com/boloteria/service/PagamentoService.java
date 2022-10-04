package br.com.boloteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boloteria.domain.Pagamento;
import br.com.boloteria.repository.PagamentoRepository;


@Service
public class PagamentoService {
	
	@Autowired
	private PagamentoRepository pagRepo;

	public List<Pagamento> findAll() {
		List<Pagamento> list = pagRepo.findAllCat();

		return list;
	}


}
