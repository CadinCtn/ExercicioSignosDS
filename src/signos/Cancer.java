package signos;
import java.util.ArrayList;

import aula4.rand;
public class Cancer {
    static byte c = (byte) rand.d5();
    public static void cancer() {

        ArrayList<String> frases = new ArrayList<>();
        frases.add("Cancerianos s�o emocionais e sens�veis, t�m um grande cora��o.");
        frases.add("Cancerianos s�o protetores e se importam profundamente com seus entes queridos.");
        frases.add("Cancerianos s�o leais e valorizam muito a fam�lia e os amigos pr�ximos.");
        frases.add("Cancerianos s�o intuitivos e confiam em sua intui��o para tomar decis�es.");
        frases.add("Cancerianos s�o cuidadosos e atenciosos, sempre se preocupam com o bem-estar dos outros.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }
}
