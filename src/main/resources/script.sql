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
   coordenadax TEXT,
   coordenaday TEXT
);

CREATE TABLE projeto (
   id SERIAL PRIMARY KEY,
   nome TEXT NOT NULL,
   descricao TEXT,
   endereco_id INT REFERENCES endereco(id),
   data_criacao DATE,
   usuario_id INT REFERENCES usuario(id),
   status_projeto SMALLINT NOT NULL DEFAULT 0 -- 0: EM_ANALISE, 1: PUBLICADO, 2: REPROVADO
);

CREATE TABLE voto (
   id SERIAL PRIMARY KEY,
   projeto_id INT REFERENCES projeto(id),
   usuario_id INT REFERENCES usuario(id),
   data_criacao DATE,
   CONSTRAINT unique_voto UNIQUE (projeto_id, usuario_id)
);