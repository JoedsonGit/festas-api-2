set foreign_key_checks = 0;

delete from cidade;

insert into cidade (id, nome, uf) values (1, 'Vitoria da Conquista', 'BA');
insert into cidade (id, nome, uf) values (2, 'Salvador', 'BA');
insert into cidade (id, nome, uf) values (3, 'Santo Antonio de Jesus', 'BA');

set foreign_key_checks = 1;