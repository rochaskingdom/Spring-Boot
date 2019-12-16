package br.com.vinicius.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vinicius.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
