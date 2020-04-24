package tskinder.odkop.dao;

import java.util.List;

import tskinder.odkop.model.Discovery;

public interface DiscoveryDAO extends GenericDAO<Discovery, Long> {
	
	List<Discovery> getAll();
}
