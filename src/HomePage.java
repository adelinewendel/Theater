import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class HomePage {

    JLabel picLabel, title, title1, userName, password, buyTicket;
    JTextField name;
    JPasswordField pass;
    JButton login;
    static JFrame frame;

    public JPanel createContentPane() throws IOException {
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        totalGUI.setBackground(Color.WHITE);

        Image myPicture = ImageIO.read(this.getClass().getResource("/movieLogo.jpg"));
        Image scaled = myPicture.getScaledInstance(100, 95, Image.SCALE_SMOOTH);
        picLabel = new JLabel(new ImageIcon(scaled));
        title = new JLabel("Hai la ");
        title.setLocation(70, 10);
        title.setSize(120, 40);
        title.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 25));
        title.setForeground(Color.BLUE);

        picLabel.setLocation(145, 0);
        picLabel.setSize(100, 100);

        title1 = new JLabel("Teatru !");
        title1.setLocation(250, 60);
        title1.setSize(120, 40);
        title1.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 25));
        title1.setForeground(Color.BLUE);

        userName = new JLabel("Admin  : ");
        userName.setLocation(80, 120);
        userName.setSize(120, 30);

        name = new JTextField();
        name.setLocation(165, 125);
        name.setSize(120, 20);

        password = new JLabel("Parola       : ");
        password.setLocation(80, 160);
        password.setSize(120, 30);

        pass = new JPasswordField(30);
        pass.setLocation(165, 165);
        pass.setSize(120, 20);

        login = new JButton("Login");
        login.setLocation(210, 200);
        login.setSize(80, 20);
        login.setForeground(Color.BLACK);

        buyTicket = new JLabel("Cumpara Bilete");
        buyTicket.setLocation(129, 260);
        buyTicket.setSize(120, 20);
        buyTicket.setFont(new Font("Serif", Font.BOLD, 15));
        buyTicket.setForeground(Color.RED);

        totalGUI.add(title);
        totalGUI.add(picLabel);
        totalGUI.add(title1);
        totalGUI.add(userName);
        totalGUI.add(name);
        totalGUI.add(password);
        totalGUI.add(pass);
        totalGUI.add(login);
        totalGUI.add(buyTicket);

        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }

    static void createAndShowGUI() throws IOException {

        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("Home Page");
        //Create and set up the content pane.
        HomePage demo = new HomePage();
        frame.setContentPane(demo.createContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLocation(500, 220);
        frame.setVisible(true);
    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub

    }


}