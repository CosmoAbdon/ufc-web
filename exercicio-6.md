## Beans, Filtros e Sessão
### Exercício

* Implemente uma aplicação web com autenticação através de login. 
* A aplicação deve ter 2 perfis de usuário: `Professor` e `Aluno` 
* O aplicação deve utilizar a mesma página de login para autenticar professores ou alunos.
* A parte do conteúdo acessível para `quaisquer usuários` (inclusive não logados) deve ser possivel **visualizar a tabela de disciplinas**.
* A parte do conteúdo acessível apenas para `Aluno` deve ser possível **se matricular em disciplinas** e ver as próprias matrículas. 
* Ao fazer login como `Aluno`, o usuário deve ser automaticamente direcionado para a página do aluno, que deve conter o link para a página de matrícula
* A parte do conteúdo acessível apenas para `Professor` deve ser possível **cadastrar uma disciplina**.
* Ao fazer login como `Professor`, o usuário deve ser automaticamente direcionado para a página do professor, que deve conter o link para a página de cadastro de disciplinas.
