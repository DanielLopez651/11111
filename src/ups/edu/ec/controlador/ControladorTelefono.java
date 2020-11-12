/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class ControladorTelefono {
     private Telefono telefono;
    private Usuario usuario;
    ControladorGenerico<Telefono> listaa = new ControladorGenerico();

    public void agregarLista(Telefono telefono) {
        listaa.agregarLista(telefono);
        show();
    }
        public void show(){
        for (int i = 0; i < listaa.size(); i++) {
            System.out.println(listaa.read(i));
        }
    }
      
        
    
    public List<Telefono> verTelefonos() {
         return (List<Telefono>) listaa;
//        List<Telefono> telefonos;
//        telefonos = telefonosDAO.findAll();
//        return telefonos;
       
    }
}
