package br.com.ds.listavip.controllers;

import br.com.ds.listavip.models.Convidado;
import br.com.ds.listavip.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("convidados")
public class ConvidadosController {

    private ConvidadoRepository repository;

    @Autowired
    public ConvidadosController(ConvidadoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String listaConvidados(Model model) {

        Iterable<Convidado> convidados = repository.findAll();

        model.addAttribute("convidados", convidados);

        return "listaconvidados";
    }

}
