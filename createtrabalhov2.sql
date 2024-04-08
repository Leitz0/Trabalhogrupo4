--create schema grupo4;

create table grupo4.cliente (
	idcliente serial primary key,
	nome varchar (80),
	cpf varchar (11),
	dtnascimento date,
	endereco varchar (120),
	telefone varchar(15)
);

create table grupo4.produto (
	idproduto serial primary key,
	descricao varchar(150),
	vlcusto double precision,
	vlvenda double precision,
	categoria varchar(30)
);

create table grupo4.pedidoitens(
	idpedidoitem serial primary key,
	idproduto integer references grupo4.produto,
	vlunitario double precision,
	qtproduto int,
	vldesconto double precision
);

create table grupo4.pedido(
	idpedido serial primary key,
	idcliente integer references grupo4.cliente,
	idpedidoitem integer references grupo4.pedidoitens,
	dtemissao date,
	dtentrega date,
	valortotal double precision,
	observacao varchar (100)
);

INSERT INTO grupo4.cliente (nome, cpf, dtnascimento, endereco, telefone)
VALUES
    ('Ana Silva', '12345678901', '1990-05-15', 'Rua A, 123', '(11) 98765-4321'),
    ('Pedro Oliveira', '98765432109', '1985-10-20', 'Avenida B, 456', '(22) 12345-6789'),
    ('Maria Pereira', '45678901234', '1978-03-08', 'Travessa C, 789', '(33) 55555-5555'),
    ('Carlos Santos', '78901234567', '1993-07-25', 'Rua D, 456', '(44) 33333-3333'),
    ('Juliana Souza', '01234567890', '1980-11-30', 'Avenida E, 789', '(55) 99999-9999');

INSERT INTO grupo4.produto (descricao, vlcusto, vlvenda, categoria)
VALUES
    ('Bolo de Chocolate', 10.0, 25.0, 'Bolos'),
    ('Cupcake de Morango', 3.5, 7.0, 'Cupcakes'),
    ('Torta de Limão', 12.0, 30.0, 'Tortas'),
    ('Brigadeiro', 1.0, 2.5, 'Doces'),
    ('Pão de Mel', 2.5, 5.0, 'Doces'),
    ('Torta de Morango', 15.0, 35.0, 'Tortas'),
    ('Cupcake de Chocolate', 3.0, 6.0, 'Cupcakes'),
    ('Bolo de Cenoura', 8.0, 20.0, 'Bolos'),
    ('Pudim de Leite', 6.0, 15.0, 'Sobremesas'),
    ('Torta de Chocolate', 14.0, 32.0, 'Tortas');

