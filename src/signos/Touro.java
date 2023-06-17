package signos;
import java.util.ArrayList;

import aula4.rand;

public class Touro {
    static byte c = (byte) rand.d5();
    public static void touro() {

        ArrayList<String> caracteristica = new ArrayList<>();
        caracteristica.add("desfrutar");
        caracteristica.add("apreciar");
        caracteristica.add("nutrir");
        caracteristica.add("possuir");
        caracteristica.add("resistir");

        ArrayList<String> caracteristica2 = new ArrayList<>();
        caracteristica2.add("preservar");
        caracteristica2.add("saborear");
        caracteristica2.add("relaxar");
        caracteristica2.add("estabilizar");
        caracteristica2.add("persistir");

        ArrayList<String> frases = new ArrayList<>();
        frases.add("Os taurinos são conhecidos por sua paciência inabalável, o que os capacita a " + caracteristica.get(rand.d5()) + " e " + caracteristica2.get(rand.d5()) + ", enfrentando obstáculos com determinação e mantendo uma perspectiva calma e equilibrada.");
        frases.add("Lema dos taurinos: Devagar se vai longe, " + caracteristica.get(rand.d5()) + " e " + caracteristica2.get(rand.d5()));
        frases.add("Taurinos são teimosos e obstinados, sempre querem ter razão, não desistem facil dos seus objetivos");
        frases.add("Taurinos são amantes do conforto e do luxo, sempre procuram viver bem.");
        frases.add("Taurinos são trabalhadores e persistentes, não desistem facilmente.");


        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }

    }

}
