package se.yrgo.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import se.yrgo.dataaccess.RecordDataAccess;
import se.yrgo.domain.Collector;
import se.yrgo.domain.RecordCopy;
import se.yrgo.domain.RecordRelease;

@Stateless
public class RecordManagementImplementation implements RecordManagementService {

	@Inject
	private RecordDataAccess dao;
	
	@Override
	public void registerCollector(Collector collector) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerRecordRelease(RecordRelease recordRelease) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerRecordCopy(RecordCopy recordCopy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Collector> getAllCollectors() {
		return dao.findAllCollectors();
	}

	@Override
	public List<RecordRelease> getAllRecordReleases() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecordRelease> searchByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecordCopy> getCopiesByCollector(Collector collector) {
		// TODO Auto-generated method stub
		return null;
	}

}
