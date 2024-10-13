package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import Views.Registration;
public class RegisController implements ActionListener{
	Registration Registration;
	
	public RegisController(Views.Registration registration) {
		this.Registration = registration;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command =e.getActionCommand();
		if(command.equals("Registration")) {
			
		};
	}

}
