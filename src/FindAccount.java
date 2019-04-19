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

public class FindAccount extends JPanel implements ActionListener
{
	public FindAccount(ArrayList<BankAccount> accs)
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
		JLabel find = new JLabel("Which account would you like to see? Enter the account number: ");
		add(find,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		JTextField answer = new JTextField();
		answer.setPreferredSize(new Dimension (125,30));
		add(answer,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		JButton go = new JButton("Find Account");
		add(go,gbc);
		
		go.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}

			
		});
		
	}

	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
