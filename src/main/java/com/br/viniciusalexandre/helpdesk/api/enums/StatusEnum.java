package com.br.viniciusalexandre.helpdesk.api.enums;

public enum StatusEnum {
	
	NOVO,
	ATRIBUIDO,
	RESOLVIDO,
	APROVADO,
	REPROVADO,
	FECHADO;

	
	 public static StatusEnum getStatus(String status) {
		switch(status) {
		
		case "NOVO" : return NOVO;
		case "ATRIBUIDO" : return ATRIBUIDO;
		case "RESOLVIDO" : return RESOLVIDO;
		case "APROVADO" : return APROVADO;
		case "REPROVADO" : return REPROVADO;
		case "FECHADO" : return FECHADO;
		default : return NOVO; 
		}
	}
}
