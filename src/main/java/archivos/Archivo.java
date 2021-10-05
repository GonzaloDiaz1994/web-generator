package archivos;

public abstract class Archivo {

    protected String nombreArchivo;

    public Archivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public abstract String generarArchivo();

}