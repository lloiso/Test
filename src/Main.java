import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int health = 10;
        boolean haveHealSpell = false;


//        if (health < 20){
//            if (health < 0){
//                System.out.println("Противник повержен!");
//            } else if (haveHealSpell){
//                System.out.println("Противник вылечился!");
//            }else {
//                System.out.println("Противник убежал!");
//            }
//        }else {
//            System.out.println("Противник атакует игрока!");
//        }







        if (health < 0) {
            System.out.println("Противник повержен!");
        } else if (health < 20) {
            if (haveHealSpell) {
                System.out.println("Противник вылечился!");
            } else {
                System.out.println("Противник убежал!");
            }
        } else {
            System.out.println("Противник атакует игрока!");
        }



    }
}



