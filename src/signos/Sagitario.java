package signos;

import aula4.rand;
import java.util.ArrayList;

public class Sagitario {
    static byte c = (byte) rand.d5();
    public static void sagitario(){
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Sagit�rio � aventureiro e est� sempre em busca de novas experi�ncias e aventuras");
        frases.add("Sagit�rio � otimista e possui uma vis�o positiva da vida.");
        frases.add("Sagit�rio � sincero e direto, n�o tem medo de falar o que pensa.");
        frases.add("Sagit�rio � intelectual e est� sempre em busca de conhecimento e aprendizado.");
        frases.add("Sagit�rio � entusiasta e contagia os outros com sua energia e paix�o.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }

    }
}
