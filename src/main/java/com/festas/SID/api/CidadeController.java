package com.festas.SID.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.festas.SID.domain.model.Cidade;
import com.festas.SID.domain.repository.CidadeRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/cidade")
public class CidadeController {
	
	@Autowired
	private CidadeRepository cidadeRepository;		
		
	@GetMapping
	public List<Cidade> listar() {
		return cidadeRepository.findAll();
	}

}

