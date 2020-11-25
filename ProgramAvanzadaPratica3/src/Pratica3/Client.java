package Pratica3;

import java.util.ResourceBundle;
import java.util.Vector;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client<T> implements IBusqueda<T>{
	private String nickname;
	private String name;
	private String surname;
	private LocalDate birthdate;
	private Vector<T> favs;

	
	public Client() {
		this.favs = new Vector<T>();
	}
	 @Override
	 public void addto(T h) {
		 this.favs.add(h);
	 }
	 @Override
	 public Object exist(String name) {
		 for(int i=0; i<favs.size(); i++) {
			 if (favs.get(i).equals(name)) {
				 return favs.get(i);
			 }
		 }
		 return null;
	 }

	public String getDatos() {
		return "Nickname: " + getNickname() + " \n" +
				"Name: " + getName() + " \n" +
				"Surname: " + getSurname() + "\n" +
				"Todays date: " + LocalDate.now().getDayOfMonth()  + "-"+  LocalDate.now().getMonthValue() + "-" +   LocalDate.now().getYear()  +" \n" +
				"Age: " + getAge() + "\n";	
						
				
	}
	public String getDatos(ResourceBundle sentence) {
		return sentence.getString("Nick") + getNickname() + "\n" +
				sentence.getString("Name") + getName()+ " \n" +
				sentence.getString("Surname") + getSurname() + "\n" +
				sentence.getString("Date")  + LocalDate.now().getDayOfMonth()  + "-"+  LocalDate.now().getMonthValue() + "-" +   LocalDate.now().getYear()  +" \n" +
				sentence.getString("Age") + getAge() + "\n";	
						
				
	}
	
	public int getAge() {
		return (LocalDate.now().getYear() - this.birthdate.getYear());
	}


	public LocalDate getBirthdate() {
		return this.birthdate;
	}


	public void setBirthdate(String birthdate) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d = LocalDate.parse(birthdate,format);
		
		this.birthdate = d;
	}


	public String getNickname() {
		return this.nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return this.surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
