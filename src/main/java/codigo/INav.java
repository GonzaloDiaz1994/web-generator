package codigo;

import java.util.List;

public interface INav {

    default String navBar(String logo, String nombrePagina, List<String> secciones){
        String listPages = "";
        for (String seccion : secciones){
            listPages = listPages + elementNav(seccion);
        }
        return "<nav class=\"navbar navbar-expand-lg navbar-light bg-primary\">\n" +
                "      <ul class=\"navbar-nav\">\n" +
                this.logoNav(logo, nombrePagina) +
                listPages +
                "      </ul>\n" +
                "    </nav>";
    }

    default String logoNav(String logo, String nombre){
        String nombrePagina = nombre.toUpperCase().charAt(0) + nombre.substring(1).toLowerCase();
        return "<li class=\"nav-item\">\n" +
                "   <a class=\"navbar-brand\" href=\"index.html\">\n" +
                "   <img\n" +
                "       src=\""+logo+"\"\n" +
                "       alt=\"\"\n" +
                "       width=30\n" +
                "       height=24\n" +
                "       class=\"d-inline-block align-text-top\"\n" +
                "  />\n" +
                "  "+nombrePagina+"\n" +
                "  </a>\n" +
                "  </li>\n";
    }

    default String elementNav(String nombre){
        String file = nombre.toLowerCase();
        String lname = file.toUpperCase().charAt(0) + file.substring(1).toLowerCase();
        return "    <li class=\"nav-item\">" +
                " <a class=\"nav-link\" href=\""+file+".html\">"+lname+"</a>" +
                " </li>\n";
    }
}
