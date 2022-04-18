package backendpersona.dependencia;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import backendpersona.modelo.Persona;

public interface Persona_Dependencia extends JpaRepository<Persona, Long>{
  
	//List<Persona> lista_persona_Cedula(String Cedula);
}
