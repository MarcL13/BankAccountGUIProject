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

public class DepositFrame extends JPanel implements ActionListener
{
	public DepositFrame(ArrayList<BankAccount> accs)
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
		JLabel question = new JLabel("Which account would you like to deposit money into?");
		add(question,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		JTextField answer = new JTextField();
		answer.setPreferredSize(new Dimension (125,30));
		add(answer,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		JLabel much = new JLabel("How much?");
		add(much,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		JTextField amt = new JTextField();
		amt.setPreferredSize(new Dimension (125,30));
		add(amt,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		JButton deposit = new JButton("Deposit");
		add(deposit,gbc);
		
		deposit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String amount = amt.getText();
				for(BankAccount a : accs)
				{
					if(a.getAccNum() == Integer.parseInt(answer.getText()))
					{
						a.deposit(Integer.parseInt(amount));
						answer.setText("");
						amt.setText("");
					}
				}
			}
		});
		
		
		
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
