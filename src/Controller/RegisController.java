package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dao.UserDAO;
import models.User;
import Views.Registration;

public class RegisController implements ActionListener {
    Registration registration;

    public RegisController(Registration registration) {
        this.registration = registration;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Sign Up")) {

            String name = registration.getNameField().getText();
            String phone = registration.getPhoneField().getText();
            String email = registration.getEmailField().getText();
            String password = registration.getPasswordField().getText();
            String userType = registration.getUserType();

            try {
                long phoneNumber = Long.parseLong(phone);  

                if (userType != null) {

                    User user = new User(0, name, email, phoneNumber, password, userType);


                    UserDAO userDAO = new UserDAO();
                    int result = userDAO.Insert(user);


                    if (result > 0) {
                        System.out.println("User registered successfully!");
                    } else {
                        System.out.println("Error registering user.");
                    }
                } else {
                    System.out.println("Please select user type (Customer/Manager).");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid phone number.");
            }
        }
    }
  }

