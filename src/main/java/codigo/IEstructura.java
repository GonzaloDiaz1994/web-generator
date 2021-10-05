package codigo;

public interface IEstructura {

    default String openPage(){
        return "<!DOCTYPE html>"+
                "\n<html lang=\"es-ES\">";
    }
    default String closePage(){
        return "</html>";
    }
    default String title(String aTitle){
        String  nombrePagina = aTitle.toUpperCase().charAt(0) + aTitle.substring(1).toLowerCase();
        return " <head>" +
                "\n  <meta charset=\"utf-8\">" +
                "\n  <title>" + nombrePagina + "</title>" +
                "\n<link\n" +
                "      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\"\n" +
                "      rel=\"stylesheet\"\n" +
                "      integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\"\n" +
                "      crossorigin=\"anonymous\"\n" +
                "    />" +
                "\n </head>";
    }
    default String openBody(){
        return "   <body>\n";
    }
    default String footer(){
        return "<div>\n" +
                "      <footer style=\"position: absolute; bottom: 0; text-align: center; width: 100%; background-color: black; color: white; \">\n" +
                "        <p>Author: Gonzalo<br /></p>\n" +
                "      </footer>\n" +
                "    </div>";
    }
    default String closeBody(){
        return "   </body>";
    }

}
