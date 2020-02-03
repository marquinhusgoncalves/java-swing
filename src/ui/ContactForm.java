package ui;

import javax.swing.*;

public class ContactForm extends JFrame {
    private JPanel rootPanel;
    private JTextField textField1;
    private JTextField textPhone;
    private JButton buttonSave;
    private JButton buttonCancel;

    public ContactForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);
    }
}
