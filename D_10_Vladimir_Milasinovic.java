package Domaci;

import java.util.Scanner;

public class Domaci11 {
    public static void main(String[] args) {
//3. Napraviti program za korpu voca, izracunati sumu cena,
// ako znamo da jabuke kostaju 50 din, kruske 100 din i banane 140 din, tako da se suma
//racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
// toliko dodajemo na sumu, kada se unese ".",
//program izlazi iz petlje i pise ukupnu cenu navedenog voca.
        Scanner s = new Scanner(System.in);
        int jabuke = 50;
        int kruske = 100;
        int banane = 140;
        System.out.println("Uneti voce ");
        String voce= s.next();
        int suma = 0;
        while (!voce.equals(".")){
            if(voce.equals("jabuke")){
                suma=suma + jabuke;
            }
            else if(voce.equals("kruske")){
                suma=suma + kruske;
            }
            else if(voce.equals("banane")){
                suma=suma + banane;
            }
            System.out.println("Unesi voce");
            voce= s.next();
        }
        System.out.println(suma);
    }
}
