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
	private String dateBirth;
	
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
		getAllNekos();
	}
	
	public String date() {
		return (new java.util.Date()).toString();
	}
	
	/**
	 * create a new cat
	 */
	public void createNeko() {
		if (!name.isEmpty() && !dateBirth.isEmpty()) {
			Neko neko = new Neko();
			neko.setName(name);
			neko.setDateBirth(Timestamp.valueOf(dateBirth));
			nekoFacade.create(neko);
			getAllNekos();
		}
	}
	
	/**
	 * delete a cat
	 */
	public void deleteNeko(Neko neko) {
		nekoFacade.remove(neko);
		getAllNekos();
	}
	/**
	 * get all cats registered
	 */
	private void getAllNekos() {
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

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}
}
