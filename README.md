# State
## Objetivo
Quando operações tem comandos condicionais grandes, de várias alternativas, que dependem do estado do objeto. Esse estado é normalmente representado por uma ou mais constantes enumeradas. Frequentemente, várias operações conterão essa mesma estrutura condicional. O padrão State coloca cada ramo do comando adicional em uma classe separada. Isto lhe permite tratar o estado do objeto como um objeto propriamente dito, que pode varia independentemente de outro objetos.
## Motivação
A idéia chave deste padrão é introduzir uma classe abstrata chamada TCPState para representar os estados da conexão na rede. A classe TCPState declara uma interface comum para todas as classes que representam diferentes estados operacionais. As sublclasses de TCPState implementam comportamentos específicos ao estado.
## Aplicabilidade
O padrão State deve ser usado quando o comportamento do objeto depende do seu estado e ele pode mudar seu comportamento em tempo e execução, dependendo desse estado.
## Estrutura 
![State](https://www.devmedia.com.br/imagens/articles/208953/state1.PNG)
## Participantes
O contexto é a classe que pode ter vários estados internos diferentes.
A interface estado define uma interface comum para todos os estados concretos. Como são intervambiaveis, todos devem implementar a mesma interface.
Os estado concretos (podemos ter vários estados concretos) lidam com as solicitações provenientes do contexto. Cada estado concreto fornece a sua própria implementação de uma solicitação. Assim, quando o contexto muda de estado, seu comportamento também muda.
Sempre que uma solicitação() é feita ao contexto, ela é delegada ao estado apropriado para ser processado.

## Exemplo de implmentação

