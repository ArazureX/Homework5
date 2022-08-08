package AdHM5;



import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Hm5 extends JFrame {
    public Hm5() throws MalformedURLException {
        super("2");
        setVisible(true);
        setSize(100, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        URL url = getClass().getClassLoader().getResource("Pudge.png");
        JLabel label = new JLabel(new ImageIcon(url));
        JLabel label1 = new JLabel(readTxt("out/production/homework/AdHM5/text/1.txt"));
        JLabel label2 = new JLabel(new ImageIcon("out/production/homework/AdHM5/images/Pudge.png"));
        JLabel label3 = new JLabel((readTxt("out/production/homework/2.txt")));
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(label1);
        panel.add((label2));
        panel.add(label3);
        add(panel);

    }

    public static void main(String[] args) throws MalformedURLException {
        new Hm5();
    }


    private static String readTxt(String filename)  {
        Scanner scanner = null;
        try {
            scanner = new Scanner(Paths.get(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String data = scanner.next();
        scanner.close();
        return data;
    }
}
