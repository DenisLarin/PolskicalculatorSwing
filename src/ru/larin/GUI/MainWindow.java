package ru.larin.GUI;

import ru.larin.main.Main;
import ru.larin.main.MyExeptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mrden on 02.11.2016.
 */
public class MainWindow extends JFrame {
    private JButton buttonBacspace;
    private JTextField textFieldInput;
    private JTextField textFieldUnswer;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonCE;
    private JButton buttonMult;
    private JButton buttonDel;
    private JButton buttonEnter;
    private String operation = null;
    private byte OpCount = 0;

    public MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(600, 400);
        setResizable(false);
        getContentPane().setLayout(null);

        /*textfield*/
        textFieldInput = new JTextField("0");
        textFieldInput.setBounds(130, 10, 400, 30);
        textFieldInput.setEditable(false);
        textFieldInput.setBackground(Color.white);
        getContentPane().add(textFieldInput);
        textFieldUnswer = new JTextField("Unswer");
        textFieldUnswer.setBounds(130, 50, 400, 30);
        textFieldUnswer.setEditable(false);
        textFieldUnswer.setBackground(Color.white);
        getContentPane().add(textFieldUnswer);
        /*Кнопки*/
        button0 = new JButton("0");
        button0.setBounds(150, 90, 50, 50);
        getContentPane().add(button0);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    return;
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "0");
                }
            }
        });

        button1 = new JButton("1");
        button1.setBounds(210, 90, 50, 50);
        getContentPane().add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("1");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "1");
                }
            }
        });

        button2 = new JButton("2");
        button2.setBounds(270, 90, 50, 50);
        getContentPane().add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("2");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "2");
                }
            }
        });

        button3 = new JButton("3");
        button3.setBounds(330, 90, 50, 50);
        getContentPane().add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("3");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "3");
                }
            }
        });

        button4 = new JButton("4");
        button4.setBounds(390, 90, 50, 50);
        getContentPane().add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("4");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "4");
                }
            }
        });

        button5 = new JButton("5");
        button5.setBounds(450, 90, 50, 50);
        getContentPane().add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("5");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "5");
                }
            }
        });

        button6 = new JButton("6");
        button6.setBounds(150, 150, 50, 50);
        getContentPane().add(button6);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("6");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "6");
                }
            }
        });

        button7 = new JButton("7");
        button7.setBounds(210, 150, 50, 50);
        getContentPane().add(button7);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("7");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "7");
                }
            }
        });

        button8 = new JButton("8");
        button8.setBounds(270, 150, 50, 50);
        getContentPane().add(button8);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("8");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "8");
                }
            }
        });

        button9 = new JButton("9");
        button9.setBounds(330, 150, 50, 50);
        getContentPane().add(button9);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("9");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "9");
                }
            }
        });
        buttonPlus = new JButton("+");
        buttonPlus.setBounds(450, 150, 50, 50);
        getContentPane().add(buttonPlus);
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.steck.size() <= 1)
                    return;
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("+");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "+");
                }
                OpCount++;
            }
        });

        buttonMinus = new JButton("-");
        buttonMinus.setBounds(390, 150, 50, 50);
        getContentPane().add(buttonMinus);
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.steck.size() <= 1)
                    return;
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("-");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "-");
                }
                OpCount++;
            }
        });

        buttonMult = new JButton("*");
        buttonMult.setBounds(150, 210, 50, 50);
        getContentPane().add(buttonMult);
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.steck.size() <= 1)
                    return;
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("*");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "*");
                }
                OpCount++;
            }
        });

        buttonDel = new JButton("/");
        buttonDel.setBounds(210, 210, 50, 50);
        getContentPane().add(buttonDel);
        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (OperationError()) return;
                if (textFieldInput.getText().equals("0")) {
                    textFieldInput.setText("/");
                } else {
                    String temp = textFieldInput.getText();
                    textFieldInput.setText(temp + "/");
                }
                OpCount++;
            }

            private boolean OperationError() {
                if (Main.steck.size() <= 1 || OpCount == 1)
                    return true;
                return false;
            }
        });

        buttonCE = new JButton("CE");
        buttonCE.setBounds(150, 270, 100, 50);
        getContentPane().add(buttonCE);
        buttonCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = JOptionPane.showConfirmDialog(null, "Clean fields?");
                if (i != 0)
                    return;
                else {
                    textFieldInput.setText("0");
                    textFieldUnswer.setText("Unswer");
                    Main.steck.clear();
                }
            }
        });
        buttonBacspace = new JButton("BackSpace");
        buttonBacspace.setBounds(270, 270, 100, 50);
        getContentPane().add(buttonBacspace);
        buttonBacspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = textFieldInput.getText().toString();
                if (temp.length() == 0)
                    return;
                textFieldInput.setText(temp.substring(0, temp.length() - 1));
            }
        });

        buttonEnter = new JButton("►");
        buttonEnter.setBounds(270, 210, 50, 50);
        getContentPane().add(buttonEnter);
        buttonEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldInput.getText().equals("+") || textFieldInput.getText().equals("-") || textFieldInput.getText().equals("*") || textFieldInput.getText().equals("/")) {
                    if (OpCount != 0)
                        OpCount = 0;
                    operation = textFieldInput.getText().toString();
                    textFieldInput.setText("");
                    try {
                        textFieldUnswer.setText(Main.steck.getDown().toString() + operation + Main.steck.back() + " = " + getUnswer());
                    } catch (MyExeptions myExeptions) {
                        myExeptions.delNull();
                    }
                    textFieldInput.setText("0");
                } else {
                    if (Main.steck.size() == 2)
                        return;
                    Main.steck.push(Integer.parseInt(textFieldInput.getText()));
                    textFieldInput.setText("0");
                    if (textFieldUnswer.getText().equals("Unswer") || Main.steck.size() == 1)
                        textFieldUnswer.setText("");
                    if (!(textFieldUnswer.getText().equals(""))) {
                            textFieldUnswer.setText(textFieldUnswer.getText().toString() + " " + Main.steck.back().toString());

                    } else
                        textFieldUnswer.setText(Main.steck.back().toString());
                    /*System.out.println("***");
                    System.out.println("Верх " + Main.steck.back());
                    System.out.println("Низ " + Main.steck.getDown());
                    System.out.println("***");*/
                }
            }

            private String getUnswer() throws MyExeptions {
                String unswer = null;
                int unswerINT;
                switch (operation) {
                    case "+":
                        unswerINT = Main.steck.pop() + Main.steck.pop();
                        clearPush(unswerINT);
                        unswer = "" + unswerINT;
                        break;
                    case "-":
                        unswerINT = Main.steck.getDown() - Main.steck.back();
                        clearPush(unswerINT);
                        unswer = "" + unswerINT;
                        break;
                    case "*":
                        unswerINT = Main.steck.getDown() * Main.steck.back();
                        clearPush(unswerINT);
                        unswer = "" + unswerINT;
                        break;
                    case "/":
                        if (Main.steck.back() == 0) throw new MyExeptions();
                        unswerINT = Main.steck.getDown() / Main.steck.back();
                        clearPush(unswerINT);
                        unswer = "" + unswerINT;
                        break;
                }

                return unswer;
            }

            private void clearPush(int unswerINT) {
                Main.steck.clear();
                //System.out.println("Размер" + Main.steck.size());
                Main.steck.push(unswerINT);
                /*System.out.println("***");
                System.out.println("Верх " + Main.steck.back());
                System.out.println("Низ " + Main.steck.getDown());
                System.out.println("***");*/
            }
        });

        setVisible(true);
    }
}
