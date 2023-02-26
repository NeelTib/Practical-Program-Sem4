import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;

public class prac9a extends Frame implements ActionListener {
    Label inputLabel, outputLabel;
    TextField inputField, outputField;
    Button calculateButton;

    public prac9a() {
        inputLabel = new Label("Enter a number:");
        outputLabel = new Label("Factorial:");
        inputField = new TextField(10);
        outputField = new TextField(10);
        outputField.setEditable(false);
        calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);

        setLayout(new FlowLayout());
        add(inputLabel);
        add(inputField);
        add(calculateButton);
        add(outputLabel);
        add(outputField);

        setTitle("Factorial Calculator");
        setSize(300, 150);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                int input = Integer.parseInt(inputField.getText());
                BigInteger factorial = BigInteger.ONE;
                for (int i = 2; i <= input; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                outputField.setText(factorial.toString());
            } catch (NumberFormatException ex) {
                outputField.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        new prac9a();
    }
}
