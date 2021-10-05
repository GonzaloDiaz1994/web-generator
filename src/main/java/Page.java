public class Page {

    public String openPage(){

        return "<!DOCTYPE html>"+
                "\n<html lang='es-ES'>";
    }

    public String title(String aTitle){
        return " <head>" +
                "\n  <meta charset='utf-8'>" +
                "\n  <title>" + aTitle + "</title>" +
                "\n </head>";
    }

    public String openBody(){
        return "   <body>\n";
    }

    public String closeBody(){
        return "   </body>";
    }

    public String closePage(){
        return "</html>";
    }
}
