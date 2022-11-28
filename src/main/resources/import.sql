INSERT INTO cozinha (id, nome) VALUES (1, 'Tailandesa');
INSERT INTO cozinha (id, nome) VALUES (2, 'Indiana');

INSERT INTO restaurante (nome, taxa_frete, cozinha_id) VALUES ('Comidas Tailandesas', 15, 1);
INSERT INTO restaurante (nome, taxa_frete, cozinha_id) VALUES ('Comidas Indianas', 10, 2);

INSERT INTO forma_pagamento (descricao) VALUES ('Pix');

INSERT INTO permissao (nome, descricao) VALUES ('root', 'super usuario');