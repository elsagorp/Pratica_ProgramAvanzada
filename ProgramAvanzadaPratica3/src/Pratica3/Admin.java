package Pratica3;

import java.util.ResourceBundle;

public class Admin {
	private String userName;
	private String password;
	
	public Admin(String userName,String pass) {
		this.userName = userName;
		this.password = pass;
		
	}
	public String getDatos() {
		return "Nickname: " + getUserName() + " \n";
				
						
				
	}
	public String getDatos(ResourceBundle sentence) {
		return sentence.getString("Nick") + getUserName() + "\n" ;	
						
				
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
