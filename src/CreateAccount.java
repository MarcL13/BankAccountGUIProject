import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccount extends JPanel
{
	public CreateAccount()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel name = new JLabel("Enter name here: ");
		add(name,gbc);
		
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		JTextField answer = new JTextField();
		answer.setPreferredSize(new Dimension (125,30));
		add(answer,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		JLabel type = new JLabel("Account type:");
		add(type,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		JComboBox acc = new JComboBox(new String[] {"", "Savings", "Checking"});
		acc.setPreferredSize(new Dimension (125,30));
		add(acc,gbc);
		
		setVisible(true);
	}

}
