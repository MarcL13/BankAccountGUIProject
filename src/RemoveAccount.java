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

public class RemoveAccount extends JPanel implements ActionListener
{
	public RemoveAccount(ArrayList<BankAccount> accs)
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
		JLabel info = new JLabel("Enter the account number you would like to remove: ");
		add(info, gbc);
		
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		JTextField answer = new JTextField();
		answer.setPreferredSize(new Dimension (125,30));
		add(answer,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		JButton remove = new JButton("Remove Account");
		remove.setPreferredSize(new Dimension (150,30));
		add(remove,gbc);
		
		//taking account from array list
		remove.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String num = answer.getText();
				for(int i = 0; i < accs.size(); i++)
				{
					int accNum = Integer.parseInt(num);
					if(accs.get(i).getAccNum() == accNum)
					{
						accs.remove(i);
						answer.setText("");
					}
				}
			answer.setText("");
			}
			
		});
		
		setVisible(true);
		
		
		
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
