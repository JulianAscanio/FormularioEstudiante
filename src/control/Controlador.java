
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Estudiante;
import vista.VistaEstudiante;

public class Controlador implements ActionListener{
    private Estudiante estudiante = null;
    private VistaEstudiante vistaEstudiante = null;

    public Controlador(Estudiante estudiante, VistaEstudiante vistaEstudiante) {
        super();
        this.estudiante = estudiante;
        this.vistaEstudiante = vistaEstudiante;
        actionListener(this);
    }

    private void actionListener(ActionListener controlador) {
        this.vistaEstudiante.btnAgregar.addActionListener(controlador);
        this.vistaEstudiante.btnMostrar.addActionListener(controlador);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        try{
            if (evento.getActionCommand().contentEquals("Agregar")) {
                String codigo = this.vistaEstudiante.txtCodigo.getText();
                String nombre = this.vistaEstudiante.txtNombre.getText();
                String apellido = this.vistaEstudiante.txtApellido.getText();
                String direccion = this.vistaEstudiante.txtDireccion.getText();
                String telefono = this.vistaEstudiante.txtTelefono.getText();
                
                estudiante.setCodigo(codigo);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);
                estudiante.setDireccion(direccion);
                estudiante.setTelefono(telefono);
            }else{
                vistaEstudiante.areaMostrar.setText(estudiante.nombreCompleto());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
