package Monkey;

import java.util.List;
/**

 EnclosureInterface represents the interface for a space in the Sanctuary where a single troop of monkeys can be housed.
 Each Enclosure is configured to house a particular species of monkeys.
 The interface defines methods for adding a Monkey to the enclosure, retrieving the list of monkeys in the enclosure,
 moving a monkey from an isolation cage to the enclosure, retrieving information about the monkeys in the enclosure,
 and getting the species of monkey that the enclosure is configured to house.
 */

 public interface EnclosureInterface {
    /**
     * Adds a Monkey object to the enclosure's list of monkeys if it belongs to the species of the enclosure.
     * If not, prints an error message.
     *
     * @param monkey the Monkey object to add to the enclosure
     */
    void addMonkey(Monkey monkey);

    /**
     * Returns the list of Monkey objects currently housed in the enclosure.
     *
     * @return the list of Monkey objects
     */
    List<Monkey> getMonkeys();

    /**
     * Moves a monkey from an isolation cage to this enclosure.
     *
     * @param cage the isolation cage containing the monkey to be moved
     */
    void moveToEnclosure(Isolation cage);

    /**
     * Returns the list of strings representing information about the monkeys currently housed in the enclosure.
     *
     * @return the list of strings
     */
    List<String> getEnclosureMonkeys();

    /**
     * Returns the species of monkey that the enclosure is configured to house.
     *
     * @return the species of monkey
     */
    Species getSpecies();
}



