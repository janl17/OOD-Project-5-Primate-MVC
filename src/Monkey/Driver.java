package Monkey;


public class Driver {
    public static void main(String[] args) {
        Sanctuary model = new Sanctuary();
        addMonkeyJFrameView addMonkeyView = new addMonkeyJFrameView();
        moveMonkeyToEnclosureJFrameView moveMonkeyToEnclosureView = new moveMonkeyToEnclosureJFrameView();
        showEnclosureMonkeysJFrameView showEnclosureMonkeysView = new showEnclosureMonkeysJFrameView();
        showSanctuaryMonkeysJFrameView showSanctuaryMonkeysView = new showSanctuaryMonkeysJFrameView();
        Controller controller = new Controller(addMonkeyView, moveMonkeyToEnclosureView, showEnclosureMonkeysView, showSanctuaryMonkeysView, model);
    }
}

