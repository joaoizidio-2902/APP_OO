
CREATE TABLE Usuario (
id_usuario INT PRIMARY KEY auto_increment,
nome_usuario VARCHAR(255),
tipo_usuario INT,
sobrenome_usuario VARCHAR(255),
email_usuario VARCHAR(255) unique,
telefone_usuario VARCHAR(255),
cpf_usuario VARCHAR(11),
senha_usuario VARCHAR(255)
);

CREATE TABLE Veiculo (
veiculo_id INT PRIMARY KEY auto_increment,
veiculo_cor VARCHAR(255),
veiculo_marca VARCHAR(255),
veiculo_placa VARCHAR(255) unique not null,
veiculo_motor VARCHAR(255),
veiculo_km FLOAT,
veiculo_data_ult_troca DATE,
veiculo_email_dono VARCHAR(255),
FOREIGN KEY (veiculo_email_dono) REFERENCES Usuario(email_usuario)
);



CREATE TABLE Oficina (
id_oficina INT PRIMARY KEY auto_increment,
nome_oficina VARCHAR(255),
endereco_oficina VARCHAR(255)
);

CREATE TABLE Produto (
produto_id INT PRIMARY KEY auto_increment,
produto_nome VARCHAR(255),
produto_descricao VARCHAR(255),
produto_preco FLOAT,
produto_marca VARCHAR(255),
id_oficina INT,
FOREIGN KEY (id_oficina) REFERENCES Oficina(id_oficina)
);

CREATE TABLE Relacao (
id_relacao INT PRIMARY KEY auto_increment,
id_cliente INT,
id_veiculo INT,
id_produto INT,
FOREIGN KEY (id_cliente) REFERENCES Usuario(id_usuario),
FOREIGN KEY (id_veiculo) REFERENCES Veiculo(veiculo_id),
FOREIGN KEY (id_produto) REFERENCES Produto(produto_id)
);


############
-- Inserir dados na tabela Usuario
INSERT INTO Usuario (nome_usuario, tipo_usuario, sobrenome_usuario, email_usuario, telefone_usuario, cpf_usuario, senha_usuario)
VALUES
( 'João', 1, 'Silva', 'joao@email.com', '123-456-7890', '12345678901', 'senha123'),
( 'Maria', 1, 'Pereira', 'maria@email.com', '987-654-3210', '98765432102', 'senha456'),
( 'Pedro', 2, 'Fernandes', 'pedro@email.com', '111-222-3333', '11122233303', 'senha789');

-- Inserir dados na tabela Veiculo
INSERT INTO Veiculo ( veiculo_cor, veiculo_marca, veiculo_placa, veiculo_motor, veiculo_km, veiculo_data_ult_troca, veiculo_email_dono)
VALUES
( 'Azul', 'Ford', 'ABC-1234', 'V6', 50000, '2023-01-15', 'joao@email.com'),
( 'Vermelho', 'Chevrolet', 'XYZ-5678', 'V8', 75000, '2023-02-20', 'joao@email.com'),
( 'Prata', 'Toyota', 'DEF-9012', 'I4', 60000, '2023-03-25', 'joao@email.com');

-- Inserir dados na tabela Oficina
INSERT INTO Oficina (nome_oficina, endereco_oficina)
VALUES
('Oficina A', 'Rua A, 123'),
( 'Oficina B', 'Avenida B, 456'),
( 'Oficina C', 'Praça C, 789');

-- Inserir dados na tabela Produto
INSERT INTO Produto ( produto_nome, produto_descricao, produto_preco, produto_marca, id_oficina)
VALUES
( 'Óleo de Motor', 'Óleo sintético 5W-30', 25.99, 'Castrol', 1),
( 'Filtro de Óleo', 'Filtro de óleo de alta qualidade', 9.99, 'Bosch', 2),
('Pastilhas de Freio', 'Pastilhas de freio dianteiras', 35.50, 'Ferodo', 3);
