package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class SchiffeFrame extends JFrame implements ActionListener
{
	SchiffePanel mPanel;
	
	JMenuBar mMenuBar;
	
	JMenu mMenuSpiel;
	JMenuItem mItemNeu;
	
	public SchiffeFrame()
	{
		super("Schiffe versenken");
		
		mPanel = new SchiffePanel();
		this.add(mPanel);
		
		mMenuBar = new JMenuBar();
		
		mMenuSpiel = new JMenu("Spiel");
		mMenuBar.add(mMenuSpiel);
		mItemNeu = new JMenuItem("Neues Spiel...");
		mItemNeu.addActionListener(this);
		mMenuSpiel.add(mItemNeu);
		
		
		this.setJMenuBar(mMenuBar);
		this.setSize(800, 500);
		//this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new SchiffeFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(mItemNeu))
		{
			String result = JOptionPane.showInputDialog(this, "IP Adresse eingeben", "Eingabe", JOptionPane.OK_CANCEL_OPTION);
			if(result!=null)
			{
				//TODO Neues Spiel
			}
		}
	}

}
