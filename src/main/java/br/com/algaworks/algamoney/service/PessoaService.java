package br.com.algaworks.algamoney.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.algaworks.algamoney.model.Pessoa;
import br.com.algaworks.algamoney.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(@PathVariable Long codigo, @RequestBody Pessoa pessoa) {

		  Pessoa pessoaSalva = this.pessoaRepository.findById(codigo)
		      .orElseThrow(() -> new EmptyResultDataAccessException(1));

		  BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");

		  return this.pessoaRepository.save(pessoaSalva);
		}
}

