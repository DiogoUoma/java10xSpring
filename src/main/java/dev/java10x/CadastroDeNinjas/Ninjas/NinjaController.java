package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String BoasVindas() {
        return "Essa é minha primeira mensagem";
    }

    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Todos os ninjas";
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
