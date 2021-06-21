/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Farhan ashari
 */
public class Backgroundpanel extends JPanel{
    
    private Image image; 
    
    public Backgroundpanel() throws IOException {
        BufferedImage img = ImageIO.read(new File ("/Users/Farhan ashari/Documents/foto/jet.jpg"));
        
        image = img; 
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        gd.dispose(); 
        
        
                
    }
            
}
