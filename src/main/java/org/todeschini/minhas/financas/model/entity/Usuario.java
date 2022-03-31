package org.todeschini.minhas.financas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table( name = "usuario", schema = "financas")
@Data
@Builder
public class Usuario {
	
//	 id bigserial NOT NULL PRIMARY KEY,
//	  nome character varying(150),
//	  email character varying(100),
//	  senha character varying(20),
//	  data_cadastro date default now()
//	
	@Id
	@Column(name = "id")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;

}
