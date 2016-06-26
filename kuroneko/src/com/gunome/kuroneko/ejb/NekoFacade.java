package com.gunome.kuroneko.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gunome.kuroneko.entity.Neko;

/**
 * Session Bean implementation class NekoFacade
 */
@Stateless
public class NekoFacade extends AbstractFacade<Neko> {

	@PersistenceContext(unitName = "kuroneko")
	private EntityManager em;
	
	protected EntityManager getEntityManager() {
		return em;
	}
	
    /**
     * Default constructor. 
     */
    public NekoFacade() {
        super(Neko.class);
    }

}
