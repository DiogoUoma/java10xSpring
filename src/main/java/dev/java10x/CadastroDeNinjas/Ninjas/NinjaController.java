package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String BoasVindas() {
        return "Essa é minha primeira mensagem";
    }

    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/todosId")
    public String mostrarTodosOsNinjsaPorId() {
        return "Mostrar ninja por id";
    }

    @PutMapping("/editarNinja")
    public String alterarNinjaPorId() {
        return "Alterar Ninja Por Id";
    }

    @DeleteMapping("/deletarId")
    public String deletarNinja() {
        return "Deletar Ninja";
    }
}
