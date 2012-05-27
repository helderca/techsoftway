package Model;

//Classe paciente, do pacote Modelo, irá fazer ponte para conexão com o banco.
public class Paciente {

	private long codPaciente; //Primary Key no banco.
	private int idadePaciente; 
	private String nomePaciente; 
	private String enderecoPaciente;
	private String cpfRg;
	private String telefonePaciente;
	
	
	
	
	
	public long getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(long codPaciente) {
		this.codPaciente = codPaciente;
	}
	public int getIdadePaciente() {
		return idadePaciente;
	}
	public void setIdadePaciente(int idadePaciente) {
		this.idadePaciente = idadePaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getEnderecoPaciente() {
		return enderecoPaciente;
	}
	public void setEnderecoPaciente(String enderecoPaciente) {
		this.enderecoPaciente = enderecoPaciente;
	}
	public String getCpfRg() {
		return cpfRg;
	}
	public void setCpfRg(String cpfRg) {
		this.cpfRg = cpfRg;
	}
	public String getTelefonePaciente() {
		return telefonePaciente;
	}
	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}
}
