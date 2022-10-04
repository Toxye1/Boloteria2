package br.com.boloteria.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.boloteria.domain.Pedido;
import br.com.boloteria.service.PedidoService;



@RestController
@RequestMapping(value = "/d/")
public class PedidoResource {

	
	@Autowired
	private PedidoService service;


	@RequestMapping(value = "/pedido",method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Pedido> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}	
	



}