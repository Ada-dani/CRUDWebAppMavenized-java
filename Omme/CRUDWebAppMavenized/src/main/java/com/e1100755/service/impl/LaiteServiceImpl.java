package com.e1100755.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.e1100755.dao.LaiteDAO;
import com.e1100755.model.Laite;
import com.e1100755.service.LaiteService;

@Service
public class LaiteServiceImpl implements LaiteService {
	@Autowired
	private LaiteDAO laiteDao;

	@Transactional
	public void add(Laite laite) {
		laiteDao.add(laite);

	}

	@Transactional
	public void edit(Laite laite) {
		laiteDao.edit(laite);

	}

	@Transactional
	public void delete(int laiteId) {
		laiteDao.delete(laiteId);

	}

	@Transactional
	public Laite getLaite(int laiteId) {
		return laiteDao.getLaite(laiteId);
	}

	@Transactional
	public List getKaikkiLaite() {
		return laiteDao.getKaikkiLaite();
	}
}
