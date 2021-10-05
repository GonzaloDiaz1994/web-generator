package archivos;
import java.io.File;

public class ArchivoHTML extends Archivo {

    public ArchivoHTML(String nombreArchivo) {
        super(nombreArchivo);
    }

    @Override
    public String generarArchivo() {
        String nombre = this.nombreArchivo + ".html";
        File archivohtml = new File(nombre);
        return nombre;
    }
}
