/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

public class ControladorUsuario {

    private Usuario usuario;
    private Telefono telefono;
    ControladorGenerico<Usuario> lista = new ControladorGenerico();
    ControladorGenerico<Telefono> listaa = new ControladorGenerico();

    public void agregarLista(Usuario persona) {
        lista.agregarLista(persona);
        show();
    }

    public void show() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.read(i));
        }
    }

    public Usuario validarUsuario(String correo, String pass) {
        Usuario usr = null;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.read(i).getCorreo().equalsIgnoreCase(correo) && (lista.read(i).getContraseña().equalsIgnoreCase(pass))) {
                usr = lista.read(i);
            }
        }
        return usr;
    }

    public Usuario buscar(String cedula) {
        Usuario usr = null;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.read(i).getCedula().equals(cedula)) {
                usr = lista.read(i);
            }
        }
        return usr;
    }

    public void agregarTelefono(Telefono telefono) {
        telefono.setUsuario(usuario);
        listaa.create(telefono);

    }

    public void eliminarTelefono(int codigo) {

        if (telefono != null) {

            usuario.eliminarTelefono(telefono);

            telefono = null;
        }
    }

    public void actualizarTelefono(int codigo, String numero, String tipo, String operadora) {
        telefono = new Telefono(codigo, numero, tipo, operadora);

        usuario.actualizarTelefono(telefono);

    }

    public void show1() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.read(i));
        }
    }

    public List<Telefono> listarTelefonos() {
        for (int i = 0; i < listaa.size(); i++) {
            System.out.println(listaa.read(i));
        }
        return (List<Telefono>) listaa;
    }
}
