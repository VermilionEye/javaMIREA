import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Panel extends JPanel implements ActionListener, Observer
{
    private Model model;
    private JLabel display = new JLabel("0");
    public Panel(Model model)
    {
        super();
        this.model = model;
        model.addObserver(this);
    }
    protected JButton addButton(String label)
    {
        JButton b = new JButton(label);
        b.addActionListener(this);
        return b;
    }
    protected JPanel createButtonPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 4));
        panel.add(addButton("1"));
        panel.add(addButton("2"));
        panel.add(addButton("3"));
        panel.add(addButton("+"));
        panel.add(addButton("4"));
        panel.add(addButton("5"));
        panel.add(addButton("6"));
        panel.add(addButton("-"));
        panel.add(addButton("7"));
        panel.add(addButton("8"));
        panel.add(addButton("9"));
        panel.add(addButton("*"));
        panel.add(addButton("С"));
        panel.add(addButton("0"));
        panel.add(addButton("="));
        panel.add(addButton("/"));
        return panel;
    }
    public void init()
    {
        this.setLayout(new BorderLayout());
        display.setVerticalTextPosition(JLabel.CENTER);
        display.setHorizontalTextPosition(JLabel.RIGHT);
        display.setVerticalAlignment(JLabel.TOP);
        display.setHorizontalAlignment(JLabel.TRAILING);
        display.setBorder(BorderFactory.createLineBorder(Color.black));
        this.add(display, BorderLayout.NORTH);
        this.add(createButtonPanel(), BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent evt)
    {
        try {
            switch (evt.getActionCommand().charAt(0)) {
                case '+':
                    model.setOperation(Model.plus);
                    break;
                case '-':
                    model.setOperation(Model.minus);
                    break;
                case '*':
                    model.setOperation(Model.multy);
                    break;
                case '/':
                    model.setOperation(Model.divis);
                    break;
                case '=':
                    model.calculate();
                    break;
                case 'C':
                    model.clear();
                    break;
                default:
                    model.addDigit(evt.getActionCommand());
                    break;
            }
        } catch (NumberFormatException ex) {}
    }
    public void update(Observable o, Object arg)
    {
        display.setText(model.getValue());
    }
}