package com.e1100755.service;

import java.util.List;

import com.e1100755.model.Laite;

public interface LaiteService {
	public void add(Laite laite);
	public void edit(Laite laite);
	public void delete(int laiteId);
	public Laite getLaite(int laiteId);
	public List getKaikkiLaite();
	
	
}
