package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Persoon> personen = new ArrayList<>();

        System.out.print("Geef naam (<RETURN> om te stoppen): ");

        String naam =scanner.nextLine();

        while(! "".equals(naam)){

            System.out.print("Geef lengte: ");

            double lengte = Double.parseDouble(scanner.nextLine());

            System.out.print("Geef gewicht: ");

            int gewicht = Integer.parseInt(scanner.nextLine());

            personen.add(new Persoon(naam, lengte, gewicht));
            System.out.print("Geef naam (<RETURN> om te stoppen): ");

            naam =scanner.nextLine();
        }

        filterOpBMI(personen);

        System.out.println("Personen met goede BMI:");

        for(Persoon p: personen){

            System.out.printf("%s (lengte:%.2f, gewicht: %d) heeft een BMI van %.2f%n", p.getNaam(), p.getLengte(), p.getGewicht(), p.getBMI());
        }

    }


    private static void filterOpBMI(ArrayList<Persoon> personen) {


        Iterator<Persoon> iter = personen.iterator();


        while (iter.hasNext()) {

            Persoon p = iter.next();

            if (p.getBMI() > 30 || p.getBMI() < 18.5) {  //18.5   en    24.9

                iter.remove();

            }

        }
    }

}



