package com.gunome.kuroneko.beans;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gunome.kuroneko.ejb.NekoFacade;
import com.gunome.kuroneko.entity.Neko;

@Named
@RequestScoped
public class NekoBean {
	
	private List<Neko> nekoList;
	
	@Inject
	private NekoFacade nekoFacade;
	
	public String date() {
		return (new java.util.Date()).toString();
	}
	
	private void findAllNeko() {
		nekoList = nekoFacade.findAll();
	}

	public List<Neko> getNekoList() {
		return nekoList;
	}

	public void setNekoList(List<Neko> nekoList) {
		this.nekoList = nekoList;
	}
}
