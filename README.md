# CommandPackGK

## Descrição

Este é um pacote de comandos para Minecraft, projetado para fornecer funcionalidades adicionais ao jogo. O pacote inclui comandos que realizam ações específicas e outras funcionalidades que independem da digitação do jogador, os ouvidins: listeners que executam algo em determinadas situações.

### CPrincipal
Esta é apenas a classe principal do CommandPack, onde os comandos e "ouvidins" são registrados.

## Comandos

### ComandoAcampamento
Este comando leva o Player até o acampamento.

### ComandoCasa
Usando este comando, o Player é teletransportado para sua casa.

### ComandoFlor
Este comando gera flores no local onde o Player está olhando, permitindo personalizar o ambiente com cores vibrantes.

### ComandoVoltarLocalMorte
Com este comando, os Players podem retornar ao local onde morreram, facilitando a recuperação de itens e experiências perdidas.

## Ouvidins

### OuvidinCama
Um escutador que reage ao evento de um Player entrar ou sair da cama. Ele envia mensagens personalizadas com base no horário e na situação do Player.

### OuvidinMorte
Este escutador monitora os eventos de morte dos jogadores e é usado no ComandoVoltarLocalMorte, guardando as informações de localização do Player.

## Instalação

1. Baixe o pacote de comandos.
2. Coloque o arquivo `.jar` na pasta `plugins` do seu servidor Minecraft.
3.0 Reinicie o servidor para que o plugin seja carregado.
3.1. Ou digite no chat "/reload" e depois "/reload confirm", sem as aspas.
3.1.1. OBS: Essa não é uma prática recomendada, mas é mais rápida.

## Uso

Após a instalação, os comandos podem ser usados diretamente no chat do jogo. Para obter ajuda sobre os comandos do pacote, use o comando `/help CommandPackGK` 

## Contribuidores 
- [João Gabriel Aguiar](https://github.com/Jot4g3)
- [Kauã Sousa](https://github.com/kkauaon)

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
