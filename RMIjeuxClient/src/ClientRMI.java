import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import jeux.IJeuxRemote;

public class ClientRMI {
public static void main(String[] args){
	try {
		Context ctx=new InitialContext();
		IJeuxRemote stub=(IJeuxRemote) ctx.lookup("JH");
		Scanner clavier=new Scanner(System.in);
		
		while(true){
			System.out.println("Deviner");
			int nb=clavier.nextInt();
			if(nb==-1) break;
			String rep=stub.jouer(300);
			System.out.println(rep);
			
		}		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
