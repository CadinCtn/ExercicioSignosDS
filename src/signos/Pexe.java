package signos;
import java.util.ArrayList;
import aula4.rand;
public class Pexe {
    static byte c = (byte) rand.d5();
    public static void pexe(){
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Peixes � intuitivo e possui uma forte conex�o com o mundo emocional e espiritual.");
        frases.add("Peixes � emp�tico e sens�vel, capaz de se conectar profundamente com os sentimentos dos outros.");
        frases.add("Peixes � idealista e busca um mundo de amor, compaix�o e harmonia.");
        frases.add("Peixes � emocionalmente profundo e pode sentir as energias ao seu redor de maneira intensa.");
        frases.add("Peixes � sonhador e espiritual, buscando uma conex�o maior com o universo.");

        System.out.println(frases.get(c));
        c++;
        if(c>=5){
            c=0;
        }


    }
}
