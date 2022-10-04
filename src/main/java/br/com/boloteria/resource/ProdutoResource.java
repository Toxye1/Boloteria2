package br.com.boloteria.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.boloteria.domain.Produto;
import br.com.boloteria.service.ProdutoService;



@RestController
@RequestMapping(value = "/d/")
public class ProdutoResource {

	
	@Autowired
	private ProdutoService service;


	@RequestMapping(value = "/produto",method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Produto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}	
	



}