public class Libro {
    private String titulo;
    private String autor;
    private int anyoPublicacion;
    private int numPaginas;
    private String ISBN;
    private int numCopiasDisponibles;



    /*  He creado un constructor ,que siempre debe de 
    tener el nombre propio de la clase.
    Respecto a los parametros, los deseados segun la necesidad.
    */
    public Libro(String titulo, String autor, int anyoPublicacion, int numPaginas, String ISBN, int numCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
        this.numCopiasDisponibles = numCopias;
    }


    public void gestionarPrestamo(){

        if (numCopiasDisponibles > 0) {
            numCopiasDisponibles--;
            System.out.println("Prestado. Copias disponibles: " + numCopiasDisponibles);
        } else {
            System.out.println("No hay copias del libro.");
        }

    }

    public void devolucionLibro(){
        numCopiasDisponibles++;
        System.out.println("Libro " + titulo + " devuelto.");
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getNumCopiasDisponibles() {
        return numCopiasDisponibles;
    }

    public void setNumCopiasDisponibles(int numCopiasDisponibles) {
        this.numCopiasDisponibles = numCopiasDisponibles;
    }

  
}
