import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccount extends JPanel implements ActionListener
{
	public CreateAccount(ArrayList<BankAccount> accs)
	{
		final double OVER_DRAFT_FEE = 0;
		final double RATE = 0;
		final double TRANSACTION_FEE = 0;
		final double MIN_BAL = 0;
		final double MIN_BAL_FEE = 0;
		final int FREE_TRANSACTIONS = 0;
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel enter = new JLabel("Enter name here: ");
		add(enter,gbc);
		
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		JTextField answer = new JTextField();
		answer.setPreferredSize(new Dimension (125,30));
		add(answer,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		JLabel accType = new JLabel("Account type:");
		add(accType,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		JComboBox acc = new JComboBox(new String[] {"", "Savings", "Checking"});
		acc.setPreferredSize(new Dimension (125,30));
		add(acc,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		JLabel iniBal = new JLabel("Initial Balance: ");
		add(iniBal, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		JTextField amount = new JTextField();
		amount.setPreferredSize(new Dimension (125,30));
		add(amount, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		JButton create = new JButton("Create Account");
		create.setPreferredSize(new Dimension (125,30));
		add(create,gbc);
		
		
		
		
		//adding info to arraylist
		create.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String name = answer.getText();
						String type = (acc.getSelectedItem().toString());
						String amt = amount.getText();
						
						if(type.equals("Savings"))
						{
							if(amt.trim().isEmpty())
							{					
								accs.add(new SavingsAccount(name,RATE,MIN_BAL, MIN_BAL_FEE));
								answer.setText("");
								acc.setSelectedIndex(0);
								amount.setText("");
							}
							else
							{
								Double bal = Double.parseDouble(amt);
								accs.add(new SavingsAccount(name,bal,RATE,MIN_BAL, MIN_BAL_FEE));
								answer.setText("");
								acc.setSelectedIndex(0);
								amount.setText("");
							}
						}
						else if(type.equals("Checking"))
						{
							if(amt.trim().isEmpty())
							{
								accs.add(new CheckingAccount(name, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANSACTIONS));
								answer.setText("");
								acc.setSelectedIndex(0);
								amount.setText("");
							}
							else
							{
								Double bal = Double.parseDouble(amt);
								accs.add(new CheckingAccount(name, bal, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANSACTIONS));
								answer.setText("");
								acc.setSelectedIndex(0);
								amount.setText("");
							}
						}
					}
				});

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}
