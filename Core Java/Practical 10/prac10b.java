import java.awt.*;
import java.awt.event.*;

public class prac10b extends Frame {
    private Label nameLabel, rollLabel, physicsLabel, chemistryLabel, mathsLabel;
    private TextField nameTextField, rollTextField, physicsTextField, chemistryTextField, mathsTextField;
    private Button generateButton;
    private TextArea resultTextArea;

    public prac10b() {
        super("Mark Sheet Generator");

        nameLabel = new Label("Name:");
        rollLabel = new Label("Roll Number:");
        physicsLabel = new Label("Physics:");
        chemistryLabel = new Label("Chemistry:");
        mathsLabel = new Label("Maths:");

        nameTextField = new TextField(20);
        rollTextField = new TextField(10);
        physicsTextField = new TextField(10);
        chemistryTextField = new TextField(10);
        mathsTextField = new TextField(10);

        generateButton = new Button("Generate");

        resultTextArea = new TextArea(10, 30);
        resultTextArea.setEditable(false);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(rollLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(rollTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(physicsLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(physicsTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(chemistryLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(chemistryTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(mathsLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(mathsTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(generateButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        add(resultTextArea, gbc);

        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String roll = rollTextField.getText();
                String physics = physicsTextField.getText();
                String chemistry = chemistryTextField.getText();
                String maths = mathsTextField.getText();

                double totalMarks = Double.parseDouble(physics) + Double.parseDouble(chemistry)
                        + Double.parseDouble(maths);
                double percentage = (totalMarks / 300) * 100;

                resultTextArea.setText("Name: " + name + "\n");
                resultTextArea.append("Roll Number: " + roll + "\n");
                resultTextArea.append("Physics: " + physics + "\n");
                resultTextArea.append("Chemistry: " + chemistry + "\n");
                resultTextArea.append("Maths: " + maths + "\n");
                resultTextArea.append("Total Marks: " + totalMarks + "\n");
                resultTextArea.append("Percentage: " + percentage + "%\n");
            }
        });

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac10b();
    }
}