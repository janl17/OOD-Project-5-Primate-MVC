package Monkey;

import java.util.List;
/**

 The IsolationInterface interface represents an isolation where a single monkey can be housed.
 The interface provides methods to check if the isolation is empty, add or remove a monkey,
 get the monkey currently housed in the isolation
 */
public interface IsolationInterface {
    /**
     Returns whether or not the enclosure is currently empty.
     @return true if the enclosure is empty, false otherwise
     */
    boolean isEmpty();
    /**
     Adds a Monkey object to the enclosure if the enclosure is currently empty.
     If not, throws an exception.
     @param monkey the Monkey object to add to the enclosure
     @throws IllegalArgumentException if the enclosure is not empty
     */
    void addMonkey(Monkey monkey) throws IllegalArgumentException;
    /**
     Removes the Monkey object from the enclosure.
     */
    void removeMonkey();
    /**
     Returns the Monkey object currently housed in the enclosure.
     @return the Monkey object, or null if the enclosure is empty
     */
    Monkey getMonkey();
}


