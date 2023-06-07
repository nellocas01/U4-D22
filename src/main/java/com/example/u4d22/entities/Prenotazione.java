package com.example.u4d22.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prenotazioni")
@Data
@NoArgsConstructor
public class Prenotazione {
	@Id
	@GeneratedValue
	private UUID id;
	private Utente idUtente;
	private Postazione idPostazione;
	private Data data;

	public Prenotazione(Utente idUtente, Postazione idPostazione, Data data) {
		super();
		this.idUtente = idUtente;
		this.idPostazione = idPostazione;
		this.data = data;
	}

}
