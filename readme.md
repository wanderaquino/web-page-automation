# Testes Funcionais Automatizados
## Descrição
Aplicação desenvolvida para antender ao requisito de testes funcionais automatizados.

## Stack
- [Oracle Java]
- [Selenium WebDriver]
- [Maven]
- [Junit]
- [Google Chrome]

## Instalação

Esse projeto foi desenvolvido utilizando a linguagem Oracle Java na versão da JDK 18, usando JUnit 4, SeleniumWebdriver, Apache Maven e ChromeDriver em sua versão 102.

- Pré-requisitos: Java JDK 18 e Apache Maven previamente instalados

Uma vez instalados os itens acima, e clonado o repositório localmente

1. Navegar até o diretório raiz do projeto:

```sh
cd ParanaBancoChallenge
```
2. Executar o comando:

```sh
 mvn test
```

3. O Maven irá buildar a aplicação e executar em seguida os testes. Observar que os testes serão executados com a opção --headless do chrome, sendo assim, não haverá browser evidenciando as interações.

4. O resultado dos testes será exibido no console - juntamente com o build:

```sh
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  24.697 s
[INFO] Finished at: 2022-06-14T23:01:43-03:00
[INFO] ------------------------------------------------------------------------
```


[Oracle Java]: <https://www.java.com/>
[Selenium WebDriver]: <https://www.selenium.dev/>
[Maven]: <https://maven.apache.org/>
[Junit]: <https://junit.org/>
[Google Chrome]: <https://www.google.com/intl/pt-BR/chrome/>
