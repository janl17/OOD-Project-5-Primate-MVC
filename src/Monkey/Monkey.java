package Monkey;

/**
 * Monkey is an abstract class representing a general type of primate.
 * This class contains basic information that is common to all monkeys,
 * such as name, species, sex, size, weight, age, and favorite food.
 */
public class Monkey {
    private String name;
    private static Species species;
    private int size;
    private Sex sex;
    private double weight;
    private int age;
    private FavoriteFood favoriteFood;
    private boolean healthy;


    /**
     * Constructor for the Monkey class.
     *
     * @param name         the name of the monkey
     * @param species      the species of the monkey
     * @param sex          the sex of the monkey (either 'M' for male or 'F' for female)
     * @param size         the size of the monkey (in inches)
     * @param weight       the weight of the monkey (in pounds)
     * @param age          the age of the monkey (in years)
     * @param favoriteFood the favorite food of the monkey
     */

    public Monkey(String name, Species species, Sex sex, int size, double weight, int age, FavoriteFood favoriteFood, boolean healthy) throws IllegalArgumentException {
        try {
            this.name = name;
            this.species = species;
            this.sex = sex;
            this.size = size;
            this.weight = weight;
            this.age = age;
            this.favoriteFood = favoriteFood;
            this.healthy = false;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("invalid input");
        }
    }

    public String getName() {
        return name;
    }

    public Species getSpecies() {
        return species;
    }

    public Sex getSex() {
        return sex;
    }

    public FavoriteFood getFavoriteFood() {
        return favoriteFood;
    }

    public void labelHealthy() {
        healthy = true;
    }

    public boolean getHealth() {
        return healthy;
    }
}

