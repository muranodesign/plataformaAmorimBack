package br.com.muranodesign.resources;

import org.junit.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;


public class PresencaProfessor extends JerseyTest  {
	@Override
	protected AppDescriptor configure() {
		return new WebAppDescriptor.Builder().build();
	}
	
	
	@Test
	public void insert() {
		WebResource webResource = client().resource("http://localhost:8082/plataformaAmorim/PresencaProfessor");
		 webResource.post("action=create&presenca=1&professor=3&data=2014-12-22&calendario=2");
		 
				
	}
	

    
}