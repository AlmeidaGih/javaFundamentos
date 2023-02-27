package mod6;

import java.io.Serializable;

public class Usuario implements Autenticavel, Serializable{
	
	@Override 
	public boolean login(String usuario, String senha) {
		return false;
	}
	
	@Override
	public void logou() {
		
	}

}
