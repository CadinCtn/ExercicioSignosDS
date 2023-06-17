package signos;
import java.util.ArrayList;
import aula4.rand;
public class Pexe {
    static byte c = (byte) rand.d5();
    public static void pexe(){
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Peixes é intuitivo e possui uma forte conexão com o mundo emocional e espiritual.");
        frases.add("Peixes é empático e sensível, capaz de se conectar profundamente com os sentimentos dos outros.");
        frases.add("Peixes é idealista e busca um mundo de amor, compaixão e harmonia.");
        frases.add("Peixes é emocionalmente profundo e pode sentir as energias ao seu redor de maneira intensa.");
        frases.add("Peixes é sonhador e espiritual, buscando uma conexão maior com o universo.");

        System.out.println(frases.get(c));
        c++;
        if(c>=5){
            c=0;
        }


    }
}
