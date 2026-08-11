# Aplicativo de Hábitos em Java — Projeto de Estudo

## 🎯 Objetivo

Este é um projeto de estudo criado com o propósito de aprender programação em Java na prática, partindo do zero até conceitos intermediários de Programação Orientada a Objetos (POO).

A ideia central é construir um **rastreador de hábitos** que permita:
- Cadastrar hábitos diários
- Marcar hábitos como concluídos
- Acompanhar sequências de dias consecutivos (streak)
- (Objetivo futuro) Visualizar um calendário no terminal, com emojis e cores representando os dias em que cada hábito foi cumprido ou não

## 🧠 Sobre o aprendizado

Este projeto foi construído de forma incremental, aprendendo um conceito novo a cada etapa:

- Estrutura básica de um programa Java (classes, método `main`)
- Uso de `ArrayList` para guardar coleções de dados
- Criação de métodos reutilizáveis
- Programação Orientada a Objetos: classes, atributos privados, construtores, encapsulamento e getters
- Uso de `Map` para associar datas a status (feito/não feito)
- Manipulação de datas com `LocalDate`
- Leitura de dados do usuário com `Scanner`
- Estruturas de controle: `if/else`, `while`, `for` e `for-each`
- Normalização de texto (remoção de acentos) para buscas mais tolerantes
- Fluxo de trabalho com Git: commits organizados por etapa, branches por funcionalidade (`feature/...`), merge e push

## ⚙️ Funcionalidades implementadas até agora

- [x] Cadastro de hábitos (nome + emoji)
- [x] Listagem de hábitos cadastrados
- [x] Marcação de hábito como concluído no dia atual
- [x] Marcação de hábito como concluído em uma data específica (dia/mês/ano)
- [x] Cálculo de streak (dias consecutivos concluídos, contando a partir de hoje)
- [x] Menu interativo com opções numeradas, rodando em loop até o usuário escolher sair
- [x] Busca de hábito por nome tolerante a acentos e maiúsculas/minúsculas

## 🔜 Próximos passos planejados

- [ ] Consulta de histórico por intervalo de datas (base para o calendário)
- [ ] Visualização de calendário no terminal: cada hábito exibido com seu emoji/cor nos dias concluídos, e vermelho nos dias não concluídos
- [ ] Possível evolução futura para interface gráfica (JavaFX), separando a lógica da interface

## 🗂️ Estrutura do projeto

```
Habito/
├── Habito.java     → Classe que representa um hábito (nome, emoji, histórico de dias, cálculo de streak)
├── Main.java       → Ponto de entrada do programa, com o menu interativo
├── img/            → Prints de progresso do projeto
└── README.md       → Este arquivo
```

## 🌱 Fluxo de trabalho (Git)

O projeto segue um fluxo simples de branches por funcionalidade:

1. Cada nova funcionalidade é desenvolvida em uma branch própria (ex: `feature/calcular-streak`)
2. Commits são feitos em pontos de "estado estável" — quando o código compila e funciona
3. Após testar e validar a funcionalidade, a branch é mesclada (`merge`) na `main`
4. As mudanças são então enviadas ao repositório remoto (`push`)

## 🛠️ Tecnologias

- **Java** (JDK 26)
- Bibliotecas padrão: `java.util` (ArrayList, Scanner, Map, HashMap), `java.time` (LocalDate), `java.text` (Normalizer)

## 👤 Autor

Desenvolvido por **Samuel Berto**, como projeto de estudo para aprender Java.
