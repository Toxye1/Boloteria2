package br.com.boloteria.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.boloteria.domain.Cliente;
import br.com.boloteria.service.ClienteService;



@RestController
@RequestMapping(value = "/d/")
public class ClienteResource {

	
	@Autowired
	private ClienteService service;


	@RequestMapping(value = "/cliente",method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Cliente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}	
	



}