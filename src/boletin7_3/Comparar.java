
package boletin7_3;

import javax.swing.JOptionPane;

public class Comparar {
    public int pedirNumero(){
    int num;
    String res = JOptionPane.showInputDialog("teclea numero");
   num = Integer.parseInt(res);
   return num;
    }
public void Comparar(int num1) {
    if(num1> 0)
        JOptionPane.showMessageDialog(null, "+" + num1 );
    else if (num1< 0)
        JOptionPane.showMessageDialog(null, "-" + num1);
   else  
       JOptionPane.showMessageDialog(null, "0");
}
    
    
}
