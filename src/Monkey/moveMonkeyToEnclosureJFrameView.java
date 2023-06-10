/**

 This class represents the view for moving a monkey from isolation to an enclosure.
 It contains a combo box for selecting the isolation cage number where the monkey is currently located,
 and a submit button for submitting the selected cage number to the controller to initiate the movement process.
 */

package Monkey;

import javax.swing.*;

public class moveMonkeyToEnclosureJFrameView extends JFrame {
    private JPanel panel;
    private JComboBox<String> isolationComboBox;
    private JButton submitButton;

    /**
     * Constructs a new moveMonkeyToEnclosureJFrameView object and sets up its GUI components.
     * The window title, size, and location are set, and a panel with a vertical box layout is added to the frame.
     * A combo box for selecting the isolation cage number is added to the panel, along with a submit button.
     */
    public moveMonkeyToEnclosureJFrameView() {
        super("Label Monkey as Healthy and Move to Enclosure");
        setSize(300, 100);
        setLocation(400, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // set Y_AXIS layout
        add(panel);
        panel.add(new JLabel("Select Cage Number:"));

        isolationComboBox = createIsolationComboBox();
        panel.add(isolationComboBox);

        submitButton = new JButton("Submit");
        panel.add(submitButton);

        setVisible(true);
    }

    /**
     * Creates and returns a combo box with the isolation cage number options.
     *
     * @return the combo box with the isolation cage number options
     */
    private static JComboBox<String> createIsolationComboBox() {
        String[] isolationOptions = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};
        return new JComboBox<>(isolationOptions);
    }

    /**
     * Adds an action listener to the submit button that calls the moveMonkey method in the controller
     * with the selected isolation cage number as its argument.
     *
     * @param controller the controller to be called when the submit button is pressed
     */
    public void addFeatures(ControllerInterface controller) {
        this.submitButton.addActionListener(evt -> controller.moveMonkey((isolationComboBox.getSelectedItem()).toString()));
    }
}