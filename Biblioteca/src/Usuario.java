public class Usuario {
    private String nombre;
    private String idenfificacion;
    private String historialPrestamos;



    public Usuario(String nombre, String idenfificacion) {
        this.nombre = nombre;
        this.idenfificacion = idenfificacion;
    }

    public Usuario(String nombre, String idenfificacion, String historialPrestamos) {
        this.nombre = nombre;
        this.idenfificacion = idenfificacion;
        this.historialPrestamos = historialPrestamos;
    }

    public void solicitarPrestamo(){
            
    }

    public void devolverLibro(){
        
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdenfificacion() {
        return idenfificacion;
    }

    public void setIdenfificacion(String idenfificacion) {
        this.idenfificacion = idenfificacion;
    }

    public String getHistorialPrestamos() {
        return historialPrestamos;
    }

    public void setHistorialPrestamos(String historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    
    
}
