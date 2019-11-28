package ni.org.jug.backbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class WelcomeBackBean implements Serializable {
	
	private static final long serialVersionUID = -7679012975827245553L;
	private String mensajeBienvenida;
	
	@PostConstruct
	public void init() {
		this.setMensajeBienvenida("Bienvenidos Javeros al Meetup 11/2019");
	}

	public String getMensajeBienvenida() {
		return mensajeBienvenida;
	}

	public void setMensajeBienvenida(String mensajeBienvenida) {
		this.mensajeBienvenida = mensajeBienvenida;
	}	
	
}
