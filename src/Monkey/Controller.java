
/**

 The Controller class acts as a mediator between the GUI views and the underlying Sanctuary model.
 It implements the ControllerInterface interface and provides methods to add a monkey to the isolation area,
 move a monkey to an enclosure, show the monkeys in a specified enclosure, and show all monkeys in the sanctuary.
 It also has references to the different GUI views and the Sanctuary model.
 */
package Monkey;

import javax.swing.*;

public class Controller implements ControllerInterface {
    addMonkeyJFrameView addMonkeyView;
    moveMonkeyToEnclosureJFrameView moveMonkeyToEnclosureView;
    showEnclosureMonkeysJFrameView showEnclosureMonkeysView;
    showSanctuaryMonkeysJFrameView showSanctuaryMonkeysView;
    Sanctuary model;

    /**
     Constructor for the Controller class that initializes the different views and the model.
     It also adds the controller as a listener to the views.
     @param addMonkeyView The view for adding a monkey to the isolation area.
     @param moveMonkeyToEnclosureView The view for moving a monkey to an enclosure.
     @param showEnclosureMonkeysView The view for showing the monkeys in a specified enclosure.
     @param showSanctuaryMonkeysView The view for showing all monkeys in the sanctuary.
     @param model The underlying model containing the data for the sanctuary.
     */
    public Controller(addMonkeyJFrameView addMonkeyView, moveMonkeyToEnclosureJFrameView moveMonkeyToEnclosureView,
                      showEnclosureMonkeysJFrameView showEnclosureMonkeysView, showSanctuaryMonkeysJFrameView showSanctuaryMonkeysView,
                      Sanctuary model) {
        this.model = model;
        this.addMonkeyView = addMonkeyView;
        addMonkeyView.addFeatures(this);
        this.moveMonkeyToEnclosureView = moveMonkeyToEnclosureView;
        this.moveMonkeyToEnclosureView.addFeatures(this);
        this.showEnclosureMonkeysView = showEnclosureMonkeysView;
        this.showEnclosureMonkeysView.addFeatures(this);
        this.showSanctuaryMonkeysView = showSanctuaryMonkeysView;
        showSanctuaryMonkeysView.addFeatures(this);
    }

    /**
     Adds a monkey to the isolation area in the model.
     Displays an error message if there is an exception.
     @param monkey The monkey to be added to the isolation area.
     */
    public void addMonkey(Monkey monkey) {
        try {
            this.model.addMonkeyToIsolation(monkey);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(moveMonkeyToEnclosureView, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     Moves a monkey to the specified enclosure in the model.
     Displays an error message if there is an exception.
     @param cageNumber The number of the enclosure to move the monkey to.
     */
    public void moveMonkey(String cageNumber) {
        try {
            this.model.addMonkeyToEnclosure(model.getCage(Integer.parseInt(cageNumber)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(moveMonkeyToEnclosureView, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     Shows the monkeys of the specified species in the enclosure.
     Displays the monkey names in a message dialog box.
     @param species The species of the monkeys to display.
     */
    public void showEnclosureMonkey(Species species) {
        StringBuilder messageBuilder = new StringBuilder();
        for (String monkey : this.model.getEnclosureMonkeys(species)) {
            messageBuilder.append(monkey).append("\n");
        }
        JOptionPane.showMessageDialog(showEnclosureMonkeysView, messageBuilder.toString(), "Monkeys in Enclosure", JOptionPane.PLAIN_MESSAGE);
    }

    /**

     Displays a dialog box containing a list of all the monkeys in the sanctuary.
     @return void
     */
    public void showSanctuaryMonkeys() {
        StringBuilder messageBuilder = new StringBuilder();
        for (String monkey : this.model.getAllMonkeys()) {
            messageBuilder.append(monkey).append("\n");
        }
        JOptionPane.showMessageDialog(showEnclosureMonkeysView, messageBuilder.toString(), "Monkeys in Sanctuary", JOptionPane.PLAIN_MESSAGE);
    }
}


