package web;

import archivos.ArchivoHTML;
import codigo.GeneradorCodigo;
import java.util.List;

public class GeneradorWeb {

    private final GeneradorCodigo generadorCodigo;
    private final List<String> secciones;

    public GeneradorWeb(GeneradorCodigo generadorCodigo, List<String> secciones){
        this.generadorCodigo = generadorCodigo;
        this.secciones = secciones;
    }


    /**
     * Crea el archivo index junto con los archivos elegidos por el usuario.
     * **/
    public void generarWeb(){
        this.completarArchivo("index");
        for (String seccion : secciones){
            this.completarArchivo(seccion);
        }
    }

    /**
     * recibe el nombre de un archivo y lo crea con el codigo dentro.
     * **/
    public void completarArchivo(String nombreArchivo){
        ArchivoHTML archivoHTML = new ArchivoHTML(nombreArchivo);
        Pagina pagina = new Pagina(generadorCodigo.generarCodigo(), archivoHTML);
        pagina.escribirCodigoEnArchivo();
    }

}
