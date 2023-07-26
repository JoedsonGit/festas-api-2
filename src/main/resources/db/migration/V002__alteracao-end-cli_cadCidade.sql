create table cidade (
	id 							bigint not null auto_increment,
	
  	nome						varchar(100),
  	uf							varchar(3),	
		
  primary key (id)
) engine=InnoDB default charset=utf8;


alter table cliente add column endereco 	varchar(100), 
					add column bairro 		varchar(100),
                    add column numero 		varchar(100),
					add column cep 			varchar(100),
                    add column cidade_id 	Integer ;
                    
                    
                    
