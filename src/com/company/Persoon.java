package com.company;

public class Persoon implements Comparable<Persoon> {

    private String naam;
    private double lengte;
    private int gewicht;


    public Persoon(String naam, double lengte, int gewicht) {

        this.naam = naam;
        this.lengte = lengte;
        this.gewicht = gewicht;
    }

    public double getBMI () {

        double BMI  = this.gewicht / (lengte*lengte);

        return BMI;
    }

    public String getNaam() {
        return this.naam;

    }
    public double getLengte() {
        return this.lengte;

    }

    public int getGewicht() {
        return this.gewicht;
    }


    @Override
    public int compareTo(Persoon o) {

        if (this.getBMI() == o.getBMI())

            return 0;

        else if (this.getBMI() < o.getBMI())
            return 1;
        else
            return -1;

    }
}
