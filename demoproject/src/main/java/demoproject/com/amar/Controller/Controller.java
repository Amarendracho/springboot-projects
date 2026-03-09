package demoproject.com.amar.Controller;

import com.amar.Service.Service;

public class Controller {

	private Service service;

	// constructor injection
	public Controller(Service service) {
		this.service = service;
	}

	// setter injection
	public void setService(Service service) {
		this.service = service;
	}

	public void sericeRequest() {
		service.serviceResponse();
	}

}
