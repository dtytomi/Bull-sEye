/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.awt.Color;
    import java.awt.Graphics;
    import javax.swing.JPanel;
            
/**
 *
 * @author tomix
 */
public class BullEye extends JPanel {
    
    @Override

    public void paintComponent( Graphics g) {
        super.paintComponent(g);
        
    //  bull's eye
        g.setColor(Color.PINK);
        g.fillOval(10, 10, 240, 240);
        
        g.setColor(Color.red);
        g.fillOval(30, 30, 200, 200);
        
        g.setColor(Color.pink);
        g.fillOval(55, 55, 150, 150);
        
        g.setColor(Color.red);
        g.fillOval(80, 80, 100, 100);
        
        g.setColor(Color.pink);
        g.fillOval(105, 105, 50, 50);
    }
}
