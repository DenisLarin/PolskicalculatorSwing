package ru.larin.main;

import javax.swing.*;

/**
 * Created by mrden on 08.11.2016.
 */
public class MyExeptions extends Exception {
    public void delNull(){
        JOptionPane.showMessageDialog(null,"Division by 0 is not possible");
    }
}
