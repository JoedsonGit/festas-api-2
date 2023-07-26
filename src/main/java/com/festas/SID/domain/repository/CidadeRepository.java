package com.festas.SID.domain.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.festas.SID.domain.model.Cidade;

public interface CidadeRepository  extends CustomJpaRepository<Cidade, Long>, CidadeRepositoryQueries,
JpaSpecificationExecutor<CidadeRepository> {
	
	
}


