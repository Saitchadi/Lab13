package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author SALAH
 * a claas named Census that opens a files and returns the first 100 persons of the list in that file.
 */
public class Census {

    public static HashMap<String, Surname> loadCensusData(String fname) {

        HashMap<String, Surname> namelist = new HashMap<>();

        String name;
        int rank;
        int count;
        double proposition;

        File file = new File(fname);

        try (Scanner input = new Scanner (file);){
            input.nextLine();
            while (input.hasNext()) {

                String s = input.nextLine();

                String str[]= s.split(",");
                name = str[0];
                rank = Integer.parseInt(str[1]);
                count = Integer.parseInt(str[2]);
                proposition = Double.parseDouble(str[3]);

                namelist.put(name, new Surname(name,rank, count,proposition) );

            }
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot access file " + fname);
        }

        return namelist;
    }
}