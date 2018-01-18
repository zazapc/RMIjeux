package jeux;
import java.rmi.registry.LocateRegistry;
import javax.naming.Context;
import javax.naming.InitialContext;

public class ServeurRMI {
public static void main(String[] args){
	try {
		LocateRegistry.createRegistry(1099);
		JeuxImpl od=new JeuxImpl();
		System.out.println(od.toString());
		//Naming.rebind("rmi://localhost:1099/JH", od);
		Context ctx=new InitialContext();
		ctx.rebind("JH", od);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

