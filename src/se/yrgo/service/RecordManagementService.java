package se.yrgo.service;
import java.util.List;

import javax.ejb.Remote;

import se.yrgo.domain.*;

@Remote
public interface RecordManagementService {
	public void registerCollector(Collector collector);
	public void registerRecordRelease(RecordRelease recordRelease);
	public void registerRecordCopy(RecordCopy recordCopy);
	public List<Collector>getAllCollectors();
	public List<RecordRelease>getAllRecordReleases();
	public List<RecordRelease>searchByGenre(String genre);
	public List<RecordCopy>getCopiesByCollector(Collector collector);
}