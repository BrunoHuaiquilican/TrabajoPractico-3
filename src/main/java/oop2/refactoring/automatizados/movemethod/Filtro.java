package oop2.refactoring.automatizados.movemethod;

import java.util.ArrayList;
import java.util.List;

//1. Extract method
//2. Move method
public class Filtro {

    public List<Persona> nombresQueEmpiezanConE(List<Persona> p) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : p) {
            // no aplica tell dont ask
            if (persona.nombre().startsWith("E")) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
}
