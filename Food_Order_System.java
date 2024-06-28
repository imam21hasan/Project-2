package Swing_Project;

import javax.swing.*;
import java.awt.event.*;

public class Food_Order_System extends JFrame implements ActionListener {

    JLabel l, m;
    JCheckBox m1, m2, m3;
    JButton b;

    Food_Order_System() {

        l = new JLabel("Food Ordering System");
        l.setBounds(120, 37, 300, 20);

        m = new JLabel("Choice your Menu");
        m.setBounds(130, 55, 400, 40);

        m1 = new JCheckBox("Chicken Roll: 120 Tk");
        m1.setBounds(130, 100, 150, 20);

        m2 = new JCheckBox("Burger : 150 Tk");
        m2.setBounds(130, 150, 150, 20);

        m3 = new JCheckBox("Tea : 10 Tk");
        m3.setBounds(130, 200, 150, 20);

        b = new JButton("Order");
        b.setBounds(150, 250, 80, 30);
        b.addActionListener(this);

        add(l);
        add(m);
        add(m1);
        add(m2);
        add(m3);
        add(b);

        setBounds(600, 250, 400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (m1.isSelected()) {
            amount += 120;
            msg = "Chicken Roll: 120 Tk\n";
        }
        if (m2.isSelected()) {
            amount += 150;
            msg += "Burger: 150 Tk\n";
        }
        if (m3.isSelected()) {
            amount += 10;
            msg += "Tea: 10 Tk\n";
        }
        msg += "--------------------\n";
        JOptionPane.showMessageDialog(null, msg + "Total Price : " + amount + " tk", "CSTU Food Corner", -1);

        JOptionPane.showMessageDialog(null, "Thank you for your order.", "CSTU Food Corner", -1);
        System.exit(0);
    }

    public static void main(String[] args) {
        Food_Order_System frame = new Food_Order_System();
        frame.setTitle("CSTU Food Corner");
    }
}
