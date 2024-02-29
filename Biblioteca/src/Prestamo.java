public class Prestamo {
    private int fechaPrestamo;
    private int fechaDevolucion;
    private String estadoPrestamo;


    public Prestamo(int fechaPrestamo, int fechaDevolucion, String estadoPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estadoPrestamo = estadoPrestamo;
    }

    public void prestamoCompletado(){

    }

    public void verificarEstado(){
        
    }


    public int getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(int fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(int fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

   
}
