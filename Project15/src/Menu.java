import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TestFrame extends JFrame {
    public static void Create() {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu FileMenu = new JMenu("Файл");
        JMenu EditMenu = new JMenu("Правка");
        JMenu HelpMenu = new JMenu("Помощь");

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        JTextField jta1 = new JTextField(10);

        JMenu newMenu = new JMenu("Создать");
        FileMenu.add(newMenu);

        JMenuItem TextFile = new JMenuItem("Текстовый документ");
        newMenu.add(TextFile);
        JMenuItem Folder = new JMenuItem("Папку");
        newMenu.add(Folder);
        JMenuItem Close = new JMenuItem("Закрыть");
        FileMenu.add(Close);

        FileMenu.addSeparator();

        JMenuItem Exit = new JMenuItem("Выйти");
        FileMenu.add(Exit);

        JMenuItem Copy = new JMenuItem("Копировать");
        EditMenu.add(Copy);
        JMenuItem Cut = new JMenuItem("Вырезать");
        EditMenu.add(Cut);
        JMenuItem Paste = new JMenuItem("Вставить");
        EditMenu.add(Paste);

        JMenuItem HelpMe = new JMenuItem("Помогите!!!");
        HelpMenu.add(HelpMe);

        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        HelpMe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Серьезно, блин?!", "Справка", JOptionPane.INFORMATION_MESSAGE);
            }
        });



        menuBar.add(FileMenu);
        menuBar.add(EditMenu);
        menuBar.add(HelpMenu);

        frame.setJMenuBar(menuBar);
        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);
        frame.add(jta1);

        frame.setPreferredSize(new Dimension(270, 225));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Create();
            }
        });
    }
}