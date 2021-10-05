import java.util.List;

public interface IPage {

    default String openPage(){
        return "<!DOCTYPE html>"+
                "\n<html lang=\"es-ES\">";
    }
    default String closePage(){
        return "</html>";
    }
    default String title(String aTitle){
        return " <head>" +
                "\n  <meta charset=\"utf-8\">" +
                "\n  <title>" + aTitle + "</title>" +
                "\n </head>";
    }
    default String openBody(){
        return "   <body>\n";
    }
    default String closeBody(){
        return "   </body>";
    }

    default String navBar(String logo, String namePage, List<String> allNames){
        String listPages = "";
        for (String name : allNames){
            listPages = listPages + elementNav(name);
        }
        return "<nav class=\"navbar navbar-expand-lg navbar-light bg-primary\">\n" +
                "      <ul class=\"navbar-nav\">\n" +
                this.logoNav(logo, namePage) +
                listPages +
                "      </ul>\n" +
                "    </nav>";
    }

    default String logoNav(String logo, String name){
        return "<li class=\"nav-item>\"\n" +
                "   <a class=\"navbar-brand\" href=\"index.html\">\n" +
                "   <img\n" +
                "       src=\""+logo+"\"\n" +
                "       alt=\"\"\n" +
                "       width=30\n" +
                "       height=24\n" +
                "       class=\"d-inline-block align-text-top\"\n" +
                "  />\n" +
                "  "+name+"\n" +
                "  </a>+\n" +
                "  </li>\n";
    }

    default String elementNav(String name){
        String file = name.toLowerCase();
        String lname = file.toUpperCase().charAt(0) + file.substring(1).toLowerCase();
        return "    <li class=\"nav-item\">" +
                " <a class=\"nav-link\" href=\""+file+".html\">"+lname+"</a>" +
                " </li>\n";
    }

    String item();

}
