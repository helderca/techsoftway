package Model;

import java.util.Date;

public class Agenda {

	private long idAgenda;
	private String nomePaciente;
	private Date dataConsulta;
	private Date horarioConsulta;
	private String observacoesConsulta;
	
	public long getIdAgenda() {
		return idAgenda;
	}
	public void setIdAgenda(long idAgenda) {
		this.idAgenda = idAgenda;
	}
	
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public Date getHorarioConsulta() {
		return horarioConsulta;
	}
	public void setHorarioConsulta(Date horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}
	public String getObservacoesConsulta() {
		return observacoesConsulta;
	}
	public void setObservacoesConsulta(String observacoesConsulta) {
		this.observacoesConsulta = observacoesConsulta;
	}
}
