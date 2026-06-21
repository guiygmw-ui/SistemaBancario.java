# Sistema Bancário Simples em Java

Este é um projeto que simula as operações fundamentais de uma conta bancária através do console, desenvolvido para o meu portfólio.

## Funcionalidades

- Abertura de Conta: Cria uma conta com o nome do usuário.
- Guardar Dinheiro: Permite fazer depósitos na conta.
- Sacar Dinheiro: Permite fazer saques, testando se há saldo suficiente.
- Ver Extrato: Mostra o histórico de tudo o que você sacou ou guardou.

## O que eu usei nesse projeto

Para deixar o código organizado e profissional, eu apliquei:
- Orientação a Objetos: Separei o programa em duas partes (`Main` e `ContaBancaria`) para o código ficar mais organizado.
- Listas (ArrayList): Usei para salvar o histórico do extrato.
- Proteção contra Erros (Try-Catch): Se o usuário digitar uma letra no lugar de um número, o programa não trava; ele avisa que está errado e continua rodando.

## Como testar o projeto no seu computador

Você só precisa de 3 passos simples para rodar este código:

1. **Baixe os arquivos**: Baixe o `Main.java` e o `ContaBancaria.java` e coloque os dois dentro da mesma pasta no seu computador.
2. **Abra no seu editor**: Abra essa pasta no programa que você usa para programar (como o VS Code, IntelliJ ou Eclipse).
3. **Dê o Play**: Abra o arquivo `Main.java` e clique no botão de "Executar" (Play) do seu editor de código. O menu vai abrir direto na sua tela!

## Próximas Atualizações (Roadmap)

Este projeto continuará sendo evoluído! Em breve, pretendo adicionar:
- Banco de Dados: Para salvar o saldo e o histórico mesmo depois que o programa for fechado.
- Sistema de Login: Criar uma tela inicial para o usuário digitar agência, conta e senha.
- Transferências: Adicionar a opção de transferir dinheiro entre contas diferentes (via Pix).
