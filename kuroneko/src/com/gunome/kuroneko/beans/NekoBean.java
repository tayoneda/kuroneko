package com.gunome.kuroneko.beans;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gunome.kuroneko.ejb.NekoFacade;
import com.gunome.kuroneko.entity.Neko;

@Named
@RequestScoped
public class NekoBean {
	
	private String name;
	private Timestamp dateBirth;
	
	private List<Neko> nekoList;
	
	/**
	 * ejb to access cat data
	 */
	@Inject
	private NekoFacade nekoFacade;
	
	/**
	 * initiate a view
	 */
	@PostConstruct
	public void init() {
		getAllNeko();
	}
	
	public String date() {
		return (new java.util.Date()).toString();
	}
	
	/**
	 * create a new cat
	 */
	public void createNeko() {
		if (name.isEmpty() && dateBirth != null) {
			
		}
	}
	/**
	 * get all cats registered
	 */
	private void getAllNeko() {
		nekoList = nekoFacade.findAll();
	}

	public List<Neko> getNekoList() {
		return nekoList;
	}

	public void setNekoList(List<Neko> nekoList) {
		this.nekoList = nekoList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Timestamp dateBirth) {
		this.dateBirth = dateBirth;
	}
}
