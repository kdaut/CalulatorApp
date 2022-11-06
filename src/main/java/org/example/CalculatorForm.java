package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorForm {
    private JPanel panelCalculator;
    private JTextField txtView;
    private JButton btnDiv;
    private JButton btnMulti;
    private JButton btnMinus;
    private JButton btnDel;
    private JButton btnAc;
    private JButton btn7;
    private JButton btn4;
    private JButton btn1;
    private JButton btnEquals;
    private JButton btnPlus;
    private JButton btn8;
    private JButton btn5;
    private JButton btn2;
    private JButton btn0;
    private JButton btnSquare;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btnDot;

    double a,b,result;
    String op;

    public CalculatorForm() {
        btnAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText("");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn7.getText());
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn8.getText());
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn9.getText());
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn4.getText());
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn5.getText());
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn6.getText());
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn1.getText());
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn2.getText());
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn3.getText());
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btn0.getText());
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtView.setText(txtView.getText() + btnDot.getText());
            }
        });


        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtView.getText().contains(".")){
                    txtView.setText(txtView.getText() + btnDot.getText());
                }
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtView.getText());
                op = "+";
                txtView.setText("");
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtView.getText());
                op = "-";
                txtView.setText("");
            }
        });
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtView.getText());
                op = "*";
                txtView.setText("");
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtView.getText());
                op = "/";
                txtView.setText("");
            }
        });
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String deleteChar = null;
                if (txtView.getText().length() >0){
                    StringBuilder stringBuilder = new StringBuilder(txtView.getText());
                    stringBuilder.deleteCharAt(txtView.getText().length()-1);
                    deleteChar = String.valueOf(stringBuilder);
                    txtView.setText(deleteChar);
                }
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtView.getText());
                if(op=="+"){
                    result = a+b;
                    txtView.setText(String.valueOf(result));
                } if(op=="-"){
                    result= a-b;
                    txtView.setText(String.valueOf(result));
                } if (op=="*"){
                    result = a*b;
                    txtView.setText(String.valueOf(result));
                } if(op=="/"){
                    result = a/b;
                    txtView.setText(String.valueOf(result));
                }
            }
        });
        btnSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtView.getText());
                result = a*a;
                txtView.setText(String.valueOf(result));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorForm");
        frame.setContentPane(new CalculatorForm().panelCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(600,100);
        frame.pack();
        frame.setVisible(true);
    }

}

