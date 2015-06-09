package backend;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Communication implements Serializable, Remote
{
	private static final long serialVersionUID = 1L;

	public Communication()
	{
		try {
			Naming.rebind("rmi://localhost/Schiffe", this);
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public static void connect(String host)
	{
		try {
			Communication remote = (Communication) Naming.lookup("rmi://"+host+"/Schiffe");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
