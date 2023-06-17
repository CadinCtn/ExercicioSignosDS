package signos;
import aula4.rand;

import java.util.ArrayList;

public class Gemeos {
    static byte c = (byte) rand.d5();
    public static void gemeos() {

        ArrayList<String> frases =new ArrayList<>();
        frases.add("Gêmeos são comunicativos e adoram conversar, são mestres na arte da conversa.");
        frases.add("Gêmeos são curiosos e estão sempre em busca de novos conhecimentos e experiências");
        frases.add("Gêmeos são versáteis e adaptáveis, conseguem se ajustar facilmente a diferentes situações.");
        frases.add("Gêmeos são sociáveis e têm uma grande facilidade em fazer amigos.");
        frases.add("Gêmeos são inquietos e estão sempre em movimento, gostam de variar e experimentar coisas novas");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }
}
