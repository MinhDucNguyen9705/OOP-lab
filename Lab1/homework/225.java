import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2); 
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        if (num2 == 0){
            JOptionPane.showMessageDialog(null, "Divided by zero", "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            double quotient = num1 / num2;
            strNotification += "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: " + quotient; 
            JOptionPane.showMessageDialog(null, strNotification, "Results", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
