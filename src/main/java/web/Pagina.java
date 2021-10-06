package web;

import archivos.Archivo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pagina {

    private final String codigo;
    private final Archivo archivo;

    public Pagina(String codigo, Archivo archivo){
        this.codigo = codigo;
        this.archivo = archivo;
    }


    /**
     * Escribe el codigo en el archivo.
     * **/
    public void escribirCodigoEnArchivo() {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.archivo.generarArchivo()));
            bufferedWriter.write(this.codigo);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
