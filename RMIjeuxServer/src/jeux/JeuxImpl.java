package jeux;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class JeuxImpl extends UnicastRemoteObject implements IJeuxRemote {
	private int nombreSecret;
	private boolean fin;
	public JeuxImpl() throws RemoteException {
		super();
		genererSecret();
	}
	
	private void genererSecret(){
		nombreSecret=(int) (Math.random()*100);
	}

	@Override
	public String jouer(int nombre) throws RemoteException {
		if(fin==false){
			if(nombre>nombreSecret)
				return "Votre nombre est plus grand";
			else if(nombre<nombreSecret)
				return "Votre nombre est plus petit";
			else{
				fin=true;
				return "felicitation vous avez gagner";
			}
		}else{
			return "jeux terminer le nombre secret est :"+nombreSecret;
		}
	}

}
