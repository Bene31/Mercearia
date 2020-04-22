USE mercearia;





create table mercearia.fornecedor (
id bigint not null auto_increment,
bairro varchar(255),
cep varchar(255),
cidade varchar(255),
cnpj varchar(255),
codigo varchar(255),
email varchar(255),
endereco varchar(255),
fax varchar(255),
insc varchar(255),
nome varchar(255),
numero integer,
telefone varchar(255),
uf varchar(255),
primary key (id)
);

create table produto (
id bigint not null auto_increment,
codigo varchar(255),
dataFab varchar(255),
dataVen varchar(255),
descricao varchar(255),
marca varchar(255),
quantidade integer,
tipo varchar(255),
valorCompra float,
valorVenda float,
fornecedor bigint,
primary key (id)
);

alter table produto 
add constraint FK_fj814yigeysljbgxnpg1jg0so 
foreign key (fornecedor) 
references fornecedor (id);

create table pedido (
id bigint not null auto_increment,
codigo varchar(255),
descricao varchar(255),
quantidade integer,
tipo varchar(255),
marca varchar(255),
primary key (id)
);

create table cliente (
id bigint not null auto_increment,
codigo varchar(255),
nome varchar(255),
telefone1 varchar(255),
telefone2 varchar(255),
cep varchar(255),
endereco varchar(255),
cidade varchar(255), 
bairro varchar(255),
complemento varchar(255),
numero integer,
email varchar(255),
saldo float,
primary key (id)
);


create table monitEnt (
id bigint not null auto_increment,
pedido bigint,
fornecedor bigint,
primary key (id)
);

alter table monitEnt 
add constraint FK_ped 
foreign key (pedido) 
references pedido (id);


alter table monitEnt 
add constraint FK_fj814yigeysljbgxnpg1jg0so
foreign key (fornecedor) 
references fornecedor (id);

create table monitSai(
id bigint not null auto_increment,
dataVenda varchar(255),
preco float,
produto bigint,
primary key (id)
);

alter table monitSai
add constraint FK_pro
foreign key (produto)
references produto(id);

create table caixa(
id int(5) AUTO_INCREMENT primary key,
produto bigint

);

alter table caixa
add constraint FK_pro
foreign key (produto)
references produto(id);

INSERT INTO `fornecedor`
       (`bairro`, `cep`, `cidade`, `cnpj`, `codigo`, `email`, `endereco`, `fax`,`insc`,`nome`,`numero`,`telefone`,`uf`)
VALUES ('a',       '1',   'a'     , 'a'  ,  'a',      'a',     'a',        'a',  'a',  'a',    1,     'a',      'a');


INSERT INTO `produto`
       (`codigo`, `dataFab`, `dataVen`, `descricao`, `marca`, `quantidade`, `tipo`, `valorCompra`,`valorVenda`, `fornecedor`)
VALUES ('a',       '1',       'a'         , 'a'  ,      'a',     1,           'a',     1.1,          1.1,         1);

INSERT INTO `pedido`
	   (`codigo`, `descricao`, `quantidade`, `tipo`,  `marca`)
VALUES ('a',        'a' ,       1,            'a',    'a');  

INSERT INTO `cliente`
       (`codigo`, `nome`, `telefone1`, `telefone2`, `cep`, `endereco`, `cidade`, `bairro`,`complemento`,`numero`,`email`,`saldo`)
VALUES ('a',       'a',    'a',         'a',        '1',    'a',       'a',        'a',   'a',           1,       'a',    1.1);

INSERT INTO `monitEnt`
		(`pedido`, `fornecedor`)
VALUES  (1, 		1);        

INSERT INTO `monitSai`
		(`dataVenda`, `preco`, `produto`)
VALUES  ('a',          1.1,       1);

INSERT INTO `caixa`
		(`produto`)
VALUES  (1);
