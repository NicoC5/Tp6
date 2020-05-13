package tp6;
//@author Nicolas
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String ciudad;
    private String direccion;
    public Cliente(String nombre, String apellido, int dni, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    /*Las siguientes son las principales diferencias entre HashMap y TreeMap. ...
    HashMap usa el método equals () en comparación, mientras que TreeMap usa el método compareTo () para mantener el orden.
    HashMap implementa la interfaz de mapas mientras que TreeMap implementa la interfaz de NavigableMap.
    Entonces te recomiendo usar un TreeMap si no tenés idea de cuántos elementos vas a tener en tu colección (es más lento).
    Usar un HashMap si no necesitas orden y no será demasiado grande.
    Usar un LinkedHashMap si un HashMap va bien con sus restricciones y querés tener la ventaja adicional de ordenar.
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
