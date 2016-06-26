package com.gunome.kuroneko.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the neko database table.
 * 
 */
@Entity
@NamedQuery(name="Neko.findAll", query="SELECT n FROM Neko n")
public class Neko implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="DATE_BIRTH")
	private Timestamp dateBirth;

	private String name;

	public Neko() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateBirth() {
		return this.dateBirth;
	}

	public void setDateBirth(Timestamp dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}