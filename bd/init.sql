#CREATE DATABASE OlheOleo;
use OlheOleo;

CREATE TABLE Usuario (
id_usuario INT PRIMARY KEY,
nome_usuario VARCHAR(255),
tipo_usuario INT,
sobrenome_usuario VARCHAR(255),
email_usuario VARCHAR(255),
telefone_usuario VARCHAR(255),
cpf_usuario VARCHAR(11),
senha_usuario VARCHAR(255)
);

CREATE TABLE Veiculo (
veiculo_id INT PRIMARY KEY,
veiculo_cor VARCHAR(255),
veiculo_marca VARCHAR(255),
veiculo_placa VARCHAR(255),
veiculo_motor VARCHAR(255),
veiculo_km FLOAT,
veiculo_data_ult_troca DATE
);

CREATE TABLE Oficina (
id_oficina INT PRIMARY KEY,
nome_oficina VARCHAR(255),
endereco_oficina VARCHAR(255)
);

CREATE TABLE Produto (
produto_id INT PRIMARY KEY,
produto_nome VARCHAR(255),
produto_descricao VARCHAR(255),
produto_preco FLOAT,
produto_marca VARCHAR(255),
id_oficina INT,
FOREIGN KEY (id_oficina) REFERENCES Oficina(id_oficina)
);

CREATE TABLE Relacao (
id_relacao INT PRIMARY KEY,
id_cliente INT,
id_veiculo INT,
id_produto INT,
FOREIGN KEY (id_cliente) REFERENCES Usuario(id_usuario),
FOREIGN KEY (id_veiculo) REFERENCES Veiculo(veiculo_id),
FOREIGN KEY (id_produto) REFERENCES Produto(produto_id)
);


############
-- Inserir dados na tabela Usuario
INSERT INTO Usuario (id_usuario, nome_usuario, tipo_usuario, sobrenome_usuario, email_usuario, telefone_usuario, cpf_usuario, senha_usuario)
VALUES
(1, 'João', 1, 'Silva', 'joao@email.com', '123-456-7890', '12345678901', 'senha123'),
(2, 'Maria', 1, 'Pereira', 'maria@email.com', '987-654-3210', '98765432102', 'senha456'),
(3, 'Pedro', 2, 'Fernandes', 'pedro@email.com', '111-222-3333', '11122233303', 'senha789');

-- Inserir dados na tabela Veiculo
INSERT INTO Veiculo (veiculo_id, veiculo_cor, veiculo_marca, veiculo_placa, veiculo_motor, veiculo_km, veiculo_data_ult_troca)
VALUES
(1, 'Azul', 'Ford', 'ABC-1234', 'V6', 50000, '2023-01-15'),
(2, 'Vermelho', 'Chevrolet', 'XYZ-5678', 'V8', 75000, '2023-02-20'),
(3, 'Prata', 'Toyota', 'DEF-9012', 'I4', 60000, '2023-03-25');

-- Inserir dados na tabela Oficina
INSERT INTO Oficina (id_oficina, nome_oficina, endereco_oficina)
VALUES
(1, 'Oficina A', 'Rua A, 123'),
(2, 'Oficina B', 'Avenida B, 456'),
(3, 'Oficina C', 'Praça C, 789');

-- Inserir dados na tabela Produto
INSERT INTO Produto (produto_id, produto_nome, produto_descricao, produto_preco, produto_marca, id_oficina)
VALUES
(1, 'Óleo de Motor', 'Óleo sintético 5W-30', 25.99, 'Castrol', 1),
(2, 'Filtro de Óleo', 'Filtro de óleo de alta qualidade', 9.99, 'Bosch', 2),
(3, 'Pastilhas de Freio', 'Pastilhas de freio dianteiras', 35.50, 'Ferodo', 3);

select*from usuario;