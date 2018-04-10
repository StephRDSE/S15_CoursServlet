package co.simplon.poleEmploi.server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogServlet  extends GenericServlet {
	
	
	// création d'une Liste des logs
	private List<ServletRequest> myLogs = Collections.synchronizedList(new ArrayList<ServletRequest>());
	private List<String> otherLogs = new ArrayList<String>();
	private int test= 0;
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	   
		 
		myLogs.add(request);
		otherLogs.add(request.toString());
		test++;
		response.getWriter().println("Cette page a recu " + myLogs.size() + " requetes");
		System.out.println("Cette page a recu " + myLogs.size() + " requetes et " + otherLogs.size() + " & compteur int = " + test);

}

}
