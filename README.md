# Matriz Recursiva em Java

Este projeto contém um exemplo de como criar e exibir uma matriz de forma recursiva em Java. O código permite que o usuário insira os valores para cada posição da matriz e, em seguida, a exibe utilizando recursão.

## Funcionalidades

- **Criação de Matriz**: O programa solicita ao usuário o número de linhas e colunas da matriz e, em seguida, permite que ele insira os valores para cada posição.
- **Exibição Recursiva**: A matriz é exibida na tela de forma recursiva, linha por linha.

## Estrutura do Código

### Função `criarMatriz`

- Recebe o número de linhas e colunas e cria uma matriz de inteiros.
- Solicita ao usuário que insira os valores para cada posição da matriz.

### Função `exibirMatrizRecursivo`

- Exibe a matriz na tela de forma recursiva.
- A recursão é realizada para percorrer todas as linhas e colunas da matriz.

### Função `main`

- Controla a execução do programa, chamando as funções de criação e exibição da matriz.

## Como Executar

1. Clone o repositório para o seu computador:

   git clone https://github.com/gustavotramaring/matrizRecursiva.git

2. Navegue até o diretório do projeto:
   
   cd matriz-recursiva

3. Compile e execute o código:

   javac matrizRecursiva.java
   java matrizRecursiva

##Exemplo de execução

- Digite o número de linhas: 2
- Digite o número de colunas: 3
- Digite o valor para a posição [0][0]: 1
- Digite o valor para a posição [0][1]: 2
- Digite o valor para a posição [0][2]: 3
- Digite o valor para a posição [1][0]: 4
- Digite o valor para a posição [1][1]: 5
- Digite o valor para a posição [1][2]: 6

Matriz criada:
- 1 2 3
- 4 5 6
