package jeux;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IJeuxRemote extends Remote{
public String jouer(int nombre)throws RemoteException;
}
