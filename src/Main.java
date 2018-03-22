import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Calculator");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400,550);
        jframe.setContentPane(new Calculator().getCalc());
        jframe.setVisible(true);
    }
}
