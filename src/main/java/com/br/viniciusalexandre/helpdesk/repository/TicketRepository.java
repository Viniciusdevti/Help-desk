package com.br.viniciusalexandre.helpdesk.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<TicketRepository, String>{
	
	Page<TicketRepository> findByUserIdOrderByDateDesc(Pageable pages, String userId );

	Page<TicketRepository> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPprioridadeIgnoreCaseContainingOrderByDateDesc(
				String title , String status, String prioridade,  Pageable pages);
	
	
	Page<TicketRepository> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPprioridadeIgnoreCaseContainingAndUserIdOrderByDateDesc(
			String title , String status, String prioridade,  Pageable pages);
	
	
	Page<TicketRepository> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPprioridadeIgnoreCaseContainingAndatribuicaoUserUserIdOrderByDateDesc(
			String title , String status, String prioridade,  Pageable pages);
	
	Page<TicketRepository> findByUserNumero(Integer numero, Pageable pages );
	
}
