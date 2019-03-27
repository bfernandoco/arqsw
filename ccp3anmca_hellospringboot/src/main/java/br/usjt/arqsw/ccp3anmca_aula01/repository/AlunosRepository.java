package br.usjt.arqsw.ccp3anmca_aula01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.arqsw.ccp3anmca_aula01.model.Aluno;

public interface AlunosRepository extends JpaRepository<Aluno, Long> {

}