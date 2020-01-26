package everisacademy;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "helloworld")
@ViewScoped
public class HelloWorldBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8425256913664822653L;

	private String message = "Hello Everis HPC Academy!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}