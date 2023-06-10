package Monkey;

import java.util.ArrayList;
import java.util.List;

/**
 * Enclosure class represents a space in the Sanctuary where a single troop of monkeys can be housed.
 * Each Enclosure is configured to house a particular species of monkeys.
 * The class holds a list of Monkey objects that are currently housed in the enclosure.
 */
public class Enclosure {
    private Species species;
    private List<Monkey> monkeys;

    /**
     * Constructor for Enclosure class.
     * Initializes an empty list of monkeys for the enclosure.
     *
     * @param species the species of monkey that the enclosure is configured to house
     */
    public Enclosure(Species species) {
        this.species = species;
        this.monkeys = new ArrayList<>();
    }

    /**
     * Adds a Monkey object to the enclosure's list of monkeys if it belongs to the species of the enclosure.
     * If not, prints an error message.
     *
     * @param monkey the Monkey object to add to the enclosure
     */
    public void addMonkey(Monkey monkey) {
        if (monkey.getSpecies() == this.species) {
            this.monkeys.add(monkey);
        } else {
            System.out.println("Error: cannot add monkey of species " + monkey.getSpecies() + " to enclosure for species " + this.species);
        }
    }

    /**
     * Returns the list of Monkey objects currently housed in the enclosure.
     *
     * @return the list of Monkey objects
     */
    public List<Monkey> getMonkeys() {
        return this.monkeys;
    }

    public List<String> getEnclosureMonkeys() {
        List<String> monkeys = new ArrayList<>();
        for (Monkey monkey : this.monkeys) {
            monkeys.add(monkey.getName());
            monkeys.add(monkey.getSex().toString());
            monkeys.add(monkey.getFavoriteFood().toString());
        }
        return monkeys;
    }

    /**
     * Returns the species of monkey that the enclosure is configured to house.
     *
     * @return the species of monkey
     */
    public Species getSpecies() {
        return this.species;
    }
}
