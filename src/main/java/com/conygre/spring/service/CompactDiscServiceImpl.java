package com.conygre.spring.service;


import com.conygre.spring.repos.CompactDiscRepository;
import com.conygre.spring.entities.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CompactDiscServiceImpl implements CompactDiscService {
	
	@Autowired
	private CompactDiscRepository dao;
	
	
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
//	public void addToCatalog(CompactDisc disc) {
//		repos.save(disc);
//	}
//
//	@Override
@Transactional(propagation = Propagation.REQUIRED)
public Iterable<CompactDisc> getCatalog() {
		return dao.findAll();
	}
//
//	public CompactDisc getCompactDiscById(int id) {
//		return repos.findOne(id);
//	}
//
//	private static Collection<CompactDisc> makeCollection(Iterable<CompactDisc> iter) {
//	    Collection<CompactDisc> list = new ArrayList<CompactDisc>();
//	    for (CompactDisc item : iter) {
//	        list.add(item);
//	    }
//	    return list;
//	}
}
