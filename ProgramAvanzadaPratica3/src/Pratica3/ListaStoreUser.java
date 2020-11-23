package Pratica3;

import java.util.Vector;

public class ListaStoreUser {
	private Vector<Admin> admins;
	private Vector<Client> clients;
	
	public ListaStoreUser(Vector<Admin> adm) {
		this.admins = adm;
		this.clients = new Vector <Client>();
	}

	public Vector<Admin> getAdmins() {
		return this.admins;
	}

	public void setAdmins(Vector<Admin> admins) {
		this.admins = admins;
	}
	
	public void addClient(Client c) {
		this.clients.add(c);
	}
	
	public String existAdmin(Admin a) {
		for(Admin elem:this.admins) {
			if(elem.equals(a)) return "Existacc";
		}
		return "Noexist";
	}
	public String existClient(Client c) {
		for(Client elem:this.clients) {
			if(elem.equals(c)) return "Existacc";
		}
		return "Noexist";
	}

}
