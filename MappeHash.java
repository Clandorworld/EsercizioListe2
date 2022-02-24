import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Map;

public class MappeHash {
    public static void main(String[] args) {
        //Gli elementi (cioè il primo), avranno un "valore" (il secondo) e solo quello
        //Gli elementi sono messi in ordine casuale
        Map m = new HashMap();
        m.put("tim",5);
        m.put("joe","x");
        m.put(11,999);

        System.out.println(m);


        //Se uso TreeMap, mi darà i valori in ordine alfabetico
        Map q = new TreeMap();
        q.put("silvia",32);
        q.put("daniele",42);
        q.put("eleonora",43);

        System.out.println(q);
        //Se uso LinkedHashMao, mi darà i valori in ordine di come gli ho aggiunti

        Map esempio = new HashMap();
        //In questo esempio si conteranno quante lettere ci sono nella frase
        String frase = "Il mio nome è Daniele";
        for(char x:frase.toCharArray()){
            if (esempio.containsKey(x)){
                int old = (int) esempio.get(x);
                esempio.put(x, old+1);
            }
            else {
                esempio.put(x, 1);
            }
        }
        //il primo spazio vuoto, conta appunto anche gli spazi
        System.out.println("La frase...");
        System.out.println(frase);
        System.out.println("contiene...");
        System.out.println(esempio);
    }
}
