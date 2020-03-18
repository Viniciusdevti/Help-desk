package com.br.viniciusalexandre.helpdesk.api.entity;

import java.util.List;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.br.viniciusalexandre.helpdesk.MudancaStatus;
import com.br.viniciusalexandre.helpdesk.api.enums.PrioridadeEnum;
import com.br.viniciusalexandre.helpdesk.api.enums.StatusEnum;

@Document
public class Ticket {

	@Id
	private String id;

	@DBRef(lazy = true)
	private User user;

	private Date date;

	private String title;
	
	private int numero;
	
	
	private StatusEnum status;
	
	private PrioridadeEnum prioridade;
	
	@DBRef(lazy = true)
	private User atribuicaoUser;
	
	private String descricao;
	
	private String imagem;
	
	private List<MudancaStatus> alteracoes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public PrioridadeEnum getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(PrioridadeEnum prioridade) {
		this.prioridade = prioridade;
	}

	public User getAtribuicaoUser() {
		return atribuicaoUser;
	}

	public void setAtribuicaoUser(User atribuicaoUser) {
		this.atribuicaoUser = atribuicaoUser;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public List<MudancaStatus> getAlteracoes() {
		return alteracoes;
	}

	public void setAlteracoes(List<MudancaStatus> alteracoes) {
		this.alteracoes = alteracoes;
	}
	
	
	
	
	

}
