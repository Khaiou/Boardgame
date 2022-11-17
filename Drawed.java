import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

// this is probably best as it's own Background class

public class Drawed extends Canvas{
    public static void main(String[] args) {
        JFrame koda = new JFrame("My Cat");
        Canvas wednesday = new Drawed();
        wednesday.setSize(600,400);
        koda.add(wednesday);
        koda.pack();
        koda.setVisible(true);
    }

    public void paint(Graphics g) {
        BufferedImage cat = null;
        try {
            cat = ImageIO.read(new File("catter.jpg"));
            //just replace catter.jpg with the name of the actual board image file
        } catch (IOException e) {
        }
        g.drawImage(cat, 0, 0, null);

    }

}
