-- Table: usuario

CREATE TABLE usuario
(
  id serial NOT NULL,
  habilitado boolean NOT NULL,
  login character varying(255) NOT NULL,
  password character varying(255) NOT NULL,
  CONSTRAINT usuario_pkey PRIMARY KEY (id)
);

-- Table: contato

CREATE TABLE contato
(
  id serial NOT NULL,
  cidade character varying(255),
  email character varying(255),
  endereco character varying(255),
  fone character varying(255),
  nome character varying(255) NOT NULL,
  sobrenome character varying(255) NOT NULL,
  CONSTRAINT contato_pkey PRIMARY KEY (id)
);

-- Table: papel

CREATE TABLE papel
(
  id serial NOT NULL,
  nome character varying(255) NOT NULL,
  CONSTRAINT papel_pkey PRIMARY KEY (id)
);

-- Table: papel_usuario

CREATE TABLE papel_usuario
(
  usuario_id integer NOT NULL,
  papel_id integer NOT NULL,
  CONSTRAINT fk_d03llnnn8u0h8y1rwn13hhtqs FOREIGN KEY (papel_id)
      REFERENCES papel (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_fgjk5k7a3xwxfhftgpugho3ls FOREIGN KEY (usuario_id)
      REFERENCES usuario (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);




