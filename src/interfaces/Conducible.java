package interfaces;

public interface Conducible {
    /**
     * Description: Este método muestra en pantalla
     * la acción de conducir dependiendo del vehículo
     * de la clase instanciada.
     * */
    void conducir();
    /**
     * Description: Este método hace explotar al
     * vehículo de la clase instanciada.
     * */
    void explotar();
    /**
     * Description: Este método permite agregar
     * una modificación al vehículo de la clase instanciada.
     * @param nombreModificacion Se requiere ingresar el nombre
     *                           de la modificacion.
     * */
    void añadirModificacion(String nombreModificacion);
    void Rodar();
}
