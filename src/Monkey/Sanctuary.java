package Monkey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Monkey.Species.*;

/**
 * The Sanctuary class represents a sanctuary for primates.
 */
public class Sanctuary {
    // Isolation and Enclosure objects used to contain monkeys
    Isolation c1 = new Isolation();
    List<Monkey> allMonkeys = new ArrayList<>();
    List<String> allSpecies = new ArrayList<>();
    /**
     * The list of cages in the sanctuary.
     */
    List<Isolation> cages;
    /**
     * The list of enclosures in the sanctuary.
     */
    List<Enclosure> enclosures;
    Isolation cage;

    /**
     * Constructs a new Sanctuary object with 20 empty cages and enclosures for several species of monkeys.
     */
    public Sanctuary() {
        this.cage = new Isolation();
        this.cages = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            this.cages.add(new Isolation());
        }
        this.enclosures = new ArrayList<>();
// List of species of monkeys for which enclosures are created
        List<Species> speciesList = new ArrayList<>();
        speciesList.add(DRILL);
        speciesList.add(GUEREZA);
        speciesList.add(HOWLER);
        speciesList.add(MANGABEY);
        speciesList.add(SAKI);
        speciesList.add(SPIDER);
        speciesList.add(SQUIRREL);
        speciesList.add(TAMARIN);
// Create enclosures for each species of monkey
        for (Species species : speciesList) {
            this.enclosures.add(new Enclosure(species));
        }
    }

    public Isolation getCage(int cageNumber) {
        return this.cages.get(cageNumber);
    }

    /**
     * Adds a monkey to isolation in the sanctuary.
     *
     * @param monkey the monkey to add to isolation
     * @throws IllegalArgumentException if isolation is full
     */
    public void addMonkeyToIsolation(Monkey monkey) throws IllegalArgumentException {
        for (Isolation cage : this.cages) {
            if (cage.isEmpty()) {
                cage.addMonkey(monkey);
                System.out.println(cages.get(0).getMonkey());
                return;
            }
        }
        throw new IllegalArgumentException("Isolation is full.");
    }

    /**
     * Adds a monkey to an enclosure in the sanctuary.
     *
     * @param cage the cage of monkey to add to an enclosure
     * @throws IllegalArgumentException if no enclosure is available
     */
    public void addMonkeyToEnclosure(Isolation cage) throws IllegalArgumentException {
        for (Enclosure enclosure : this.enclosures) {
            if (enclosure.getSpecies().equals(cage.getMonkey().getSpecies())) {
                enclosure.addMonkey(cage.getMonkey());
                cage.removeMonkey();
                return;
            }
        }
        throw new IllegalArgumentException("No enclosure available.");
    }

    public List<String> getEnclosureMonkeys(Species species) {
        List<String> monkeys = new ArrayList<>();
        for (Enclosure enclosure : this.enclosures) {
            if (enclosure.getSpecies() == species) {
                for (Monkey monkey : enclosure.getMonkeys()) {
                    monkeys.add(monkey.getName());
                    monkeys.add(monkey.getSex().toString());
                    monkeys.add(monkey.getFavoriteFood().toString());
                }
            }
        }
        return monkeys;
    }

    /**
     * Returns a list of all monkeys in the sanctuary, including those in isolation and enclosures,
     * sorted by name.
     *
     * @return a list of all monkeys in the sanctuary
     */
    public List<String> getAllMonkeys() {
        List<String> allMonkeyNames = new ArrayList<>();
        for (Isolation cage : this.cages) {
            if (!cage.isEmpty()) {
                allMonkeyNames.add(cage.getMonkey().getName());
            }
        }
        for (Enclosure enclosure : this.enclosures) {
            for (Monkey monkey : enclosure.getMonkeys()) {
                allMonkeyNames.add(monkey.getName());
            }
        }
        Collections.sort(allMonkeyNames);
        return allMonkeyNames;
    }


    /**
     * Returns a list of all species of monkeys present in the sanctuary, including those in isolation and enclosures.
     *
     * @return a list of strings representing the species of monkeys
     */
    public List<String> getAllSpecies() {
        for (Monkey monkey : allMonkeys) {
            allSpecies.add(monkey.getSpecies().toString());
        }
        return allSpecies;
    }
}

