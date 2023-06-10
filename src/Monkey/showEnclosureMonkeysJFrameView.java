/**

 The showEnclosureMonkeysJFrameView class represents the view for showing monkeys in a specific enclosure.
 It extends the JFrame class and contains a combo box for selecting the species of monkeys and a submit button.
 */

package Monkey;

import javax.swing.*;

import static Monkey.Species.*;


public class showEnclosureMonkeysJFrameView extends JFrame {

    /**
     * The submit button used to trigger the action of showing monkeys in the selected enclosure.
     */
    private JButton submitButton;

    /**
     * The panel that contains the combo box and submit button.
     */
    private JPanel panel;

    /**
     * The combo box used to select the species of monkeys.
     */
    private JComboBox<Species> speciesComboBox;

    /**
     * Constructs a showEnclosureMonkeysJFrameView object with the specified size and location.
     */
    public showEnclosureMonkeysJFrameView() {
        super("Show Enclosure Monkeys");
        setSize(300, 100);
        setLocation(750, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);
        panel.add(new JLabel("Select Enclosure:"));

        speciesComboBox = createSpeciesComboBox();
        panel.add(speciesComboBox);

        this.submitButton = new JButton("Submit");
        this.submitButton.setActionCommand("Submit");
        panel.add(submitButton);

        setVisible(true);
    }

    /**
     * Creates a combo box with the list of available species of monkeys.
     * @return a JComboBox<Species> object with the species options.
     */
    private static JComboBox<Species> createSpeciesComboBox() {
        Species[] speciesOptions = {DRILL, GUEREZA, HOWLER, MANGABEY, SAKI, SPIDER, SQUIRREL, TAMARIN};
        return new JComboBox<>(speciesOptions);
    }

    /**
     * Adds an ActionListener to the submit button that triggers the action of showing monkeys in the selected enclosure.
     * @param controller the controller that handles the interaction between the view and the model.
     */
    public void addFeatures(ControllerInterface controller) {
        this.submitButton.addActionListener(evt -> controller.showEnclosureMonkey((Species) speciesComboBox.getSelectedItem()));
    }
}