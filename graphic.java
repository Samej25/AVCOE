import javax.swing.*;
import java.awt.*;

 class SimpleGraphics extends JPanel 
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED); 
        g.fillRect(50, 50, 200, 100); 
        g.setColor(Color.BLUE);
        g.fillOval(100, 200, 150, 80);
        g.setColor(Color.GREEN); 
        g.drawLine(50, 350, 300, 350); 
        g.setColor(Color.BLACK); 
        g.drawString("Hello, Graphics!", 120, 450); 
    }

       public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Graphics Example");
        SimpleGraphics panel = new SimpleGraphics();

        frame.setSize(400, 600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); 
        frame.setVisible(true);
    }
}
