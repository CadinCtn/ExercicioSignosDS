package signos;

import aula4.rand;
import java.util.ArrayList;


public class Aries {
    static byte c = (byte) rand.d5();
    public static void aries() {



        ArrayList<String> caracteristica = new ArrayList<String>();
        caracteristica.add("impulsionar");
        caracteristica.add("desbravar");
        caracteristica.add("aventurar-se");
        caracteristica.add("iniciar");
        caracteristica.add("liderar");


        ArrayList<String> caracteristica2 = new ArrayList<String>();
        caracteristica2.add("empreender");
        caracteristica2.add("correr riscos");
        caracteristica2.add("ser independente");
        caracteristica2.add("ser determinado");
        caracteristica2.add("ser ousado");


        ArrayList<String> fraseRand = new ArrayList<String>();
        fraseRand.add(" Os arianos s�o dotados de uma energia inesgot�vel, o que os impulsiona a " + caracteristica.get(rand.d5()) + " e " +  caracteristica2.get(rand.d5()) + ", buscando constantemente novos desafios para superar.");
        fraseRand.add(" A personalidade ariana � marcada por uma coragem intr�pida, que os leva a " + caracteristica.get(rand.d5()) + " sem hesita��o, enfrentando qualquer obst�culo que surja em seu caminho.");
        fraseRand.add(" Arianos s�o l�deres natos, capazes de " + caracteristica2.get(rand.d5()) + " com uma determina��o feroz e inspirar aqueles ao seu redor a alcan�arem seu potencial m�ximo.");
        fraseRand.add(" Os arianos s�o apaixonados por " + caracteristica.get(rand.d5())  + " em novos projetos e colocar seu cora��o e alma em tudo o que fazem.");
        fraseRand.add(" Arianos adoram " + caracteristica2.get(rand.d5()) + " novos desafios e superar obst�culos que surgem em seu caminho.");

        System.out.println(fraseRand.get(c));

        c++;
        if(c>=5){
            c=0;
        }

    }

}