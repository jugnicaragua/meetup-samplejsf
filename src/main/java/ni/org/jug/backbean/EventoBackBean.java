package ni.org.jug.backbean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ni.org.jug.entity.Evento;

@ManagedBean
@ViewScoped
public class EventoBackBean implements Serializable {
	
	private static final long serialVersionUID = 7338777711614870198L;
	
	private List<Evento> eventos = new ArrayList<Evento>();
	
	@PostConstruct
	public void init() {
		Evento evento = new Evento();
		evento.setId(1);
		evento.setNombre("Aprendamos a Desarrollar aplicaciones Web con Java");
		evento.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		evento.setPasivo(false);
		evento.setFecha(LocalDate.now());
		this.getEventos().add(evento);
	}
	

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}	

}
