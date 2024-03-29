package ni.org.jug.backbean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import ni.org.jug.entity.Evento;

@ManagedBean
@ViewScoped
public class EventoBackBean implements Serializable {
	
	private static final long serialVersionUID = 7338777711614870198L;
	
	private List<Evento> eventos = new ArrayList<Evento>();
	private Evento evento = new Evento();
	
	
	@PostConstruct
	public void init() {
		Evento evento = new Evento();
		evento.setId(1);
		evento.setNombre("Aprendamos a Desarrollar aplicaciones Web con Java");
		evento.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor ");
		evento.setPasivo(false);
		evento.setFecha(new Date());
		this.getEventos().add(evento);
	}
	
	public void guardar() {
		if(this.getEvento().getId()==null) {
			this.getEvento().setId(this.getEventos().size()+1);
			this.getEvento().setPasivo(false);
			this.getEventos().add(evento);
		}else {
			this.actualizar();
		}
		
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, new FacesMessage("Guardado Satisfactoriamente", ""));
		crearNuevoEvento();
	}
	
	private void actualizar() {
		Iterator<Evento> allEvents = this.getEventos().iterator();
		while (allEvents.hasNext()) {
			Evento filtroEvento = allEvents.next();
			if(filtroEvento.getId().equals(this.getEvento().getId())) {
				this.getEventos().remove(filtroEvento);				
				this.getEventos().add(this.getEvento()) ;
			}
			
		}
	}
	
	public void crearNuevoEvento() {
		this.setEvento(new Evento());
	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}



	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}	

}
