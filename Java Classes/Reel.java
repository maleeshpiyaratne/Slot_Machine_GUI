import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Reel extends Thread
{
	
	private static Symbol [] symbol = new Symbol[6];
	
	//help start spin and stop spin
	private boolean spinning = true;
	private Timer timer;
	private String sel_sym;
	
	//to generate a random number for the selection of the symbol
	int random = -1;
	
	
	Symbol s1 = new Symbol("Coursework_02_SM/redseven.png",7);
	Symbol s2 = new Symbol("Coursework_02_SM/bell.png",6);
	Symbol s3 = new Symbol("Coursework_02_SM/watermelon.png",5);
	Symbol s4 = new Symbol("Coursework_02_SM/plum.png",4);
	Symbol s5 = new Symbol("Coursework_02_SM/lemon.png",3);
	Symbol s6 = new Symbol("Coursework_02_SM/cherry.png",2);
	
	public Reel()
	{
		random = -1;
	}
	public void addSymbols()
	{
		symbol[0] = new Symbol("redseven.png", 7);
		symbol[1] = new Symbol("bell.png", 6);
		symbol[2] = new Symbol("watermelon.png", 5);
		symbol[3] = new Symbol("plum.png", 4);
		symbol[4] = new Symbol("lemon.png", 3);
		symbol[5] = new Symbol("cherry.png", 2);
	}
	
	public void run()
	{
		addSymbols();
		timer = new Timer (100, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) {
				spin();
				
			}
		});
		
		timer.start();
	}
	
	public void spin()
	{
		random = (int)Math.floor(Math.random()*5);
		sel_sym = symbol[random].getImage();
	}
	
	public void stop_spin()
	{
		synchronized(this)
		{
			spinning = false;
			try
			{
				join();
				timer.stop();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public String toString()
	{
		return "";
	}
}
