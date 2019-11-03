package edu.cscc;

/**
 * @author SALAH
 * a class named Surname.
 */
public class Surname {
    private String name;
    private int rank;
    private int count;
    private double proportion;

    /**
     * @author SALAH
     * Constructor
     * @param name the person's name in the list
     * @param rank the rank of the person in the list
     * @param count the number of persons with that name
     * @param proportion
     */
    public Surname(String name, int rank, int count, double proportion) {
        this.name = name;
        this.rank = rank;
        this.count = count;
        this.proportion = proportion;
    }

    /**
     * @author SALAH
     * getters
     */

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getCount() {
        return count;
    }

    public double getProportion() {
        return proportion;
    }

    /**
     * @author SALAH
     * stters
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setProportion(double proportion) {
        this.proportion = proportion;
    }
}