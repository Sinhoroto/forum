package com.bruno.forum.controller;

import com.bruno.forum.controller.dto.TopicoDto;
import com.bruno.forum.model.Curso;
import com.bruno.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao"));
        Topico indagacao = new Topico("pergunta", "Duvida com Spring", new Curso("Spring", "Programacao"));

        return TopicoDto.converter(Arrays.asList(topico,indagacao,topico));
    }
}
