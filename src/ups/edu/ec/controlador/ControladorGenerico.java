package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.modelo.Telefono;

public class ControladorGenerico<T> {

    private int codigo;
    private Telefono telefono;
    private List<T> listado;
    private List<T> listaTelefono;

    public ControladorGenerico() {
        listado = new ArrayList();
        codigo = 0;
    }

    public void agregarLista(T objectos) {
        listado.add(objectos);
    }

    public int size() {
        return listado.size();
    }

    public T read(int i) {
        return listado.get(i);
    }

    public T delete(int i) {
        return listado.remove(i);
    }

    public int obtenerUltimoCodigo() {
        return codigo;

    }

    public void create(T telefonoob) {

        listado.add(telefonoob);
    }

    public T readT(int j) {

        return listado.get(j);
    }

    public T deleteT(int j) {
        return listado.remove(j);
    }

}
