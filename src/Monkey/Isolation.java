package Monkey;

import java.util.ArrayList;
import java.util.List;

/**
 * Isolation class represents a small enclosure where a single monkey can be housed.
 * The class holds a Monkey object that is currently housed in the cage.
 */
public class Isolation {
    private Monkey monkey;
    private List<Monkey> monkeys;

    /**
     * Constructor for Isolation class. Initializes an empty cage.
     */
    public Isolation() {
        this.monkey = null;
        this.monkeys = new ArrayList<>();
    }

    /**
     * Returns whether or not the cage is currently empty.
     *
     * @return true if the cage is empty, false otherwise
     */
    public boolean isEmpty() {
        return this.monkey == null;
    }

    /**
     * Adds a Monkey object to the cage if the cage is currently empty.
     * If not, prints an error message.
     *
     * @param monkey the Monkey object to add to the cage
     */
    public void addMonkey(Monkey monkey) {
            this.monkey = monkey;
            this.monkeys.add(monkey);
    }

    /**
     * Removes the Monkey object from the cage.
     */
    public void removeMonkey() {
        this.monkey = null;
    }

    /**
     * Returns the Monkey object currently housed in the cage.
     *
     * @return the Monkey object, or null if the cage is empty
     */
    public Monkey getMonkey() {
        return this.monkey;
    }
}
