INSERT INTO usuario (id, nome, cpf, data_nascimento) 
VALUES 
    (1, 'Ana Maria', '123.456.789-01', '1980-01-15'),
    (2, 'Carlos Eduardo', '234.567.890-12', '1990-02-20'),
    (3, 'Beatriz Silva', '345.678.901-23', '1985-03-25'),
    (4, 'Daniel Oliveira', '456.789.012-34', '1992-04-30'),
    (5, 'Eduarda Lima', '567.890.123-45', '1988-05-05'),
    (6, 'Felipe Souza', '678.901.234-56', '1995-06-10'),
    (7, 'Gabriela Costa', '789.012.345-67', '1982-07-15'),
    (8, 'Henrique Santos', '890.123.456-78', '1998-08-20'),
    (9, 'Isabela Pereira', '901.234.567-89', '1987-09-25'),
    (10, 'João Pedro', '012.345.678-90', '1993-10-30'),
    (11, 'Karina Alves', '123.456.789-12', '1991-11-05'),
    (12, 'Leonardo Fernandes', '234.567.890-23', '1983-12-10'),
    (13, 'Mariana Rocha', '345.678.901-34', '1996-01-15'),
    (14, 'Nicolas Ribeiro', '456.789.012-45', '1989-02-20'),
    (15, 'Olivia Martins', '567.890.123-56', '1984-03-25'),
    (16, 'Paulo Araujo', '678.901.234-67', '1997-04-30'),
    (17, 'Quirino Barros', '789.012.345-78', '1981-05-05'),
    (18, 'Raquel Nascimento', '890.123.456-89', '1994-06-10'),
    (19, 'Samuel Borges', '901.234.567-90', '1986-07-15'),
    (20, 'Tatiana Almeida', '012.345.678-12', '1999-08-20');

INSERT INTO endereco (rua, cep, bairro, municipio, estado, coordenadax, coordenaday) 
VALUES 
    ('Rua das Flores', '12345-678', 'Centro', 'São Paulo', 'SP', '-23.550520', '-46.633308'),
    ('Avenida Paulista', '12345-679', 'Bela Vista', 'São Paulo', 'SP', '-23.561399', '-46.656578'),
    ('Rua XV de Novembro', '12345-680', 'Centro', 'Curitiba', 'PR', '-25.428356', '-49.273251'),
    ('Avenida Sete de Setembro', '12345-681', 'Centro', 'Salvador', 'BA', '-12.973040', '-38.502304'),
    ('Rua dos Andradas', '12345-682', 'Centro', 'Porto Alegre', 'RS', '-30.027704', '-51.228735'),
    ('Rua da Aurora', '12345-683', 'Boa Vista', 'Recife', 'PE', '-8.054278', '-34.881302'),
    ('Rua das Palmeiras', '12345-684', 'Botafogo', 'Rio de Janeiro', 'RJ', '-22.949590', '-43.185780'),
    ('Avenida Atlântica', '12345-685', 'Copacabana', 'Rio de Janeiro', 'RJ', '-22.971177', '-43.182543'),
    ('Rua Afonso Pena', '12345-686', 'Centro', 'Belo Horizonte', 'MG', '-19.917298', '-43.934559'),
    ('Rua Barão de Itapetininga', '12345-687', 'República', 'São Paulo', 'SP', '-23.546509', '-46.641525'),
    ('Rua Voluntários da Pátria', '12345-688', 'Santana', 'São Paulo', 'SP', '-23.507420', '-46.625320'),
    ('Rua da Bahia', '12345-689', 'Funcionários', 'Belo Horizonte', 'MG', '-19.932848', '-43.938284'),
    ('Rua Santa Catarina', '12345-690', 'Lourdes', 'Belo Horizonte', 'MG', '-19.932436', '-43.942314'),
    ('Rua Augusta', '12345-691', 'Consolação', 'São Paulo', 'SP', '-23.551439', '-46.644684'),
    ('Avenida Brasil', '12345-692', 'Centro', 'Curitiba', 'PR', '-25.427778', '-49.267525'),
    ('Avenida Ipiranga', '12345-693', 'República', 'São Paulo', 'SP', '-23.545610', '-46.637583'),
    ('Rua da Carioca', '12345-694', 'Centro', 'Rio de Janeiro', 'RJ', '-22.908888', '-43.177444'),
    ('Rua do Amparo', '12345-695', 'Olinda', 'Olinda', 'PE', '-8.006561', '-34.855012'),
    ('Rua do Lima', '12345-696', 'Santo Amaro', 'Recife', 'PE', '-8.062094', '-34.880562'),
    ('Avenida Beira Mar', '12345-697', 'Meireles', 'Fortaleza', 'CE', '-3.718394', '-38.495098');

