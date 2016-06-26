package com.gunome.kuroneko.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class NekoBean {
	public String date() {
		return (new java.util.Date()).toString();
	}
}
