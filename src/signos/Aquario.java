package signos;

import java.util.ArrayList;

import aula4.rand;


public class Aquario {
    static byte c = (byte) rand.d5();
        public static void aquario() {
            ArrayList<String> frases = new ArrayList<>();
            frases.add("Aquário é independente e valoriza sua liberdade e individualidade.");
            frases.add("Aquário é humanitário e preocupado com o bem-estar da sociedade como um todo.");
            frases.add("Aquário é idealista e luta por causas sociais e pela igualdade.");
            frases.add("Aquário é amigável e gosta de se envolver em grupos e comunidades.");
            frases.add("Aquário é visionário e tem uma visão ampla e futurista.");

            System.out.println(frases.get(c));

            c++;
            if(c>=5){
                c=0;
            }
        }
}
