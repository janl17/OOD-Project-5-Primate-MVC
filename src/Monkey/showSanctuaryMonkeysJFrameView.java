/**

 A JFrame view for displaying the list of monkeys in the sanctuary.
 */

package Monkey;

import javax.swing.*;

public class showSanctuaryMonkeysJFrameView extends JFrame {
    private JButton submitButton;
    private JPanel panel;
    /**
     * Constructs the JFrame view with a "Show Sanctuary Monkeys" button.
     */
    public showSanctuaryMonkeysJFrameView() {
        super("Show Sanctuary Monkeys");
        setSize(300, 100);
        setLocation(1100, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // set Y_AXIS layout
        add(panel);
        this.submitButton = new JButton("Show Sanctuary Monkeys");
        this.submitButton.setActionCommand("Submit");
        panel.add(submitButton);

        setVisible(true);
    }

    /**
     * Adds a controller to handle the button click event.
     *
     * @param controller the controller to handle the button click event.
     */
    public void addFeatures(ControllerInterface controller) {
        this.submitButton.addActionListener(evt -> controller.showSanctuaryMonkeys());
    }
}





