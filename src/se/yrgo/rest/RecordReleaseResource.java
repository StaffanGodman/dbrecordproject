package se.yrgo.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import se.yrgo.domain.RecordRelease;
import se.yrgo.service.RecordManagementServiceLocal;

@Stateless
@Path("/recordrelease")
public class RecordReleaseResource {

	@Inject
	public RecordManagementServiceLocal service;
	
	@POST
	@Produces("application/JSON")
	@Consumes("application/JSON")
	public RecordRelease createRecord(RecordRelease rr) {
		service.registerRecordRelease(rr);
		return rr;
	}
}
