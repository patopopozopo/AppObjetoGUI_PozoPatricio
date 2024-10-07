package modelo;

public class Usuario {
    
    private String rut;
    private String nombre;
    private int edad;
    private String correo;
    private String contraseña;
    
    public Usuario(String rut, String nombre, int edad, String correo, String contraseña) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    

    
    
}

