package com.br.viniciusalexandre.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.viniciusalexandre.helpdesk.MudancaStatus;

public interface MudancaStatusRepository extends  MongoRepository <MudancaStatus, String> { 
	
	Iterable<MudancaStatus> findByTicketIdOderByDateChangeStatusDesc(String ticketId);

}
