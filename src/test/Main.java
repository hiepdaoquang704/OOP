package test;
import javax.swing.UIManager;
import Views.Registration;
import Views.Manager;
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            new Manager(); 
            new Registration();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}