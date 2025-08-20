import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    // Initialize the applet
    public void init() {
        System.out.println("Applet initialized");
    }

    // Start the applet
    public void start() {
        System.out.println("Applet started");
    }

    // Paint the applet's interface
    public void paint(Graphics g) {
        g.drawString("Welcome to Applet Programming!", 50, 50);
    }

    // Stop the applet
    public void stop() {
        System.out.println("Applet stopped");
    }

    // Destroy the applet
    public void destroy() {
        System.out.println("Applet destroyed");
    }
}
