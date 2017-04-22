## Servlets - Controlador e Tratamento de Exceções
### Exercício

Crie uma sistema para cadastrar alunos, turmas, e matricular alunos em turmas. O sistema deve oferecer:

* Uma página inicial, no endereço raiz da aplicação, contendo o nome da aplicação e 3 links que levam às páginas de `alunos`, `turmas` e `matrículas`.
* A página de `alunos` deve apresentar uma tabela contendo as informações de todos os alunos (`id`, `nome`, `CPF`, `telefone` e `email`) e, abaixo, um link para a página de `cadastrar aluno`.
* A página de `cadastrar aluno` deve apresentar um formulário de cadastro contendo todos os atributos do aluno (menos o `id`, que deve ser sequencial e autogerado pela aplicação) e permitir o cadastro de um aluno através de requisição `POST`. Caso haja sucesso no cadastro, o usuário deve ser direcionado para a página de `alunos`, caso contrário, deve ser direcionado para uma página de erro personalizada para falha ao cadastrar aluno (implementar uma exceção específica para erro no cadastro de aluno e utilizar redirecionamento de erro para tratá-la).
* O cadastro de aluno deve falhar se algum dos campos estiver em branco.
* A página de `turmas` deve apresentar uma tabela contendo as informações cadastrais de todas as turmas (`código`, `disciplina`, `periodo`, `créditos`) e, abaixo, um link para a página de `cadastrar turma`
* A página de `cadastrar turma` deve apresentar um formulário de cadastro contendo todos os atributos de turma (incluindo o `código`, que deve ser único mas NÃO deve ser autogerado) e permitir o cadastro de uma turma através de requisição `POST`. Caso haja sucesso no cadastro, o usuário deve ser direcionado para a página de `turmas`, caso contrário, deve ser direcionado para uma página de erro personalizada para falha ao cadastrar turma (implementar uma exceção específica para erro no cadastro de turma e utilizar redirecionamento de erro para tratá-la).
* O cadastro de turma deve falhar se algum dos campos estiver em branco ou se o código de turma informado já existir.
* A página de `matrículas` deve apresentar uma tabela contendo as informações das matrículas (`código da turma`, `nome da disciplina`, `CPF do aluno`, `nome do aluno` e `periodo`) e, abaixo, um link para a página de `matricular`
* A página de `matricular` deve apresentar um formulário de cadastro contendo os campos de `id do aluno` e `codigo da turma`, realizando a matrícula do aluno do `id` informado na turma do `código de turma` informado, através de requisição `GET`. Caso haja sucesso no cadastro, o usuário deve ser direcionado para a página de `matrículas`, caso contrário, deve ser direcionado para uma página de erro personalizada para falha ao matricular (implementar uma exceção específica para erro na matrícula e utilizar redirecionamento de erro para tratá-la).
* A matrícula deve falhar se o CPF informado ou o código de turma informado não existirem na aplicação ou se o aluno já estiver matriculado naquela turma.
* Em caso de tentativa de acesso à páginas inexistentes (erro 404), redirecionar para a página inicial (raiz da aplicação).

### REQUISITOS IMPORTANTES
* Aplicar orientação a objetos de forma adequada para modelar a relação entre aluno e turma que representa as matrículas.
* Implementar classes específicas para gerenciar alunos e turmas separamente (ver classe [ContatoManager](https://github.com/andremeirelesa/ufc-web/blob/master/aula4/src/br/ufc/crateus/web/aula4/persistence/ContatosManager.java) no [projeto exemplo da aula 4](/aula4/)).
* Os nomes das colunas devem constar nas tabelas.

### RECOMENDAÇÕES
* Caso você não consiga implementar todas as funcionalidades, garanta que as funcionalidades que você implementou estejam funcionando bem, isso lhe garantirá uma nota maior do que códigos não funcionais.
