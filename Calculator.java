import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
  private JPanel panel;
  
  private JTextField textDisplay;
  
  private JButton btnOne;
  
  private JButton btnTwo;
  
  private JButton btnFour;
  
  private JButton btnFive;
  
  private JButton btnSeven;
  
  private JButton btnEight;
  
  private JButton btnZero;
  
  private JButton btnPoint;
  
  private JButton btnThree;
  
  private JButton btnSix;
  
  private JButton btnNine;
  
  private JButton btnNegative;
  
  private JButton btnPlus;
  
  private JButton btnMinus;
  
  private JButton btnMultiply;
  
  private JButton btnDivide;
  
  private JButton btnDel;
  
  private JButton btnClear;
  
  private JButton btnExponent;
  
  private JButton btnEqual;
  
  private double total1 = 0.0D;
  
  private double total2 = 0.0D;
  
  private int operation = 0;
  
  private double answer = 0.0D;
  
  private final int plus = 1;
  
  private final int minus = 2;
  
  private final int multiply = 3;
  
  private final int divide = 4;
  
  private final int exponent = 5;
  
  public Calculator() {
    $$$setupUI$$$();
    this.textDisplay.setBorder(null);
    this.btnOne.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnOne.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnTwo.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnTwo.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnThree.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnThree.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnFour.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnFour.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnFive.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnFive.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnSix.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnSix.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnSeven.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnSeven.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnEight.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnEight.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnNine.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnNine.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnZero.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals("0"))
              return; 
            String text = Calculator.this.textDisplay.getText() + Calculator.this.btnZero.getText();
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnDel.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals(""))
              return; 
            String text = Calculator.this.textDisplay.getText().substring(0, Calculator.this.textDisplay.getText().length() - 1);
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnClear.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text = "";
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnPoint.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals("")) {
              Calculator.this.textDisplay.setText("0.");
            } else if (Calculator.this.textDisplay.getText().contains(".")) {
              Calculator.this.btnPoint.setEnabled(false);
            } else {
              String text = Calculator.this.textDisplay.getText() + Calculator.this.btnPoint.getText();
              Calculator.this.textDisplay.setText(text);
            } 
            Calculator.this.btnPoint.setEnabled(true);
          }
        });
    this.btnEqual.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals(""))
              return; 
            Calculator.this.total2 = Double.parseDouble(Calculator.this.textDisplay.getText());
            if (Calculator.this.operation == 1) {
              Calculator.this.answer = Calculator.this.total1 + Calculator.this.total2;
            } else if (Calculator.this.operation == 2) {
              Calculator.this.answer = Calculator.this.total1 - Calculator.this.total2;
            } else if (Calculator.this.operation == 3) {
              Calculator.this.answer = Calculator.this.total1 * Calculator.this.total2;
            } else if (Calculator.this.operation == 4) {
              Calculator.this.answer = Calculator.this.total1 / Calculator.this.total2;
            } else if (Calculator.this.operation == 5) {
              Calculator.this.answer = Math.pow(Calculator.this.total1, Calculator.this.total2);
            } else {
              return;
            } 
            if (Calculator.this.answer - (int)Calculator.this.answer == 0.0D) {
              Calculator.this.textDisplay.setText(Double.toString(Calculator.this.answer).substring(0, Double.toString(Calculator.this.answer).length() - 2));
            } else {
              Calculator.this.textDisplay.setText(Double.toString(Calculator.this.answer));
            } 
            Calculator.this.operation = 0;
          }
        });
    this.btnPlus.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals(""))
              return; 
            Calculator.this.total1 = Double.parseDouble(Calculator.this.textDisplay.getText());
            Calculator.this.operation = 1;
            String text = "";
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnMinus.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals(""))
              return; 
            Calculator.this.total1 = Double.parseDouble(Calculator.this.textDisplay.getText());
            Calculator.this.operation = 2;
            String text = "";
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnMultiply.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals(""))
              return; 
            Calculator.this.total1 = Double.parseDouble(Calculator.this.textDisplay.getText());
            Calculator.this.operation = 3;
            String text = "";
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnDivide.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals(""))
              return; 
            Calculator.this.total1 = Double.parseDouble(Calculator.this.textDisplay.getText());
            Calculator.this.operation = 4;
            String text = "";
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnExponent.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals(""))
              return; 
            Calculator.this.total1 = Double.parseDouble(Calculator.this.textDisplay.getText());
            Calculator.this.operation = 5;
            String text = "";
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.btnNegative.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String text;
            if (Calculator.this.textDisplay.getText().equals("") || Calculator.this.textDisplay.getText().equals("0"))
              return; 
            if (Calculator.this.textDisplay.getText().contains("-")) {
              text = Calculator.this.textDisplay.getText().replace("-", "");
            } else {
              text = "-" + Calculator.this.textDisplay.getText();
            } 
            Calculator.this.textDisplay.setText(text);
          }
        });
    this.textDisplay.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Calculator.this.textDisplay.getText().equals(""))
              return; 
            Calculator.this.total2 = Double.parseDouble(Calculator.this.textDisplay.getText());
            if (Calculator.this.operation == 1) {
              Calculator.this.answer = Calculator.this.total1 + Calculator.this.total2;
            } else if (Calculator.this.operation == 2) {
              Calculator.this.answer = Calculator.this.total1 - Calculator.this.total2;
            } else if (Calculator.this.operation == 3) {
              Calculator.this.answer = Calculator.this.total1 * Calculator.this.total2;
            } else if (Calculator.this.operation == 4) {
              Calculator.this.answer = Calculator.this.total1 / Calculator.this.total2;
            } else if (Calculator.this.operation == 5) {
              Calculator.this.answer = Math.pow(Calculator.this.total1, Calculator.this.total2);
            } else {
              return;
            } 
            if (Calculator.this.answer - (int)Calculator.this.answer == 0.0D) {
              Calculator.this.textDisplay.setText(Double.toString(Calculator.this.answer).substring(0, Double.toString(Calculator.this.answer).length() - 2));
            } else {
              Calculator.this.textDisplay.setText(Double.toString(Calculator.this.answer));
            } 
            Calculator.this.operation = 0;
          }
        });
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Calculator");
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setContentPane((new Calculator()).panel);
    frame.setDefaultCloseOperation(3);
    frame.pack();
    frame.setVisible(true);
  }
}
