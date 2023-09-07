package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        /*
        L'ereditarietà mi serve:
        - per avere classi con le stesse caratteristiche:
            - in modo più rapido e sintetico
            - senza fare errori (faccio la stessa cosa in modo diverso)
        - per poter maneggiare cose diverse insieme - perché anche se sono diverse sono in qualche modo dello stesso tipo
          es una lista di forme può contenere tanti oggetti di tipo diverso ma che estendono Shape
        - grazie alle interfacce mi assicuro che oggetti di tipo diverso, ma accomunati dall'avere tutti la stessa interfaccia
          abbiano tutti gli stessi metodi, così che posso usarli tutti insieme.
         */

        List<Shape> forme = new ArrayList<>();
        forme.add(new Triangle(3, 5, 7));
        forme.add(new Square(5));
        forme.add(new Circle(4));
        forme.add(new Hexaedrum());

        for (Shape s : forme) {
            System.out.println("Il " + s.name + " ha " + s.numbOfSegments + " lati.");
        }

        // il primo elemento della lista È un triangolo, però Java non lo sa. l'unica cosa che sa java è che è una Forma
        // posso forzare la mano, e dire a Java FIDATI, è un triangolo -> operazione di cast (Triangle)
        // System.out.println(((Square) forme.get(0)).area());

        for (Shape s : forme) {
            System.out.println("Ho un " + s.name + " di area " + s.area());
        }

        /*
        Le classi che servono solo a questo scopo non ha senso che vengano istanziate,
        quindi si dichiarano astratte e non mi è permesso creare istanze (cioè oggetti)
         */

        // Shape s = new Shape();





    }
}