INSERT INTO projeto (nome, descricao, data_criacao, endereco_id, usuario_id) 
VALUES 
    ('Projeto de Transporte Elétrico', 'Implementação de ônibus e estações de recarga elétrica para promover o uso de veículos elétricos no transporte público.', '2024-06-01', 2, 4),
    ('Projeto de Turismo Sustentável', 'Desenvolvimento de roteiros turísticos ecológicos e programas de conscientização ambiental para turistas.', '2024-06-01', 3, 5),
    ('Projeto de Resiliência Urbana', 'Fortalecimento da infraestrutura urbana para resistir a desastres naturais e mudanças climáticas.', '2024-06-01', 4, 6),
    ('Projeto de Energia Solar', 'Instalação de painéis solares em edifícios públicos e residenciais para aumentar o uso de energia solar.', '2024-06-01', 5, 7),
    ('Projeto de Inclusão Social', 'Criação de programas de apoio e inclusão social para pessoas em situação de vulnerabilidade.', '2024-06-01', 6, 8),
    ('Projeto de Urbanização de Favelas', 'Melhoria das condições de vida em favelas através da urbanização e oferta de serviços básicos.', '2024-06-01', 7, 9),
    ('Projeto de Qualidade da Água', 'Monitoramento e melhoria da qualidade da água para garantir o acesso a água potável para todos.', '2024-06-01', 8, 10),
    ('Projeto de Valorização Cultural', 'Promoção de eventos culturais e artísticos para valorizar a cultura local e regional.', '2024-06-01', 9, 11),
    ('Projeto de Infraestrutura Verde', 'Criação de corredores verdes e telhados verdes para melhorar a qualidade do ar e promover a biodiversidade urbana.', '2024-06-01', 10, 12),
    ('Projeto de Tecnologia Verde', 'Desenvolvimento e implementação de tecnologias sustentáveis para reduzir o impacto ambiental.', '2024-06-01', 11, 13),
    ('Projeto de Economia Circular', 'Fomento à economia circular através da redução, reutilização e reciclagem de materiais.', '2024-06-01', 12, 14),
    ('Projeto de Saúde Comunitária', 'Construção de clínicas de saúde e promoção de campanhas de prevenção de doenças em comunidades de baixa renda.', '2024-06-01', 13, 15),
    ('Projeto de Educação para Todos', 'Criação de centros educacionais gratuitos para crianças e adultos, com foco em alfabetização e capacitação profissional.', '2024-06-01', 14, 16),
    ('Projeto de Segurança Pública', 'Instalação de câmeras de segurança e melhoria da iluminação pública para aumentar a segurança nas áreas urbanas.', '2024-06-01', 15, 17),
    ('Projeto de Reciclagem e Reutilização', 'Implementação de programas de reciclagem e reutilização de resíduos sólidos para reduzir o impacto ambiental.', '2024-06-01', 16, 18),
    ('Projeto de Agricultura Urbana', 'Criação de hortas comunitárias em áreas urbanas para promover a segurança alimentar e a sustentabilidade.', '2024-06-01', 17, 19),
    ('Projeto de Mobilidade Sustentável', 'Implementação de ciclovias e calçadas acessíveis, incentivo ao uso de transportes públicos e criação de zonas de pedestres para promover a mobilidade sustentável na cidade.', '2024-06-01', 18, 20),
    ('Projeto de Energias Renováveis', 'Desenvolvimento de usinas solares e eólicas para aumentar a participação de energias renováveis na matriz energética da cidade.', '2024-06-01', 19, 1),
    ('Projeto de Inclusão Digital', 'Fornecimento de acesso à internet e capacitação em tecnologia da informação para comunidades carentes.', '2024-06-01', 20, 2),
    ('Projeto de Revitalização de Espaços Públicos', 'Reforma de praças e parques urbanos, com a instalação de equipamentos de lazer e áreas verdes.', '2024-06-01', 1, 3);



