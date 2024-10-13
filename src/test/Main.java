package test;
import javax.swing.UIManager;
import Views.Registration;
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Registration(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}