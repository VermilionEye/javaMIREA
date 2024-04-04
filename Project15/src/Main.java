import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    class LabExample extends JFrame {
        JTextField jta1 = new JTextField(10);
        JTextField jta2 = new JTextField(10);
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mult = new JButton("x");
        JButton div = new JButton("/");
        Font fnt = new Font("Times new roman", Font.BOLD, 20);

        LabExample() {
            super("Example");
            setLayout(new FlowLayout());
            setSize(250, 150);
            add(new JLabel("1st Number"));
            add(jta1);
            add(new JLabel("2nd Number"));
            add(jta2);
            add(plus);
            add(minus);
            add(mult);
            add(div);
            plus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        JOptionPane.showMessageDialog(null, "Result =" + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            minus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        JOptionPane.showMessageDialog(null, "Result =" + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            mult.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        JOptionPane.showMessageDialog(null, "Result =" + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            div.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        if (x2 == 0) {
                            JOptionPane.showMessageDialog(null, "Divisor cannot be zero", "alert", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        JOptionPane.showMessageDialog(null, "Result =" + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            setVisible(true);
        }

        public static void main(String[] args) {
            new LabExample();
        }
    }


