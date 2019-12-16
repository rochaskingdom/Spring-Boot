package br.com.vinicius.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinicius.forum.controller.dto.TopicoDto;
import br.com.vinicius.forum.model.Curso;
import br.com.vinicius.forum.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao"));

		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
}
