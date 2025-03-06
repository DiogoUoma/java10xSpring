package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missoes Listadas";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao Criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }

    @PutMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";
    }

}
