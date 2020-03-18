package com.br.viniciusalexandre.helpdesk;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.br.viniciusalexandre.helpdesk.api.entity.Ticket;
import com.br.viniciusalexandre.helpdesk.api.entity.User;
import com.br.viniciusalexandre.helpdesk.api.enums.StatusEnum;

@Document
public class MudancaStatus {
	@Id
	private String id; 
	
	private Ticket ticket;
	@DBRef
	private User userMudaca;
	
	private Date dataMudancaStatus;
	
	private StatusEnum status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUserMudaca() {
		return userMudaca;
	}

	public void setUserMudaca(User userMudaca) {
		this.userMudaca = userMudaca;
	}

	public Date getDataMudancaStatus() {
		return dataMudancaStatus;
	}

	public void setDataMudancaStatus(Date dataMudancaStatus) {
		this.dataMudancaStatus = dataMudancaStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

}
