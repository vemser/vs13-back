-- Força a sessão da aba / script a usar este esquema
ALTER SESSION SET CURRENT_SCHEMA=VEM_SER;

CREATE TABLE VEM_SER.PESSOA (
    id_pessoa NUMBER NOT NULL,
    nome VARCHAR2(255) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(14), -- +5551995249346
    idade NUMBER(3) NOT NULL,
    altura NUMBER(2,1) NOT NULL,
    cpf CHAR(11) UNIQUE NOT NULL,
    PRIMARY KEY(id_pessoa)
);

DROP TABLE VEM_SER.PESSOA;


CREATE SEQUENCE VEM_SER.SEQ_PESSOA
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;

DROP SEQUENCE VEM_SER.SEQ_PESSOA


--
SELECT * FROM VEM_SER.PESSOA;
SELECT id_pessoa, cpf, nome FROM vem_ser.pessoa;

--
INSERT INTO VEM_SER.PESSOA (id_pessoa, nome, data_nascimento, telefone, idade, altura, cpf)
VALUES(VEM_SER.SEQ_PESSOA.nextval, 'Rafael Lazzari', TO_DATE('01-01-1990', 'dd-mm-yyyy'), '51999999999', 30, 1.85, '12345678999');


INSERT INTO VEM_SER.PESSOA (id_pessoa, nome, data_nascimento, telefone, idade, altura, cpf)
VALUES (VEM_SER.SEQ_PESSOA.nextval, 'Rafael Lazzari 2', TO_DATE('01-01-1990'), '51999999999', 30, 1.85, '12345678990');
--


UPDATE VEM_SER.PESSOA
   SET nome = 'Pedro Machado'
     , idade = 30
 WHERE id_pessoa = 1;


DELETE FROM VEM_SER.PESSOA 
 WHERE id_pessoa = 1;



