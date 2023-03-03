// Design an AWT application that contains the interface to add student information and display the same. 
import java.awt.*;
import java.awt.event.*;

public class prac10a extends Frame {
    private Label nameLabel, rollLabel, branchLabel;
    private TextField nameTextField, rollTextField, branchTextField;
    private Button addButton, displayButton;
    private TextArea displayTextArea;
    
    public prac10a() {
        super("Student Information");
        
        nameLabel = new Label("Name:");
        rollLabel = new Label("Roll Number:");
        branchLabel = new Label("Branch:");
        
        nameTextField = new TextField(20);
        rollTextField = new TextField(10);
        branchTextField = new TextField(20);
        
        addButton = new Button("Add");
        displayButton = new Button("Display");
        
        displayTextArea = new TextArea(10, 30);
        displayTextArea.setEditable(false);
        
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
        add(branchLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(branchTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(addButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(displayButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(displayTextArea, gbc);
        
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String roll = rollTextField.getText();
                String branch = branchTextField.getText();
                displayTextArea.append("Name: " + name + "\n");
                displayTextArea.append("Roll Number: " + roll + "\n");
                displayTextArea.append("Branch: " + branch + "\n\n");
                nameTextField.setText("");
                rollTextField.setText("");
                branchTextField.setText("");
            }
        });
        
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // display all students
            }
        });
        
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        new prac10a();
    }
}
