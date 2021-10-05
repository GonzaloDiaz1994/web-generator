//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        IPage page = new ArticlePage();
//        System.out.println(page.openPage());
//        System.out.println(page.title("prueba"));
//        System.out.println(page.openBody());
//        System.out.println(page.navBar("nada", "articulos", List.of("articulos","about")));
//        System.out.println(page.closeBody());
//        System.out.println(page.closePage());
//
//    }
//}

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class Exercise {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};

        myPrinter.print(intArray);
        myPrinter.print(stringArray);

        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("print"))
                count++;
        }

        if(count > 1) System.out.println("Method overloading is not allowed!");

    }
}

class Printer
{

    public <T> void print(T[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }

}