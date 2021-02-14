<h1 align="center"> Modelo de Teste </h1>


## Objetivo:

Este documento descreve o plano para testar a aplicação Order – My Store. Este documento visa dar suporte aos seguintes objetivos:
1. Validar se é possível buscar um produto
2. Validar se é possível selecionar um produto e adicioná-lo ao carrinho
3. Validar que o produto adicionado ao carrinho é realmente o produto desejado


## Limitações e desafios encontrados: 
1.	Não foi disponibilizada uma documentação que descreva a aplicação e suas funcionalidades
2.	Os requisitos não foram disponibilizados	


## Tipo da aplicação: 
Aplicação WEB


## Aplicação de heurísticas para descobrir o funcionamento da aplicação:

Aplicando a Heurística “Goldilocks” foi possível identificar que o campo de pesquisa principal não limita a quantidade de caracteres que pode ser inserida. Essa inconsistência além de gerar estouro do campo, pode ocasionar em uma experiência não muito boa para o usuário.
Utilizando a Heurística CHIQUE foi possível identificar que a usabilidade dos menus apresenta um tempo considerável até que seja mostrado e novamente ao sair dele o mesmo ainda fica exibido por alguns segundos.
 
## Fluxo de Testes:

Baseado nas informações acima descritas e no desafio proposto, o seguinte teste funcional pode ser executado:

<i>Teste Manual</i>

Acessar a página [My Store](http://automationpractice.com/index.php)

No campo “Search” digitar “Blouse” e pressionar enter

O sistema deve mostrar o item buscado

Clicar em “Add to cart”

O sistema deve exibir um alerta confirmando a adição do produto ao carrinho

Clicar em “Proceed to checkout”

Deve ser exibida a tela. 
 
<i> Aqui você encontra o projeto do teste</i> [Automatizado](https://github.com/zero7um/LemoneyTest/tree/master/src) 


## Inconsistências encontradas:
1. o recurso de auto completar está com uma demora considerável em completar palavras, isso pode tornar a experiência do usuário menos interessante. O tempo longo pode fazer com que um cliente perca o interesse em finalizar a compra ou até mesmo em utilizar o site.
2. A performance do front end pode ser melhorada afim de tornar a experiência do usuário mais agradável. Através do uso da ferramenta [Page Speed Insights](https://developers.google.com/speed/pagespeed/insights/?hl=pt-br) é possível analisar diversas inconsistências que tem aumentado o tempo de resposta do Front end
3. O tempo de resposta do servidor demonstrou estar longo 



