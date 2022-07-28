package br.com.algaworks.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algaworks.algamoney.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}

