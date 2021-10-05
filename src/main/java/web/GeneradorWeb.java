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

    public void generarWeb(){
        this.completarArchivo("index");
        for (String seccion : secciones){
            this.completarArchivo(seccion);
        }
    }

    public void completarArchivo(String nombreArchivo){
        ArchivoHTML archivoHTML;
        Pagina pagina;
        archivoHTML = new ArchivoHTML(nombreArchivo);
        pagina = new Pagina(generadorCodigo.generarCodigo(), archivoHTML);
        pagina.escribirCodigoEnArchivo();
    }

}
