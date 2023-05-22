import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Repetition extends JPanel {
    BufferedImage image;
    public Repetition () throws IOException {
        File file = new File("src/grass.jpg");
         image = ImageIO.read(file);}
        protected void paintComponent (Graphics g){
        super.paintComponent(g);
            if (image!= null) {
                for (int x = 0; x < 800; x += 50) {
                    for (int y = 0; y < 600; y += 50) {
                        g.drawImage(image, x, y, 50, 50, null);
                    }
                }
            }
        }
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Grass Texture");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Repetition());
        frame.setVisible(true);
    }
}