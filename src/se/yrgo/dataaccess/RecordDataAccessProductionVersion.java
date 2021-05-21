package se.yrgo.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.yrgo.domain.Collector;
import se.yrgo.domain.RecordCopy;
import se.yrgo.domain.RecordRelease;

@Stateless
@Default
@ProductionDao
public class RecordDataAccessProductionVersion implements RecordDataAccess {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertRecordRelease(RecordRelease recordRelease) {
		em.persist(recordRelease);
		
	}

	@Override
	public void insertCollector(Collector collector) {
		em.persist(collector);
		
	}

	@Override
	public void insertRecordCopy(RecordCopy recordCopy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Collector> findAllCollectors() {
		Query q = em.createQuery("select collector from Collector collector");
		List<Collector> collectors = q.getResultList();
		return collectors;
	}
	
	@Override
	public List<Collector> findCollectorByUserName(String userName) {
		Query q = em.createQuery("select collector from Collector collector where collector.userName= :username");
		q.setParameter("username", userName);
		return q.getResultList();
	}

	@Override
	public List<RecordRelease> findAllRecordReleases() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecordRelease> findByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecordCopy> findCopiesByCollector(Collector collector) {
		// TODO Auto-generated method stub
		return null;
	}

}
