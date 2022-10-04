package br.com.boloteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boloteria.domain.Pedido;
import br.com.boloteria.repository.PedidoRepository;


@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedRepo;

	public List<Pedido> findAll() {
		List<Pedido> list = pedRepo.findAllCat();

		return list;
	}


}
