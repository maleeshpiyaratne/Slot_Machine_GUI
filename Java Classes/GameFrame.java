import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameFrame extends JFrame
{
	private static int credit;
	private static int bet;
	private static int wins;
	private static int loses;
	private static int winnings;
	private static int no_games;
	
	String stat;
	
	Main main;
	
	JPanel main_panel;
	
	//panels to hold the components assigned 
	//to the areas in the border layout format.

	JPanel north_panel;
	JPanel south_panel;
	JPanel center_panel;
	JPanel east_panel;
	JPanel west_panel;
	
	JButton add_coin_btn;
	JButton bet_one_btn;
	JButton bet_max_btn;
	JButton reset_btn;
	JButton spin_btn;
	JButton statistics_btn;
	
	JLabel credit_area_lbl;
	JLabel credit_amt_lbl;
	JLabel bet_area_lbl;
	JLabel bet_amt_lbl;
	
	JPanel reel1_panel;
	JPanel reel2_panel;
	JPanel reel3_panel;
		
	JLabel imageholder_r1;
	JLabel imageholder_r2;
	JLabel imageholder_r3;
	
	ImageIcon reel_img_01;
	ImageIcon reel_img_02;
	ImageIcon reel_img_03;
	
	public GameFrame()
	{
		main = new Main();
		
		//frame settings
		this.setTitle("Slot Machine Game");
		this.setVisible(true);
		this.setSize(1000,700);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//main panel settings
		main_panel = new JPanel();
		this.add(main_panel);
		main_panel.setBackground(Color.GRAY);
		main_panel.setPreferredSize(new Dimension(1000,700));
		main_panel.setLayout(new BorderLayout(10,10));
		
		
		center_panel = new JPanel();
		center_panel.setVisible(true);
		center_panel.setBackground(Color.BLUE);
		center_panel.setPreferredSize(new Dimension(100,100));
		center_panel.setLayout(new FlowLayout());
		main_panel.add(center_panel, BorderLayout.CENTER);
		
		south_panel = new JPanel();
		south_panel.setVisible(true);
		south_panel.setBackground(Color.CYAN);
		south_panel.setLayout(new FlowLayout());
		south_panel.setPreferredSize(new Dimension(500,100));
		main_panel.add(south_panel, BorderLayout.SOUTH);
		
		east_panel = new JPanel();
		east_panel.setVisible(true);                                                                                                                                         
		east_panel.setBackground(Color.DARK_GRAY);
		east_panel.setLayout(new FlowLayout());
		east_panel.setPreferredSize(new Dimension(150,500));
		main_panel.add(east_panel, BorderLayout.EAST);
		
		center_panel.add(reel1_panel);
		center_panel.add(reel2_panel);
		center_panel.add(reel3_panel);
		
		add_coin_btn = new JButton("Add Coin");
		bet_one_btn = new JButton("Bet One");
		bet_max_btn = new JButton("Bet Max");
		reset_btn = new JButton("Reset");
		spin_btn = new JButton("Spin");
		statistics_btn = new JButton("Statistics");
		
		south_panel.setLayout(new FlowLayout());
		south_panel.add(add_coin_btn);
		south_panel.add(bet_one_btn);
		south_panel.add(bet_max_btn);
		south_panel.add(reset_btn);
		south_panel.add(spin_btn);
		south_panel.add(statistics_btn);
		
		credit_area_lbl = new JLabel("Credit Area: ");
		credit_amt_lbl = new JLabel("Null");
		bet_area_lbl = new JLabel("Bet Area: ");
		bet_amt_lbl = new JLabel("Null");
		
		east_panel.setLayout(new FlowLayout());
		east_panel.add(credit_area_lbl);
		east_panel.add(credit_amt_lbl);
		east_panel.add(bet_area_lbl);
		east_panel.add(bet_amt_lbl);
		
		//setting images to the reels.
		
		reel_img_01 = new ImageIcon(getClass().getResource("redseven.png"));
		reel_img_02 = new ImageIcon(getClass().getResource("redseven.png"));
		reel_img_03 = new ImageIcon(getClass().getResource("redseven.png"));
		
		imageholder_r1 = new JLabel(reel_img_01);
		imageholder_r2 = new JLabel(reel_img_02);
		imageholder_r3 = new JLabel(reel_img_03);
		
		center_panel.add(imageholder_r1);
		center_panel.add(imageholder_r2);
		center_panel.add(imageholder_r3);
		
	}
	
	public String toString()
	{
		return "";
	}
	
	private class Buttonhandler implements MouseListener
	{

		public void actionPerformed(ActionEvent event) 
		{
			
			if(event.getSource() == add_coin_btn)
			{
				credit += 1;
			}
			if(event.getSource() == bet_one_btn)
			{
				bet += 1;
			}
			if(event.getSource() == bet_max_btn)
			{
				bet += 1;
			}
			if(event.getSource() == reset_btn)
			{
				credit += bet;
				bet = 0;
			}
			if(event.getSource() == spin_btn)
			{
				main.spin_all();
			}
			if(event.getSource() == statistics_btn)
			{
				int netted = winnings/no_games;
				stat = "Number of games won: "+wins+"\nNumber of games lost: "+loses+"\nAverage credit nettted: "+netted;
				JOptionPane.showMessageDialog(null, stat);
			}
		}
		
	}
}


