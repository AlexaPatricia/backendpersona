package backendpersona.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Codigo_persona;
	@Column(name = "cedula")
	private String Cedula;
	@Column(name = "nombres")
	private String Nombres;
	@Column(name = "apellidos")
	private String Apellidos;
	@Column(name = "estatura")
	private int Estatura;
	public long getCodigo_persona() {
		return Codigo_persona;
	}
	public void setCodigo_persona(long codigo_persona) {
		Codigo_persona = codigo_persona;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getEstatura() {
		return Estatura;
	}
	public void setEstatura(int estatura) {
		Estatura = estatura;
	}
	
	
}
