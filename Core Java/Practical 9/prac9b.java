// Design an AWT program to perform various string operations like reverse string, string concatenation etc.
import java.awt.*;
import java.awt.event.*;

public class prac9b extends Frame implements ActionListener {
    Label input1Label, input2Label, outputLabel;
    TextField input1Field, input2Field, outputField;
    Button reverseButton, concatButton, addButton;

    public prac9b() {
        input1Label = new Label("Input 1:");
        input2Label = new Label("Input 2:");
        outputLabel = new Label("Output:");
        input1Field = new TextField(20);
        input2Field = new TextField(20);
        outputField = new TextField(20);
        outputField.setEditable(false);
        reverseButton = new Button("Reverse String 1");
        concatButton = new Button("Concatenate Strings");
        addButton = new Button("Add Integers");
        reverseButton.addActionListener(this);
        concatButton.addActionListener(this);
        addButton.addActionListener(this);

        setLayout(new FlowLayout());
        add(input1Label);
        add(input1Field);
        add(reverseButton);
        add(input2Label);
        add(input2Field);
        add(concatButton);
        add(addButton);
        add(outputLabel);
        add(outputField);

        setTitle("String Operations");
        setSize(300, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reverseButton) {
            String input1 = input1Field.getText();
            String reversed = new StringBuilder(input1).reverse().toString();
            outputField.setText(reversed);
        } else if (e.getSource() == concatButton) {
            String input1 = input1Field.getText();
            String input2 = input2Field.getText();
            String concatenated = input1 + input2;
            outputField.setText(concatenated);
        } else if (e.getSource() == addButton) {
            try {
                int input1 = Integer.parseInt(input1Field.getText());
                int input2 = Integer.parseInt(input2Field.getText());
                int sum = input1 + input2;
                outputField.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                outputField.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        new prac9b();
    }
}