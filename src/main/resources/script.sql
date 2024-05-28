--RELACIONAMENTOS:
--1. Um endereço pode estar associado a muitos projetos: "1 endereço : N projetos".
--2. Cada projeto é submetido por um único usuário: "projeto 1 : 1 usuário".
--3. Um projeto pode receber votos de muitos usuários: "projeto 1 : N votos".
--4. Cada voto é feito por um único usuário: "voto N : 1 usuário".

CREATE TABLE usuario (
   id SERIAL PRIMARY KEY,
   nome TEXT NOT NULL,
   cpf TEXT NOT NULL,
   data_nascimento DATE NOT NULL
);

CREATE TABLE endereco (
   id SERIAL PRIMARY KEY,
   rua TEXT NOT NULL,
   cep TEXT,
   bairro TEXT,
   municipio TEXT,
   estado TEXT,
   coordenadaX TEXT,
   coordenadaY TEXT
);

CREATE TABLE projeto (
   id SERIAL PRIMARY KEY,
   nome TEXT NOT NULL,
   descricao TEXT,
   fkEndereco INT REFERENCES endereco(id),
   dataCriacao DATE,
   fkCriador INT REFERENCES usuario(id)
);

CREATE TABLE voto (
   id SERIAL PRIMARY KEY,
   fkProjetoVotado INT REFERENCES projeto(id),
   fkUsuario INT REFERENCES usuario(id),
   dataCriacao DATE
);