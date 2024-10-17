package com.example.cnpjconsulta.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CnpjService {

    private final String API_URL = "https://receitaws.com.br/v1/cnpj/";

    public String consultaCNPJ(String cnpj) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + cnpj;

        // Faz a requisição GET para a API ReceitaWS
        String response = restTemplate.getForObject(url, String.class);

        if (response == null || response.isEmpty()) {
            throw new Exception("Dados não encontrados para o CNPJ informado.");
        }

        return response;
    }
}
