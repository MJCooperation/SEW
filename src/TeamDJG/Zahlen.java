package TeamDJG;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * Klasse Zahlen 
 * @author JunJie 
 * @version 4-12-2015
 */
public class Zahlen {
 
 /**
  * Main Methode
  * @param args
  */
   public static void main(String[] args) {
    
      CalculatorFrame frame = new CalculatorFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

/**
 * Klasse CalculaterFrame 
 * @author JunJie
 * @version 4-12-2015
 *
 */
class CalculatorFrame extends JFrame {
 
   public CalculatorFrame() {
    
      setTitle("Calculator");
      CalculatorPanel panel = new CalculatorPanel();
      add(panel);
      pack();
   }
}
 
/**
 * Klasse CalculaterPanel
 * @author JunJie
 * @version 4-12-2015
 *
 */
class CalculatorPanel extends JPanel {
 
 /**
  * Panel f�r den Rechner
  * @since 7-12-2015
  */
 
   public CalculatorPanel() {
    
      setLayout(new BorderLayout());
 
      result = 0;
      lastCommand = "=";
      start = true;
 
      display = new JButton("0");
      display.setEnabled(false);
      add(display, BorderLayout.NORTH);
 
      ActionListener insert = new InsertAction();
      ActionListener command = new CommandAction();
 
      panel = new JPanel();
      panel.setLayout(new GridLayout(4, 4));
 
      addButton("7", insert);
      addButton("8", insert);
      addButton("9", insert);
      addButton("/", command);
 
      addButton("4", insert);
      addButton("5", insert);
      addButton("6", insert);
      addButton("*", command);
 
      addButton("1", insert);
      addButton("2", insert);
      addButton("3", insert);
      addButton("-", command);
 
      addButton("0", insert);
      addButton(".", insert);
      addButton("=", command);
      addButton("+", command);
 
      add(panel, BorderLayout.CENTER);
   }
 
   /**
    * Methode addButton 
    * @param label
    * @param listener
    * @since 7-12-2015
    */
   private void addButton(String label, ActionListener listener) {
    
      JButton button = new JButton(label);
      button.addActionListener(listener);
      panel.add(button);
   }
 
   /**
    * Klasse InsertAction 
    * @author JunJie
    * @version 7-12-2015
    *
    */
   private class InsertAction implements ActionListener {
    
   /**
    * Methode actionPerformed
    * @since 7-12-2015
    */
    
      public void actionPerformed(ActionEvent event) {
       
         String input = event.getActionCommand();
         if (start)
         {
            display.setText("");
            start = false;
         }
         display.setText(display.getText() + input);
      }


   }
 
   /**
    * Diese Aktion f�hrt den mit der Taste verbundenen
    * Befehl aus. 
    */
   private class CommandAction implements ActionListener {
    
    /**
   * Methode actionPerformed
   * @since 7-12-2015
   */
      public void actionPerformed(ActionEvent event) {
       
         String command = event.getActionCommand();
 
         // F�ge "-" an den String an wenn
         // es sich um den ersten Befehl handelt (negative Zahl)
         if (start) {
          
            if (command.equals("-")) {
             
               display.setText(command);
               start = false;
            }
            else {
               lastCommand = command;
            }
         }
         else {
          
            // Berechnung ausf�hren
            calculate(Double.parseDouble(display.getText()));
            lastCommand = command;
            start = true;
         }
      }
   }
 
   /**
    * F�hrt Berechnungen aus
    * @param x der mit dem vorherigen Ergebnis zu berechnende Wert
    */
   public void calculate(double x) {
      if (lastCommand.equals("+")) result += x;
      else if (lastCommand.equals("-")) result -= x;
      else if (lastCommand.equals("*")) result *= x;
      else if (lastCommand.equals("/")) result /= x;
      else if (lastCommand.equals("=")) result = x;
      display.setText("" + result);
   }
 
   private JButton display;
   private JPanel panel;
   private double result;
   private String lastCommand;
   private boolean start;
}