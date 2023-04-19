
package modelo;

import control.Controlador;
import vista.VistaEstudiante;

public class Principal {
    public static void main(String[] args) {
        VistaEstudiante v = new VistaEstudiante();
        Estudiante est = new Estudiante();
        Controlador controlador = new Controlador(est,v);
    }
}