INSERT INTO voto (projeto_id, usuario_id, data_criacao) 
VALUES 
    (1, 1, '2024-06-01'),
    (2, 2, '2024-06-02'),
    (3, 3, '2024-06-03'),
    (4, 4, '2024-06-04'),
    (5, 5, '2024-06-05'),
    (6, 6, '2024-06-06'),
    (7, 7, '2024-06-07'),
    (8, 8, '2024-06-08'),
    (9, 9, '2024-06-09'),
    (10, 10, '2024-06-10'),
    (11, 11, '2024-06-11'),
    (12, 12, '2024-06-12'),
    (13, 13, '2024-06-13'),
    (14, 14, '2024-06-14'),
    (15, 15, '2024-06-15'),
    (16, 16, '2024-06-16'),
    (17, 17, '2024-06-17'),
    (18, 18, '2024-06-18'),
    (19, 19, '2024-06-19'),
    (20, 20, '2024-06-20'),
    (1, 2, '2024-06-21'),
    (2, 3, '2024-06-22'),
    (3, 4, '2024-06-23'),
    (4, 5, '2024-06-24'),
    (5, 6, '2024-06-25'),
    (6, 7, '2024-06-26'),
    (7, 8, '2024-06-27'),
    (8, 9, '2024-06-28'),
    (9, 10, '2024-06-29'),
    (10, 11, '2024-06-30'),
    (11, 12, '2024-07-01'),
    (12, 13, '2024-07-02'),
    (13, 14, '2024-07-03'),
    (14, 15, '2024-07-04'),
    (15, 16, '2024-07-05'),
    (16, 17, '2024-07-06'),
    (17, 18, '2024-07-07'),
    (18, 19, '2024-07-08'),
    (19, 20, '2024-07-09'),
    (20, 1, '2024-07-10'),
    (1, 3, '2024-07-11'),
    (2, 4, '2024-07-12'),
    (3, 5, '2024-07-13'),
    (4, 6, '2024-07-14'),
    (5, 7, '2024-07-15'),
    (6, 8, '2024-07-16'),
    (7, 9, '2024-07-17'),
    (8, 10, '2024-07-18'),
    (9, 11, '2024-07-19'),
    (10, 12, '2024-07-20'),
    (11, 13, '2024-07-21'),
    (12, 14, '2024-07-22'),
    (13, 15, '2024-07-23'),
    (14, 16, '2024-07-24'),
    (15, 17, '2024-07-25'),
    (16, 18, '2024-07-26'),
    (17, 19, '2024-07-27'),
    (18, 20, '2024-07-28'),
    (19, 1, '2024-07-29'),
    (20, 2, '2024-07-30'),
    (1, 4, '2024-08-01'),
    (2, 5, '2024-08-02'),
    (3, 6, '2024-08-03'),
    (4, 7, '2024-08-04'),
    (5, 8, '2024-08-05'),
    (6, 9, '2024-08-06'),
    (7, 10, '2024-08-07'),
    (8, 11, '2024-08-08'),
    (9, 12, '2024-08-09'),
    (10, 13, '2024-08-10'),
    (11, 14, '2024-08-11'),
    (12, 15, '2024-08-12'),
    (13, 16, '2024-08-13'),
    (14, 17, '2024-08-14'),
    (15, 18, '2024-08-15'),
    (16, 19, '2024-08-16'),
    (17, 20, '2024-08-17'),
    (18, 1, '2024-08-18'),
    (19, 2, '2024-08-19'),
    (20, 3, '2024-08-20'),
    (1, 5, '2024-08-21'),
    (2, 6, '2024-08-22'),
    (3, 7, '2024-08-23'),
    (4, 8, '2024-08-24'),
    (5, 9, '2024-08-25'),
    (6, 10, '2024-08-26'),
    (7, 11, '2024-08-27'),
    (8, 12, '2024-08-28'),
    (9, 13, '2024-08-29'),
    (10, 14, '2024-08-30'),
    (11, 15, '2024-08-31'),
    (12, 16, '2024-09-01'),
    (13, 17, '2024-09-02'),
    (14, 18, '2024-09-03'),
    (15, 19, '2024-09-04'),
    (16, 20, '2024-09-05'),
    (17, 1, '2024-09-06'),
    (18, 2, '2024-09-07'),
    (19, 3, '2024-09-08'),
    (20, 4, '2024-09-09'),
    (1, 6, '2024-09-10'),
    (2, 7, '2024-09-11'),
    (3, 8, '2024-09-12'),
    (4, 9, '2024-09-13'),
    (5, 10, '2024-09-14'),
    (6, 11, '2024-09-15'),
    (7, 12, '2024-09-16'),
    (8, 13, '2024-09-17'),
    (9, 14, '2024-09-18'),
    (10, 15, '2024-09-19'),
    (11, 16, '2024-09-20'),
    (12, 17, '2024-09-21'),
    (13, 18, '2024-09-22'),
    (14, 19, '2024-09-23'),
    (15, 20, '2024-09-24'),
    (16, 1, '2024-09-25'),
    (17, 2, '2024-09-26'),
    (18, 3, '2024-09-27'),
    (19, 4, '2024-09-28'),
    (20, 5, '2024-09-29'),
    (1, 7, '2024-09-30'),
    (2, 8, '2024-10-01'),
    (3, 9, '2024-10-02'),
    (4, 10, '2024-10-03'),
    (5, 11, '2024-10-04'),
    (6, 12, '2024-10-05'),
    (7, 13, '2024-10-06'),
    (8, 14, '2024-10-07'),
    (9, 15, '2024-10-08'),
    (10, 16, '2024-10-09'),
    (11, 17, '2024-10-10'),
    (12, 18, '2024-10-11'),
    (13, 19, '2024-10-12'),
    (14, 20, '2024-10-13'),
    (15, 1, '2024-10-14'),
    (16, 2, '2024-10-15'),
    (17, 3, '2024-10-16'),
    (18, 4, '2024-10-17'),
    (19, 5, '2024-10-18'),
    (20, 6, '2024-10-19'),
    (1, 8, '2024-10-20'),
    (2, 9, '2024-10-21'),
    (3, 10, '2024-10-22'),
    (4, 11, '2024-10-23'),
    (5, 12, '2024-10-24'),
    (6, 13, '2024-10-25'),
    (7, 14, '2024-10-26'),
    (8, 15, '2024-10-27'),
    (9, 16, '2024-10-28'),
    (10, 17, '2024-10-29'),
    (11, 18, '2024-10-30'),
    (12, 19, '2024-10-31'),
    (13, 20, '2024-11-01'),
    (14, 1, '2024-11-02'),
    (15, 2, '2024-11-03'),
    (16, 3, '2024-11-04'),
    (17, 4, '2024-11-05'),
    (18, 5, '2024-11-06'),
    (19, 6, '2024-11-07'),
    (20, 7, '2024-11-08'),
    (1, 9, '2024-11-09'),
    (2, 10, '2024-11-10'),
    (3, 11, '2024-11-11')