package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Treino {
	
	@Id
	@GeneratedValue  (strategy=GenerationType.IDENTITY)  
	@Column(name="id_arquivoTreino", nullable = false)
	private int id_arquivoTreino;
	
	@Column(nullable = false)
	private Date data;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String tema;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_usuario_ministrante",nullable = false)
	private Usuario ministrantes;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String participantes;
	
	@Column(nullable = false)
	private String turno;

	public int getId_arquivoTreino() {
		return id_arquivoTreino;
	}

	public void setId_arquivoTreino(int id_arquivoTreino) {
		this.id_arquivoTreino = id_arquivoTreino;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	

	public Usuario getMinistrantes() {
		return ministrantes;
	}

	public void setMinistrantes(Usuario ministrantes) {
		this.ministrantes = ministrantes;
	}

	public String getParticipantes() {
		return participantes;
	}

	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	
}
