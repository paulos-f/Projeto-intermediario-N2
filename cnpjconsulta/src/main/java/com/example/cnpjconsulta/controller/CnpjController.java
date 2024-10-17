package com.example.cnpjconsulta.controller;

import com.example.cnpjconsulta.service.CnpjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cnpj")
public class CnpjController {

    @Autowired
    private CnpjService cnpjService;

    @GetMapping("/{cnpj}")
    public ResponseEntity<String> consultaCNPJ(@PathVariable String cnpj) {
        try {
            // Chama o serviço que consulta a API ReceitaWS
            String result = cnpjService.consultaCNPJ(cnpj);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            // Retorna erro se houver falha na consulta
            return ResponseEntity.status(500).body("Erro ao consultar CNPJ: " + e.getMessage());
        }
    }

    @GetMapping("/sobre")
    public ResponseEntity<String> sobre() {
        // Retorna a rota "/sobre" com os dados exigidos
        return ResponseEntity.ok("""
           "estudante": "Paulo", "projeto": "Consulta de CNPJ"
        """);
    }
}
