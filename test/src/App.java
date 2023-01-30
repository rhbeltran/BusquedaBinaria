import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame ("My first ventana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        JButton button = new JButton ("Press");
        JButton button2 = new JButton ("press2");
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2);
        frame.setVisible(true);
    }
}
