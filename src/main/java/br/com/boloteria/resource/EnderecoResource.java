package br.com.boloteria.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.boloteria.domain.Endereco;
import br.com.boloteria.service.EnderecoService;



@RestController
@RequestMapping(value = "/d/")
public class EnderecoResource {

	
	@Autowired
	private EnderecoService service;


	@RequestMapping(value = "/endereco",method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Endereco> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}	
	



}