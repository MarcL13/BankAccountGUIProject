import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TransferFrame extends JPanel implements ActionListener
{
	public TransferFrame(ArrayList<BankAccount> accs)
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
		JLabel from = new JLabel("From which account would you like to take from? Enter the account number.");
		add(from,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		JTextField answer = new JTextField();
		answer.setPreferredSize(new Dimension (125,30));
		add(answer,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		JLabel to = new JLabel("Which account would you like to transfer money to? Enter the account number.");
		add(to,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		JTextField answer2 = new JTextField();
		answer2.setPreferredSize(new Dimension (125,30));
		add(answer2,gbc);		
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		JLabel much = new JLabel("How much?");
		add(much,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		JTextField amt = new JTextField();
		amt.setPreferredSize(new Dimension (125,30));
		add(amt,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		JButton transfer = new JButton("Transfer");
		add(transfer,gbc);
		
		transfer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String amount = amt.getText();
				for(BankAccount a : accs)
				{
					if(a.getAccNum() == Integer.parseInt(answer.getText()))
					{
						BankAccount transferTo = null;
						for(BankAccount b : accs)
						{
							if(b.getAccNum() == Integer.parseInt(answer2.getText()))
							{
								transferTo = b;
							}
						}
					a.transfer(transferTo, Integer.parseInt(amount));
					}
				}
				answer.setText("");
				answer2.setText("");
				much.setText("");
			}
			
			
		});
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
