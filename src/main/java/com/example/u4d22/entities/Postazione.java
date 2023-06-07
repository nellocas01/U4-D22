package com.example.u4d22.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazione")
@Data
@NoArgsConstructor
public class Postazione {
	@Id
	@GeneratedValue
	private UUID id;
	private String descrizione;
	private Tipo tipo;

	public Postazione(String descrizione, Tipo tipo) {
		super();
		this.descrizione = descrizione;
		this.tipo = tipo;
	}

	public enum Tipo {
		PRIVATO, OPENSPACE, SALA_RIUNIONI
	}
}