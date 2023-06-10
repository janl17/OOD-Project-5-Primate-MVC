/**

 A class that represents the view for adding a monkey to the isolation area of the sanctuary.
 */

package Monkey;

import javax.swing.*;

import static Monkey.FavoriteFood.*;
import static Monkey.Sex.F;
import static Monkey.Sex.M;
import static Monkey.Species.*;


public class addMonkeyJFrameView extends JFrame {
    private JPanel panel;
    private JTextField nameField;
    private JComboBox<Species> speciesComboBox;
    private JComboBox<Sex> sexComboBox;
    private JTextField sizeField;
    private JTextField weightField;
    private JTextField ageField;
    private JComboBox<FavoriteFood> favoriteFoodComboBox;
    private JButton submitButton;

    /**
     * Constructs a new instance of the addMonkeyJFrameView class.
     */
    public addMonkeyJFrameView() {
        super("Add Monkey to Isolation");
        setSize(300, 400);
        setLocation(50, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);

        nameField = new JTextField(10);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);

        speciesComboBox = createSpeciesComboBox();
        panel.add(new JLabel("Species:"));
        panel.add(speciesComboBox);

        sexComboBox = createSexComboBox();
        panel.add(new JLabel("Sex:"));
        panel.add(sexComboBox);

        sizeField = new JTextField(10);
        panel.add(new JLabel("Size:"));
        panel.add(sizeField);

        weightField = new JTextField(10);
        panel.add(new JLabel("Weight:"));
        panel.add(weightField);

        ageField = new JTextField(10);
        panel.add(new JLabel("Age:"));
        panel.add(ageField);

        favoriteFoodComboBox = createFavoriteFoodComboBox();
        panel.add(new JLabel("Favorite Food:"));
        panel.add(favoriteFoodComboBox);

        submitButton = new JButton("Submit");
        panel.add(submitButton);

        setVisible(true);
    }

    /**
     * Returns a JComboBox that contains all available species options for the speciesComboBox field.
     *
     * @return a JComboBox containing all available species options.
     */
    private static JComboBox<Species> createSpeciesComboBox() {
        Species[] speciesOptions = {DRILL, GUEREZA, HOWLER, MANGABEY, SAKI, SPIDER, SQUIRREL, TAMARIN};
        return new JComboBox<>(speciesOptions);
    }

    /**
     * Returns a JComboBox that contains all available sex options for the sexComboBox field.
     *
     * @return a JComboBox containing all available sex options.
     */
    private static JComboBox<Sex> createSexComboBox() {
        Sex[] sexOptions = {M, F};
        return new JComboBox<>(sexOptions);
    }

    /**
     * Returns a JComboBox that contains all available favorite food options for the favoriteFoodComboBox field.
     *
     * @return a JComboBox containing all available favorite food options.
     */
    private static JComboBox<FavoriteFood> createFavoriteFoodComboBox() {
        FavoriteFood[] foodOptions = {EGGS, FRUITS, INSECTS, LEAVES, NUTS, SEEDS, TREESAP};
        return new JComboBox<>(foodOptions);
    }

    /**
     * Adds a listener to the submitButton field that will add a new Monkey to the isolation area with the
     * given parameters when the button is clicked.
     *
     * @param controller a ControllerInterface object used to add a new Monkey to the isolation area.
     */
    public void addFeatures(ControllerInterface controller) {
        this.submitButton.addActionListener(evt -> controller.addMonkey(new Monkey(nameField.getText(), (Species) speciesComboBox.getSelectedItem(), (Sex) sexComboBox.getSelectedItem(), Integer.parseInt(sizeField.getText()), Double.parseDouble(weightField.getText()), Integer.parseInt(ageField.getText()), (FavoriteFood) favoriteFoodComboBox.getSelectedItem(), false)));
    }
}


