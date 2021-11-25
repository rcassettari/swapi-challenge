git <h2>API REST de Consulta a dados do filme Star Wars Spring Boot</h2>

(A) REQUISITO PRINCIPAL IMPORTANTE para rodar: baixar o programa, mudar a string de conexão com o banco de dados MySQL para que tenha um nome de servidor válido e um usuário e senha válidos. A mudança deverá ocorrer no arquivo application.properties , nas linhas indicadas abaixo :

```
spring.datasource.url=jdbc:mysql://localhost/starWars?createDatabaseIfNotExist=true&useSSL=true

spring.datasource.username=root

spring.datasource.password=fiap
```

Para o projeto foi usado o banco de dados MySQL versão 5.7;

(B) UMA VEZ CONFIGURADA corretamente a string de conexão, feito o build e levantada a aplicação, as tabelas de banco de dados são criadas automaticamente, já que há um migration de banco de dados contido no projeto, em resources/db/migration, e estamos usando FlyWay para carregar as mudanças de banco de dados diretamente no MySQL.

(B1) Porém, caso seja necessário mesmo assim, o script para criação inicial do banco de dados e dos usuários iniciais é esse :

Exemplo: [Script para tabelas do banco de dados e usuários](https://github.com/rcassettari/swapi-challenge/tree/master/src/main/resources/db/migration)

(C) Para obter um token de acesso é necessário fazer um POST no URL:

```
http://localhost:8080/oauth/token
```

NOTE: Não há login que mantenha estado, o API é stateless. Poderia ser feito um token simples mantido em sessão, mas isso seria ruim pois tornaria a API dependente de sessão o que geraria a necessidade de implementar um mecanismo para controle de sessões caso o API fosse usado em ambiente de nuvem em várias instâncias de execução, por exemplo.
Caso haja futuramente a necessidade de registrar quando um cliente fez o acesso, há outras maneiras, como eventos.

O POST que obtêm o token de acesso deverá conter, usando Basic Authentication:

```
- Username : correspondente ao clientId da aplicação chamadora do API;
- Password : correspondente ao client secret;
```

NOTE: Poderíamos colocar diversas aplicações como cliente, porém, por conveniência, colocamos apenas uma, com as seguintes configurações no arquivo application.properties:

```
swapiChallenge.authorizationServer.client.clientId=angular
swapiChallenge.authorizationServer.client.secret=@fter@tt
swapiChallenge.authorizationServer.client.accessTokenValiditySeconds=2000
swapiChallenge.authorizationServer.client.refreshTokenValiditySeconds=86400
```

O Body x-www-form-urlencoded deverá conter : 

```
- client : correspondente ao clientId da aplicação chamadora do API;
- username : correspondente ao usuário FINAL enviado pela aplicação, cadastrado em tabela do banco de dados MySQL;
- password : correspondente ao password do usuário FINAL enviado pela aplicação, cadastrado em tabela do banco de dados MySQL;
- grant_type : password 
```

Foram usados tokens JWT para esse projeto, inclusive com o uso de token de refresh.

A API REST desenvolvida serve para a consulta de algumas informações sobre o filme Star Wars, 
 a saber: 

1 - Consulta dos filmes da série:

http://localhost:8080/api/v1/filmes

1.1 - E para obter um filme específico:

http://localhost:8080/api/v1/filmes/{id}

2 - Consulta dos personagens da série:

http://localhost:8080/api/v1/pessoas

2.1 - E para obter um personagem específico:

http://localhost:8080/api/v1/pessoas/{id}

3 - Consulta dos planetas da série:

http://localhost:8080/api/v1/planetas

3.1 - E para obter um planeta específico:

http://localhost:8080/api/v1/planetas/{id}

4 - Foi desenvolvido um endPoint para cadastro de novos usuários e senhas:

http://localhost:8080/api/v1/usuarios

4.1 - Para troca de senha de um usuário, é necessário fazer o acesso da seguinte maneira:

http://localhost:8080/api/v1/usuarios/{id}/alterarSenha

A API serve como uma camada extra sobre uma API pré-existente, que disponibiliza os dados exibidos, a saber:

1 - Acesso a dados pré-existentes sobre os filmes da série:

```
https://swapi.dev/api/films
```

2 - Acesso a dados pré-existentes sobre os personagens da série:

```
https://swapi.dev/api/people
```

3 - Acesso a dados pré-existentes sobre os planetas da série:

```
https://swapi.dev/api/planets
```

Foram feitos e abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr;
* Desenvolvimento de modelos a partir dos dados de consulta ao API original (swapi.dev);
* Criação de um Rest Client usando o Feign Client;
* Criação de um serviço que invoca o Rest Client para chamar a API original (StarWarsService);
* Criação de controllers de acesso aos recursos filmes, pessoas e planetas, somente com métodos de consulta usando verbo http GET;
* Mapeamento do modelo dos recursos para outros modelos DTOs, traduzidos para o português, usando o MapStruct;
* Direcionamento do erro HTTP 500 da API swapi.dev para HTTP 404 quando um dos recursos não for encontrado, usando @ControllerAdvide e @ExceptionHandler;
* Desenvolvimento de tabelas do banco de dados MySQL e entities ORM correspondentes para uso na camada de segurança, bem como seu correspondente repositório;
* Criação de configuradores para o resource server e authorization server, usando password flow do OAuth2;
* Foram feitas validações simples nos DTOs de entrada, no caso de criação do usuário novo e da mudança de senha;
* Desenvolvimento de 1 teste unitário para validação de funcionalidade;
* Visualização das funcionalidades do API usando o Open-API:

```
http://localhost:8080/swagger-ui.html
```

* Foi habilitado o actuator na API, para facilitar o monitoramento da mesma.
  O endPoint do actuator está disponível em :

```
http://localhost:8080/actuator/health
```

São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido:

* Java 12 ou versões superiores.
* Maven 3.8.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Uma instância do MySQL, na sua máquina ou não, mas acessível pela rede onde a API irá rodar;

Abaixo, seguem links de referência usados no projeto:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* 
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
* [Referência para o springdoc-openapi](https://springdoc.org/)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup)
* [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)

* [Official Apache Maven docs](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-security)

### Guias
Os seguintes guias ilustram como usar algumas funcionalidades de forma concreta:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Links Adicionais
Essas referências adicionais também podem ajudar:

* [Declarative REST calls with Spring Cloud OpenFeign sample](https://github.com/spring-cloud-samples/feign-eureka)



