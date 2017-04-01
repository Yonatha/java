package sparta;

import sparta.janelas.Login;
import sparta.exceptions.NonexistentEntityException;
import javax.swing.JFrame;

/**
 *
 * @author yonatha
 */
public class Sparta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NonexistentEntityException {
        Login frame = new Login();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("Login");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLocationByPlatform(false);
        frame.setResizable(false);
    }
}
