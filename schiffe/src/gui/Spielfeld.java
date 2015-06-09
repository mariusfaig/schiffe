package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Spielfeld extends JPanel
{
	Square[][] mFeld; 
	
	public Spielfeld(int size)
	{
		this.setLayout(new GridLayout(size+1, size+1));
		
		mFeld = new Square[size][size];
		this.add(new JLabel());
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0; i<size; i++)
		{
			this.add(new JLabel(String.valueOf(alphabet.charAt(i))));
		}
		for(int i=0; i<mFeld.length; i++)
		{
			this.add(new JLabel(Integer.toString(i+1)));
			for(int j=0; j<mFeld[i].length; j++)
			{
				mFeld[i][j] = new Square();
				this.add(mFeld[i][j]);
			}	
		}
	}

}
