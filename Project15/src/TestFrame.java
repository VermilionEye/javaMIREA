import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class state extends JFrame implements ItemListener {
    static JFrame f;
    static JLabel a, b;
    static JComboBox c;

    public static void main(String[] args)

    {
        f = new JFrame("frame");
        state st = new state();
        f.setLayout(new FlowLayout());
        String str[] = {"RUSSIA", "USSR", "USA", "CHINA", "KOREA"};
        c = new JComboBox(str);
        c.addItemListener(st);
        a = new JLabel("Select a country");
        b = new JLabel("Russia is a greatest country! Za nashih!");
        a.setForeground(Color.red);
        b.setForeground(Color.blue);
        JPanel pa = new JPanel();
        pa.add(a);
        pa.add(c);
        pa.add(b);
        f.add(pa);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c) {
            if (c.getSelectedItem() == "RUSSIA"){
                b.setText ("Russia is a greatest country! Za nashih!");
            }
            else if (c.getSelectedItem() == "USSR"){
                b.setText ("Souyz nerushimiy respublik narodnyh splotila naveki velikaya Rus!!!");
            }
            else if (c.getSelectedItem() == "USA"){
                b.setText ("Pindostan sucks!");
            }
            else if (c.getSelectedItem() == "CHINA"){
                b.setText ("Vostok delo tonkoe, Petruha!");
            }
            else{
                b.setText ("YA KUPIL ZHURNAL KOREA! TAM TOZHE HOROSHO!");
            }
        }
    }
}

