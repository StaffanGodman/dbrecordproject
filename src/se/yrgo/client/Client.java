package se.yrgo.client;

import se.yrgo.domain.*;

import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import se.yrgo.service.RecordManagementService;

public class Client {

	public static void main(String[] args) throws NamingException {
		Properties jndiProperties = new Properties();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
                "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL,"http-remoting://localhost:8080");
		jndiProperties.put("jboss.naming.client.ejb.context",true);
		Context jndi = new InitialContext(jndiProperties);
	
		RecordManagementService service = 
	               (RecordManagementService)jndi.lookup(
	            		   "snapshot_dbrecordproject/RecordManagementImplementation!"
	            		   + "se.yrgo.service.RecordManagementService");
		List<Collector> collectors = service.getAllCollectors();
		for (Collector collector: collectors) {
			System.out.println(collector);
		}
	}
}
