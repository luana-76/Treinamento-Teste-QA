Feature: Login no jogo

Scenario Outline: Login e senha validos

Given usuario esteja no site "https://guitarflash.com/?lg=pt"
And digitar "<email>", "<senha>" validos
When clicar no botao enviar
Then Entrarar no perfil
 
Examples:

| email                   | senha    |
|luana_dark34@hotmail.com | lua56sol |
