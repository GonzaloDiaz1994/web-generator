import codigo.GeneradorCodigo;
import web.GeneradorWeb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        /* inputs del usuario */
        System.out.println("Nombre de la pagina: ");
        String nombre_pagina = input.nextLine();
        System.out.println("URL del Logo de la pagina: ");
        String url_logo = input.nextLine();
        System.out.println("Cantidad de secciones: ");
        int cantidadSecciones = Integer.parseInt(input.nextLine());
        List<String> secciones = new ArrayList<>();

        while (cantidadSecciones > 0){
            System.out.println("Escriba el nombre de una seccion y pulse enter");
            String seccion = input.nextLine().toLowerCase();
            secciones.add(seccion);
            cantidadSecciones -= 1;
        }

        /* genera el codigo y la web */
        GeneradorCodigo generadorCodigo = new GeneradorCodigo(secciones,nombre_pagina,url_logo);
        GeneradorWeb generadorWeb = new GeneradorWeb(generadorCodigo, secciones);
        generadorWeb.generarWeb();
        System.out.println("FIN");
    }

}
