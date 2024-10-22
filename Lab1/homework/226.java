import javax.swing.JOptionPane;

public class EquationSolve {
    public static void main(String[] args){
        String strVariableNums, strDegree, strNotification = "Result: ";
        strDegree = JOptionPane.showInputDialog(null, "Enter the degree of the equation: ", "Equation Degree", JOptionPane.INFORMATION_MESSAGE);
        strVariableNums = JOptionPane.showInputDialog(null, "Enter the number of variables: ", "Number of variables", JOptionPane.INFORMATION_MESSAGE);
        double variables = Double.parseDouble(strVariableNums);
        double degree = Double.parseDouble(strDegree);
        if (degree == 1 && variables == 1){
            String stra, strb;
            stra = JOptionPane.showInputDialog(null, "Enter a: ", "Enter a", JOptionPane.INFORMATION_MESSAGE);
            strb = JOptionPane.showInputDialog(null, "Enter b: ", "Enter b", JOptionPane.INFORMATION_MESSAGE);
            double a = Double.parseDouble(stra), b = Double.parseDouble(strb);
            if (a==0){
                JOptionPane.showMessageDialog(null, "No solution", "Error!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                double ans = -b/a;
                strNotification += ans;
                JOptionPane.showMessageDialog(null, strNotification, "Results", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            if (degree == 1 && variables == 2){
                String stra11, stra12, stra21, stra22, strb1, strb2; 
                stra11 = JOptionPane.showInputDialog(null, "Enter a11: ", "Enter a11", JOptionPane.INFORMATION_MESSAGE);
                stra12 = JOptionPane.showInputDialog(null, "Enter a12: ", "Enter a12", JOptionPane.INFORMATION_MESSAGE);
                strb1 = JOptionPane.showInputDialog(null, "Enter b1: ", "Enter b1", JOptionPane.INFORMATION_MESSAGE);
                stra21 = JOptionPane.showInputDialog(null, "Enter a21: ", "Enter a21", JOptionPane.INFORMATION_MESSAGE);
                stra22 = JOptionPane.showInputDialog(null, "Enter a22: ", "Enter a22", JOptionPane.INFORMATION_MESSAGE);
                strb2 = JOptionPane.showInputDialog(null, "Enter b2: ", "Enter b2", JOptionPane.INFORMATION_MESSAGE);
                Double a11 = Double.parseDouble(stra11);
                Double b1 = Double.parseDouble(strb1);
                Double a12 = Double.parseDouble(stra12);
                Double a21 = Double.parseDouble(stra21);
                Double a22 = Double.parseDouble(stra22);
                Double b2 = Double.parseDouble(strb2);
                Double d = a11*a22 - a21*a12;
                Double d1 = b1*a22 - b2*a12;
                Double d2 = a11*b2 - a21*b1;
                if (d==0){
                    if (d1==0 && d2==0){
                        JOptionPane.showMessageDialog(null, "Infinite solutions", "Results", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "No solution", "Results", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                    Double x1 = d1/d;
                    Double x2 = d2/d;
                    strNotification += "x1: " + x1 + "\nx2: " +x2;
                    JOptionPane.showMessageDialog(null, strNotification, "Results", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                if (degree == 2 && variables == 1){
                    String stra, strb, strc;
                    stra = JOptionPane.showInputDialog(null, "Enter a: ", "Enter a", JOptionPane.INFORMATION_MESSAGE);
                    strb = JOptionPane.showInputDialog(null, "Enter b: ", "Enter b", JOptionPane.INFORMATION_MESSAGE);
                    strc = JOptionPane.showInputDialog(null, "Enter c: ", "Enter c", JOptionPane.INFORMATION_MESSAGE);
                    Double a = Double.parseDouble(stra);
                    Double b = Double.parseDouble(strb);
                    Double c = Double.parseDouble(strc);
                    Double delta = Math.pow(b, 2) - 4*a*c;
                    if (a==0){
                        if (b==0){
                            JOptionPane.showMessageDialog(null, "No solution", "Results", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            double result = -c/b;
                            strNotification += result;
                            JOptionPane.showMessageDialog(null, strNotification, "Results", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{
                        if (delta < 0){
                            JOptionPane.showMessageDialog(null, "No solution", "Results", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            if (delta ==0){
                                Double result = -b/(2*a);
                                strNotification += result;
                                JOptionPane.showMessageDialog(null, strNotification, "Results", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                Double result1 = (-b+Math.pow(delta, 0.5))/(2*a);
                                Double result2 = (-b+Math.pow(delta, 0.5))/(2*a);
                                strNotification += "x1: " + result1 + "\nx2: " + result2;
                                JOptionPane.showMessageDialog(null, strNotification, "Results", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Please enter between 1 and 2", "Wrong input", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        System.exit(0);
    }    
}
