import javax.swing.*;
import java.awt.*;

public class Calculator
{
    public static void main(String[] args)
    {

        JFrame calcFrame = new JFrame("Calculator");
        Model model = new Model();
        Panel Panel = new Panel(model);
        Panel.init();
        calcFrame.setContentPane(Panel);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setPreferredSize(new Dimension(300, 300));
        calcFrame.setLocationRelativeTo(null);
        calcFrame.pack();
        calcFrame.setVisible(true);
    }
}