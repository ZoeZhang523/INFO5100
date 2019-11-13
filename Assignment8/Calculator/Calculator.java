package Calculator;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Operator {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}

public class Calculator extends JFrame {
    private JButton nums[];
    private JButton add, subtract, multiply, divide, calculate, clear;
    private JTextField resultTextField;
    private Operator o;
    private int fir;
    private int sec;
    private String stringNum1 = "";
    private String stringNum2 = "";
    private boolean isSec = false;

    public Calculator() {
        createComponents();
        setLayout();
        addComponent();
        addBehaviorToComponent();
        display();
    }

    private void createComponents() {

        nums = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            nums[i] = new JButton(String.valueOf(i));
        }

        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("×");
        divide = new JButton("÷");
        calculate = new JButton("=");

        resultTextField = new JTextField(10);
        resultTextField.setSize(500,30);

        clear = new JButton("AC");
    }

    private void setLayout() {
        GridLayout gl = new GridLayout(5, 1);
        Container c = this.getContentPane();
        c.setLayout(gl);
    }

    private void addComponent() {
        Container c = getContentPane();

        JPanel p = new JPanel();
        p.add(resultTextField);
        c.add(p);

        p = new JPanel();
        p.add(divide);
        p.add(nums[7]);
        p.add(nums[8]);
        p.add(nums[9]);
        c.add(p);

        p = new JPanel();
        p.add(multiply);
        p.add(nums[4]);
        p.add(nums[5]);
        p.add(nums[6]);
        c.add(p);

        p = new JPanel();
        p.add(subtract);
        p.add(nums[1]);
        p.add(nums[2]);
        p.add(nums[3]);
        c.add(p);

        p = new JPanel();
        p.add(add);
        p.add(clear);
        p.add(nums[0]);
        p.add(calculate);
        c.add(p);
    }

    class NumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!isSec) {
                stringNum1 += ((JButton) e.getSource()).getText();
                fir = Integer.parseInt(stringNum1);
            } else {
                stringNum2 += ((JButton) e.getSource()).getText();
                sec = Integer.parseInt(stringNum2);
            }
        }
    }

    class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            isSec = true;
            if (e.getSource() == add) {
                o = Operator.ADD;
            }
            if (e.getSource() == subtract) {
                o = Operator.SUBTRACT;
            }
            if (e.getSource() == multiply) {
                o = Operator.MULTIPLY;
            }
            if (e.getSource() == divide) {
                o = Operator.DIVIDE;
            }
            if (e.getSource() == clear) {
                resultTextField.setText("");
                isSec = false;
                stringNum1="";
                stringNum2="";
            }
        }
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int res;
            if (o == Operator.ADD) {
                res = fir + sec;
                resultTextField.setText(fir + " + " + sec + " = " + res);
            }
            if (o == Operator.SUBTRACT) {
                res = fir - sec;
                resultTextField.setText(fir + " - " + sec + " = " + res);
            }
            if (o == Operator.MULTIPLY) {
                res = fir * sec;
                resultTextField.setText(fir + " × " + sec + " = " + res);
            }
            if (o == Operator.DIVIDE) {
                res = fir / sec;
                resultTextField.setText(fir + " ÷ " + sec + " = " + res);
            }
        }
    }


    private void addBehaviorToComponent() {
        NumberListener nl = new NumberListener();
        for (int i = 0; i < 10; i++) {
            nums[i].addActionListener(nl);
        }

        OperatorListener ol = new OperatorListener();
        add.addActionListener(ol);
        subtract.addActionListener(ol);
        multiply.addActionListener(ol);
        divide.addActionListener(ol);
        clear.addActionListener(ol);

        CalculateListener cl = new CalculateListener();
        calculate.addActionListener(cl);

    }

    private void display() {
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}