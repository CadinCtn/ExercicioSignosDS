package signos;
import java.util.ArrayList;

import aula4.rand;
public class Cancer {
    static byte c = (byte) rand.d5();
    public static void cancer() {

        ArrayList<String> frases = new ArrayList<>();
        frases.add("Cancerianos são emocionais e sensíveis, têm um grande coração.");
        frases.add("Cancerianos são protetores e se importam profundamente com seus entes queridos.");
        frases.add("Cancerianos são leais e valorizam muito a família e os amigos próximos.");
        frases.add("Cancerianos são intuitivos e confiam em sua intuição para tomar decisões.");
        frases.add("Cancerianos são cuidadosos e atenciosos, sempre se preocupam com o bem-estar dos outros.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }
}
