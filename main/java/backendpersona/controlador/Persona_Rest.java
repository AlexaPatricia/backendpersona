package backendpersona.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backendpersona.implementacion.Persona_Implementacion;
import backendpersona.modelo.Persona;

@RestController
@RequestMapping("/persona/")


public class Persona_Rest {

	@Autowired
    private Persona_Implementacion implementacion;
    
	@GetMapping	
    private ResponseEntity<List<Persona>> lista_persona()
    {
         return ResponseEntity.ok(implementacion.findAll());	
    }
	
	//@GetMapping("{codigo}")
	//private ResponseEntity<List<Persona>> lista_codigo(@PathVariable("codigo") int codigo)
	
	//{
		
	//}
	
}
