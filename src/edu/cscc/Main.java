package edu.cscc;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Salah aitchadi, 10/29/2019.
 * This program generate a report based on a file.
 */
public class Main {
    private final static String CENSUSDATAFNAME = "Surnames_2010Census.csv";
    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String,Surname> namelist = Census.loadCensusData(CENSUSDATAFNAME);


        while (true) {
            System.out.print("Enter a name (or 'quit' to end): ");
            String name = input.nextLine().trim();
            if ("quit".equalsIgnoreCase(name)) break;

            Surname s = namelist.get(name.toUpperCase());

            if (s != null) {
                System.out.println("Surname: "+s.getName()+" rank: "+s.getRank()+" count: "+s.getCount()+" proposition: "+s.getProportion());
            } else {
                System.out.println("Name " + name + " not found");
            }
        }
    }
}