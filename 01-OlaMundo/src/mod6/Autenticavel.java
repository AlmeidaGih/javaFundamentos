package mod6;

public interface Autenticavel {

	String MSG_LOGOUT = "Saindo";
	
	boolean login(String usuario, String senha);
	
	void logou();
}
