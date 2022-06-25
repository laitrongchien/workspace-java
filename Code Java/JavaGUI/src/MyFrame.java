package src;

import java.awt.LayoutManager;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
    private static final Object pizzaButton = null;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout((LayoutManager) new FlowLayout());

        JRadioButton pizzaButton = new JRadioButton("pizza");
        JRadioButton hamburgerButton  = new JRadioButton("hamburger");
        JRadioButton hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == pizzaButton) {
        System.out.println("You ordered pizza");
       }
    }
}