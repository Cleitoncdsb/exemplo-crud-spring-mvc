INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (01, 'maria', 'A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3', true);
	
INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (02, 'jose', 'B3A8E0E1F9AB1BFE3A36F231F676F78BB30A519D2B21E6C530C0EEE8EBB4A5D0', true);
	
INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (03, 'ana', '35A9E381B1A27567549B5F8A6F783C167EBF809F1C4D6A9E367240484D8CE281', true);
	
INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (04, 'joao', '1D28C120568C10E19B9D8ABE8B66D0983FA3D2E11EE7751ACA50F83C6F4A43AA', true);
	
INSERT INTO usuario(
			id, login, password, habilitado)
	VALUES (05, 'carla', 'A30F4EF42176D28F0E2293533C5F532E9C9C5696C68813B35315D17EDC44F6B1', true);
	
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

	

	
