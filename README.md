# Projeto-intermediario-N2

## Descrição
O projeto "CNPJ Consulta" é um web service que permite a consulta de informações sobre empresas brasileiras através do CNPJ utilizando a API ReceitaWS. Este serviço oferece uma interface simples para acessar dados essenciais de empresas, facilitando a busca e o uso dessas informações.

## Requisitos
- Java 17+
- Maven
- Docker (opcional, para rodar em container)

## Estrutura do Projeto
- **CnpjService**: Serviço que faz a chamada à API ReceitaWS para consultar informações sobre o CNPJ.
- **CnpjController**: Controlador REST que gerencia as requisições e respostas.
- **CnpjconsultaApplication**: Classe principal que inicializa a aplicação.

## Rotas

### 1. GET `/cnpj/{cnpj}`
Consulta os dados da empresa com base no CNPJ informado.

**Exemplo de Requisição:**

### GET /cnpj/12345678000195

    {
      "status": "OK",
      "nome": "Empresa Exemplo LTDA",
      "fantasia": "Exemplo",
      "cnpj": "12345678000195",
      "tipo": "MATRIZ",
      "porte": "DEMAIS",
      "abertura": "2019-08-24",
      "atividade_principal": [
        {
          "code": "1234-5/67",
          "text": "Atividade de Exemplo"
        }
      ],
      "email": "contato@exemplo.com.br",
      "telefone": "(11) 1234-5678",
      "logradouro": "Rua Exemplo",
      "numero": "123",
      "complemento": "Sala 1",
      "bairro": "Centro",
      "municipio": "São Paulo",
      "uf": "SP",
      "cep": "01000-000",
      "situacao": "ATIVA",
      "data_situacao": "2019-08-24",
      "capital_social": "100000"
    }


### GET /cnpj/sobre

    {
      "estudante": "Paulo",
      "projeto": "Consulta de CNPJ"
    }


## Como Rodar o Projeto

### Localmente com Maven

Clone o repositório:

    git clone https://seu-repositorio-url.git
    cd cnpj-consulta
    
Rode o projeto:

    mvn spring-boot:run


### Executando via Docker
 1. Construir a imagem Docker: Certifique-se de que o Dockerfile e o docker-compose.yml estão configurados corretamente.

 2. Iniciar o container:

        docker-compose up --build
    
O serviço estará disponível na porta 8080 e pronto para atender às requisições.

## Contribuições

Sinta-se à vontade para contribuir com melhorias ou correções neste projeto. Sugestões e pull requests são bem-vindos!
