package signos;
import aula4.rand;

import java.util.ArrayList;

public class Gemeos {
    static byte c = (byte) rand.d5();
    public static void gemeos() {

        ArrayList<String> frases =new ArrayList<>();
        frases.add("G�meos s�o comunicativos e adoram conversar, s�o mestres na arte da conversa.");
        frases.add("G�meos s�o curiosos e est�o sempre em busca de novos conhecimentos e experi�ncias");
        frases.add("G�meos s�o vers�teis e adapt�veis, conseguem se ajustar facilmente a diferentes situa��es.");
        frases.add("G�meos s�o soci�veis e t�m uma grande facilidade em fazer amigos.");
        frases.add("G�meos s�o inquietos e est�o sempre em movimento, gostam de variar e experimentar coisas novas");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }
}
