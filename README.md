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
#### 

#### 

#### 

#### 

## Exemplo de implmentação

