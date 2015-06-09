package gui;

import javax.swing.JPanel;

public class SchiffePanel extends JPanel 
{
	Attack mAttack;
	Defense mDefense;
	
	public SchiffePanel()
	{
		mAttack = new Attack();
		mDefense = new Defense();
		
		this.add(mAttack);
		this.add(mDefense);
	}

}
