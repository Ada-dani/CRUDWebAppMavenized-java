package com.e1100755.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.e1100755.dao.LaiteDAO;
import com.e1100755.model.Laite;

@Repository
public class LaiteDaoImpl implements LaiteDAO {
	
	@Autowired
	private SessionFactory session;
	@Override
	public void add(Laite laite) {
		session.getCurrentSession().save(laite);

	}

	@Override
	public void edit(Laite laite) {
		session.getCurrentSession().update(laite);

	}

	@Override
	public void delete(int laiteId) {
		session.getCurrentSession().delete(getLaite(laiteId));

	}

	@Override
	public Laite getLaite(int laiteId) {
		return (Laite)session.getCurrentSession().get(Laite.class, laiteId);

	}

	@Override
	public List getKaikkiLaite() {
		return session.getCurrentSession().createQuery("from Laite").list();

	}

}
