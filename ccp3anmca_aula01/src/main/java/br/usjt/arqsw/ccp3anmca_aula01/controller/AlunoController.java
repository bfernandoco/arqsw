package br.usjt.arqsw.ccp3anmca_aula01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.arqsw.ccp3anmca_aula01.model.Aluno;
import br.usjt.arqsw.ccp3anmca_aula01.repository.AlunosRepository;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunosRepository alunosRepo;
	
	@GetMapping("/alunos")
	public ModelAndView listarAlunos() {
		ModelAndView mv = new ModelAndView("alunos");
		List<Aluno> alunos = alunosRepo.findAll();
		mv.addObject("alunos",alunos);
		mv.addObject(new Aluno());
		return mv;
	}
	
	@PostMapping
	public String salvar (Aluno aluno) {
	alunosRepo.save(aluno);
	return "redirect:/alunos";
	}
}
