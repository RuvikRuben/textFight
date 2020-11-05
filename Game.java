package Projekt;

import java.util.Random;
import java.util.Scanner;



public class Game {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    Random rand = new Random();
    Random num = new Random();


    public static void main(String[] args) {



        Game textFight = new Game();

        textFight.start();

    }

    public void start(){


        System.out.println("Jesteś w karczmie wybierz bohaterów aby utworzyć drużynę.\n");

        String[] adventures = {"Wojownik","Złodziej","Bard    ","Paladyn ","Mag     ","Kleryk  ","Bard    "};
        String[] team = new String[6];
        boolean dosc = false;
        int number = 0;

        do {
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║   Liczba osób w drużynie: "+number+"   ║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println("║ A • Dodaj członka drużyny     ║");
            System.out.println("║ B • Wyświetl aktualną drużynę ║");
            System.out.println("║ C • Zakończ i wyrusz w drogę  ║");
            System.out.println("╚═══════════════════════════════╝");

            //System.out.println("Liczba osób w dużynie: " + number + "\nA - dodaj członka z karczmy" + "\nB - wyświetl aktualną drużynę\nC - zakończ i wyrusz w drogę");
            String choice = (myScanner.next()).toLowerCase();

            switch (choice) {
                case ("a") -> {
                    System.out.println("╔═════════════════════════════════╗");
                    System.out.println("║ Osoby znajdujące się w tawernie ║");
                    for (int i = 0; i < adventures.length; i++) {
                        System.out.println("╠═════════════════════════════════╣");

                        if(adventures[i] !="") System.out.println("║ [" + i + "] " + adventures[i]+"                    ║");

                    }
                    System.out.println("╚═════════════════════════════════╝");
                    int wyb = myScanner.nextInt();


                    if (wyb >= 0 && wyb <= adventures.length) {
                        if (adventures[wyb] != "")
                        {
                            team[number] = adventures[wyb];
                            adventures[wyb] = "Postać została już wybrana";
                            number++;
                        }

                        if (number == 6) dosc = true;

                    }
                    else {
                        System.out.println("╔════════════════════════════════════════╗");
                        System.out.println("║ Nie ma takiej opcji! Spróbuj ponownie. ║");
                        System.out.println("╚════════════════════════════════════════╝");
                    }
                }
                case ("b") -> {
                    if (number == 0) System.out.println("Musisz mieć przynajmiej jednego członka w drużynie");
                    else {
                        System.out.println("╔══════════════════╗");
                        System.out.println("║ Twoja drużyna    ║");
                        System.out.println("╠══════════════════╣");
                        for (int i = 0; i < number; i++) {
                            int p1=i+1;
                            System.out.println("║ [" + p1 + "] • " + team[i]+"   ║");
                        }
                        System.out.println("╚══════════════════╝");
                    }
                }
                case ("c") -> {
                    if (number == 0) System.out.println("Musisz mieć przynajmiej jednego członka w drużynie");
                    else {
                        dosc = true;
                        System.out.println("╔══════════════════╗");
                        System.out.println("║ Twoja drużyna    ║");
                        System.out.println("╠══════════════════╣");
                        for (int i = 0; i < number; i++) {
                            int p1=i+1;
                            System.out.println("║ [" + p1 + "] • " + team[i]+"   ║");
                        }
                        System.out.println("╚══════════════════╝");
                    }

                }
                default -> {
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║ Nie ma takiej opcji! Spróbuj ponownie. ║");
                System.out.println("╚════════════════════════════════════════╝"); System.out.println("Nope");
            }}


        }while (!dosc);


    }











}
