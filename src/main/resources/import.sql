INSERT INTO cozinha (id, nome) VALUES (1, 'Tailandesa');
INSERT INTO cozinha (id, nome) VALUES (2, 'Indiana');

INSERT INTO forma_pagamento (id, descricao) VALUES (1, 'Pix');

INSERT INTO restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) VALUES ('Comidas Tailandesas', 15, 1, 1);
INSERT INTO restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) VALUES ('Comidas Indianas', 10, 2, 1);

INSERT INTO permissao (nome, descricao) VALUES ('root', 'super usuario');

INSERT INTO estado (id, nome) VALUES (1, 'Sao Luiz');

INSERT INTO cidade (nome, estado_id) VALUES ('Sao Luiz', 1);