INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (01, 'maria', '123', true);
	
INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (02, 'jose', '456', true);
	
INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (03, 'ana', '789', true);
	
INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (04, 'joao', '147', true);
	
INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (05, 'carla', '258', true);
	
INSERT INTO contato(
			id, nome, sobrenome, fone, cidade, endereco, email)
	VALUES (01, 'ana', 'maria','98586332', 'quixada', 'rua 1, 100', 'anamaria@gmail.com');

INSERT INTO contato(
			id, nome, sobrenome, fone, cidade, endereco, email)
	VALUES (02, 'maria', 'paula', '45872136', 'fortaleza', 'rua margaridas, 57', 'mariapaula@gmail.com');

INSERT INTO contato(
			id, nome, sobrenome, fone, cidade, endereco, email)
	VALUES (03, 'marco', 'luis', '45852147', 'quixeramobim', 'rua 503, 25', 'marcoluis@gmail.com');

INSERT INTO contato(
			id, nome, sobrenome, fone, cidade, endereco, email)
	VALUES (04, 'joao', 'lucas', '74581236', 'fortaleza', 'rua nova, 741', 'joaolucas@gmail.com');

INSERT INTO contato(
			id, nome, sobrenome, fone, cidade, endereco, email)
	VALUES (05, 'maria', 'luisa', '98586332', 'quixada', 'rua 15 de outubro, s/n', 'anamaria@gmail.com');
	
INSERT INTO papel(
			id, nome)
	VALUES (01, 'ROLE_USER');
	
INSERT INTO papel(
			id, nome)
	VALUES (02, 'ROLE_VET');

INSERT INTO papel_usuario(
			usuario_id, papel_id)
	VALUES (01, '01');

INSERT INTO papel_usuario(
			usuario_id, papel_id)
	VALUES (01, '02');

	

	