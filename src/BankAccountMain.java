/**
 * Marc Lussier
 * Period 7
 * Bank Account GUI
 */



import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccountMain extends JFrame
{
	public BankAccountMain()
	{
		final double OVER_DRAFT_FEE = 15;
		final double RATE = 0.0025;
		final double TRANSACTION_FEE = 1.5;
		final double MIN_BAL = 300;
		final double MIN_BAL_FEE = 10;
		final int FREE_TRANSACTIONS = 10;
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		setTitle("BankAccount");
		setBounds(800,200,500,800);
		setLayout(null);
		
		JLabel name = new JLabel("Name: ");
		name.setBounds(25,25,125,25);
		add(name);
		
		JTextField ans1 = new JTextField();
		ans1.setBounds(100,25,125,25);
		add(ans1);
		
		JLabel accType = new JLabel("Account Type: ");
		accType.setBounds(25,75,125,25);
		add(accType);
		
		String choices[] = {"", "Savings", "Checking"};
		JComboBox type = new JComboBox(choices);
		type.setBounds(125,75,125,25);
		add(type);
		
		JLabel iniBal = new JLabel("Initial Balance: ");
		iniBal.setBounds(25,125,125,25);
		add(iniBal);
		
		JTextField ans2 = new JTextField();
		ans2.setBounds(125,125,125,25);
		add(ans2);
		
		JButton create = new JButton("Create Account");
		create.setBounds(25,175,125,25);
		add(create);
		create.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String name = ans1.getText();
						Object acc = type.getSelectedItem();
						String accType = acc.toString();
						String iniBal = ans2.getText();
						
						
						if(accType.equals("Savings"))
						{
							if(ans2.getText().trim().isEmpty())
							{
								accounts.add(new SavingsAccount(name,RATE,MIN_BAL, MIN_BAL_FEE));
							}
							else
							{
								Double bal = Double.parseDouble(iniBal);
								accounts.add(new SavingsAccount(name,bal,RATE,MIN_BAL, MIN_BAL_FEE));
							}
						}
						
						else if(accType.equals("Checking"))
						{
							if(ans2.getText().trim().isEmpty())
							{
								accounts.add(new CheckingAccount(name, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANSACTIONS));
							}
							else
							{
								Double bal = Double.parseDouble(iniBal);
								accounts.add(new CheckingAccount(name, bal, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANSACTIONS));
							}
						}
						repaint();
					}

					

				});
		
		
		JButton display = new JButton("Display All Accounts");
		display.setBounds(175,175,150,25);
		add(display);
		display.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						/*
						ArrayList<JLabel> accs = new ArrayList<JLabel>();
						for(int i = 0; i < accounts.size(); i++)
						{
							JLabel holder = new JLabel(accounts.get(i).toString());
							accs.add(holder);
						}
						
						for(int i = 0; i < accs.size(); i++)
						{
							JLabel fullAccount = new JLabel(accs.get(i).toString());
							Rectangle bounds = new Rectangle(25,25,500,20);
							fullAccount.setBounds(bounds);
							add(fullAccount);
						}
						
						repaint();*/
						
						for(int i = 0; i < accounts.size(); i++)
						{
							System.out.println(accounts.get(i).toString());
						}
					}
					
				});
		
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args)
	{
		new BankAccountMain();
	}

}
