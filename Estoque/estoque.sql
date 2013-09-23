create table produto (
pro_codigo varchar(100) NOT NULL,
pro_nome varchar(50) NOT NULL,
pro_marca varchar(50) NOT NULL,
pro_quantidade_pacote float8 NOT NULL,
pro_quantidade_itens float8 NOT NULL,
pro_quantidade_minima float8 NOT NULL,
pro_valor_compra numeric (9,2) NOT NULL,
pro_valor_venda numeric (9,2)  NOT NULL,
pro_data_cadastro date NOT NULL,
pro_data_compra date NOT NULL,
pro_data_vencimento date,
pro_lote varchar (50),
pro_categoria varchar (50) NOT NULL,
pro_obs text,
PRIMARY KEY (pro_codigo));

create table cliente (
cli_codigo serial NOT NULL,
cli_nome varchar (50) NOT NULL,
cli_pessoa varchar (8) NOT NULL,
cli_cpf_cnpj varchar (20) NOT NULL,
cli_telefone1 varchar (14),
cli_telefone2 varchar (14),
cli_celular1 varchar (14),
cli_celular2 varchar (14),
cli_email varchar (50) NOT NULL,
cli_rua varchar (50) NOT NULL,
cli_numero varchar (5) NOT NULL,
cli_bairro varchar (30) NOT NULL,
cli_cidade varchar (40) NOT NULL,
cli_cep varchar (10) NOT NULL,
PRIMARY KEY (cli_codigo));

CREATE UNIQUE INDEX ON cliente (cli_cpf_cnpj);

create table venda (
ven_codigo int NOT NULL,
ven_cliente int,
ven_produto varchar(100),
ven_valor_total numeric (9,2) NOT NULL,
ven_valor_produto numeric (9,2) NOT NULL,
ven_data date NOT NULL,
ven_qnt_produto int NOT NULL,
PRIMARY KEY (ven_codigo),
FOREIGN KEY (ven_produto) REFERENCES produto (pro_codigo) ON UPDATE CASCADE ON DELETE SET NULL,
FOREIGN KEY (ven_cliente) REFERENCES cliente (cli_codigo) ON UPDATE CASCADE ON DELETE SET NULL);
