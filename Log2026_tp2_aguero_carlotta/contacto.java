
/**
 * Write a description of class contacto here.
 * 
 * @author (aguero - carlotta) 
 * @version (a version number or a date)
 */
public class contacto
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String localidad;
    private String direccion;
    
    private String[] telefono;
    
    //constructor
    public contacto(String nombre, String localidad, String direccion, String telefono){
                    this.telefono = new String[5];
                    // solucion 1
                    this.nombre = nombre.toUpperCase();
                    this.localidad = localidad.toUpperCase();
                    this.direccion = direccion.toUpperCase();
                    
                    // solucion 2
                    //setNombre(nombre):
                    //setLocalidad(localidad):
                    //setDireccion(direccion):
    }
    
    //getters / setters //
    // nombre 
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre ) {
        this.nombre = nombre.toUpperCase();
    }
    
    //localidad
    public String getLocalidad() {
        return this.localidad;
    }
    public void setLocalidad(String localidad ) {
        this.localidad = localidad.toUpperCase();
    }
    
    
    // direccion 
    public String getDireccion() {return this.direccion;}
    public void setDireccion(String direccion ) {
        this.direccion = direccion.toUpperCase();
    }
    
    
    //telefono 
    public String[] getTelefono() {return this.telefono;}
    public void setTelefono (String direccion ) {this.telefono = telefono; 
    }
}
    
    
    
    