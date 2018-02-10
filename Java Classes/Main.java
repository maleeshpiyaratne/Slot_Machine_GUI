import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends Thread
{
	
	public Main()
	{
	}
	
	public static void main(String[] args) 
	{
		Thread th1 = new Thread();
		Thread th2 = new Thread();
		Thread th3 = new Thread();
		//JOption.showMessageDialog(null, "");
		GameFrame gf = new GameFrame();
	}

	public void spin_all(){}
}