package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author SALAH
 * a claas named Census that opens a files and returns the first 100 persons of the list in that file.
 */
public class Census {
    public static Surname[] loadCensusData(String fname) {
        int line = 0; // Keep track of lines of file we've read
        Surname[] namelist = new Surname[100];

        // TODO - Add code to read file and populate array of Surname objects
        String name;
        int rank;
        int count;
        double proposition;

        File file = new File(fname);

        try (Scanner input = new Scanner (file);){
            input.nextLine();
            for (line = 0;line<100 && input.hasNext();line++) {

                String s = input.nextLine();

                String str[]= s.split(",");
                name = str[0];
                rank = Integer.parseInt(str[1]);
                count = Integer.parseInt(str[2]);
                proposition = Double.parseDouble(str[3]);

                namelist[line] = new Surname(name,rank, count,proposition) ;

            }
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot access file " + fname);
        }

        return namelist;
    }
}