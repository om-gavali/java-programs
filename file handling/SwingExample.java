import javax.swing.*;

public class SwingExample 
{
    public static void main(String[] args) 
	{
        JFrame frame = new JFrame("Simple arithmetic operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,550);

        JPanel panel = new JPanel();
        
        JLabel num1Label = new JLabel("Enter first number:");
        panel.add(num1Label);
        
        JTextField num1Field = new JTextField(10);
        panel.add(num1Field);
        
        JLabel num2Label = new JLabel("Enter second number:");
        panel.add(num2Label);
        
        JTextField num2Field = new JTextField(10);
        panel.add(num2Field);
        
        JButton addButton = new JButton("Add");
        panel.add(addButton);
		
		JButton addButton1 = new JButton("sub");
        panel.add(addButton1);
		
		JButton addButton2 = new JButton("mul");
        panel.add(addButton2 );
		
		JButton addButton3 = new JButton("div	");
        panel.add(addButton3);
		
        JLabel resultLabel = new JLabel("Result:");
        panel.add(resultLabel);
       
        addButton.addActionListener(e -> {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 + num2;
                resultLabel.setText("Result: " + result);
        });
		addButton1.addActionListener(e -> {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 - num2;
                resultLabel.setText("Result: " + result);
        });
		addButton2.addActionListener(e -> {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 * num2;
                resultLabel.setText("Result: " + result);
        });
		addButton3.addActionListener(e -> { 
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 / num2;
                resultLabel.setText("Result: " + result);
        });   
        frame.add(panel);
        frame.setVisible(true);
    }
}