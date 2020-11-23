package Pratica3;

import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;
 
public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Hotel> l1 = new ArrayList <Hotel>();

		HotelPool h1 = new HotelPool("Ibis","Ventas", "Madrid", 250,3, false,true,false, true, 54, 70);
		l1.add(h1);
		HotelPool h2 = new HotelPool("Burj","Rafa street", "Dubai", 850,5, false ,true,false, true, 100, 120);
		l1.add(h2);
		
		HotelRestaur h3 = new HotelRestaur("Loran","Parliament street", "Canada", 100,1, true,false,true, false, "Osaka", "Japnese food", 25, 4,90);
		l1.add(h3);
		HotelRestaur h4 = new HotelRestaur("Shajon","Georgie street", "Dublin", 450,3, false,false,true, true, "Tariel", "Traditional food", 15, 3,48);
		l1.add(h4);
		
		HotelPool h5 = new HotelPool("Saron","Lieroy street", "London", 90,0, false ,true,false, false,15,20);
		l1.add(h5);
		
		HotelRestPool h6 = new HotelRestPool("Zent","Alcala", "Madrid", 300,4, false ,true,true, true,"Taberna de Juan","Spanish food", 30,3,105, false, 25,40);
		l1.add(h6);
		
		HotelRestPool h7 = new HotelRestPool("Vipen","Gijin street", "Berlin", 145,2, true ,true,true, false, "Skykitchen","Traditional german food",20,1,40,true,10,20);
		l1.add(h7);
		
		Hotel h8 = new Hotel("Akagamishi","Ankatsu street", "Tokyo", 145,2, true ,false,false);
		l1.add(h8);
		
		ListaHotels <Hotel> list = new ListaHotels(l1);
		
		Admin a1 = new Admin("ElsaGorP", "12345");
		Vector <Admin> a = new Vector<Admin> ();
		a.add(a1);
		
		ListaStoreUser listUser = new ListaStoreUser(a);
		
		int languag = 0;
		int caso = 0;

		String elim;
		
		int caso2 = 0;
		ListaHotels <Hotel> filt;
		ListaHotels <Hotel> filt2;
		ListaHotels <Hotel> filt3;
		
		Translator loc = new Translator();
		
		System.out.println("Language:\n" + "1-English.\n" + "2-Spanish.\n" + "3-Chinese.\n");
		languag = sc.nextInt();
		loc.setLoc(languag);
		ResourceBundle sentence = ResourceBundle.getBundle("Pratica3.Messages", loc.getLocale());
		try{
			do{
				System.out.println(sentence.getString("Whatyouwanttodo?"));
				System.out.println(sentence.getString("Eliminateanhotel"));
				System.out.println(sentence.getString("Seethehotels"));
				System.out.println(sentence.getString("Filterhotels"));
				System.out.println(sentence.getString("Signup"));
				System.out.println(sentence.getString("Adminaccess"));
				caso = sc.nextInt();
				
				switch(caso) {
				case 1:
					System.out.println(sentence.getString("opelim1"));
					System.out.println(sentence.getString("opelim2"));
					caso = sc.nextInt();
					if(caso == 1) {
						Scanner sel = new Scanner(System.in);
						System.out.println(sentence.getString("eliminate1?"));
						elim = sel.nextLine();
						list.elimHotel(elim);
						if(list.elimHotel(elim) == false) System.out.println(sentence.getString("ErrorName"));;
						sel.close();
					}else {
						System.out.println(sentence.getString("eliminate2?"));
						System.out.println(sentence.getString("Position"));

						caso = sc.nextInt();
						list.elimHotel(caso);
						
					}
						
					
					break;
					
				case 2:
					
					System.out.println(list.consultaHotel(sentence));
					
					break;
				
				case 3:
					
					System.out.println(sentence.getString("youwant"));
					System.out.println(sentence.getString("Hotelwithpool"));
					System.out.println(sentence.getString("Hotelrestaur"));
					System.out.println(sentence.getString("Hotelboth"));
					System.out.println(sentence.getString("Hotelnoth"));
					System.out.println(sentence.getString("Hotelswim"));
					System.out.println(sentence.getString("Hotelrest"));
					caso2 = sc.nextInt();
					
					switch(caso2) {
						case 1:
							filt = new ListaHotels(list.filter(true,false));
							System.out.println(filt.consultaHotel());
							break;
						case 2:
							filt = new ListaHotels(list.filter(false,true));
							System.out.println(filt.consultaHotel());
							break;
						case 3:
							filt = new ListaHotels(list.filter(true,true));
							System.out.println(filt.consultaHotel());
							break;
						case 4:
							filt = new ListaHotels(list.filter(false,false));
							System.out.println(filt.consultaHotel());
							break;
						case 5:
							filt = new ListaHotels(list.filter(true,false));
							filt2 = new ListaHotels(list.filter(true,true));
							filt3 = new ListaHotels(list.addListas(filt,filt2));
							
							System.out.println(filt3.consultaHotel());
							break;
						case 6:
							filt = new ListaHotels(list.filter(true,true));
							filt2 = new ListaHotels(list.filter(false,true));
							filt3 = new ListaHotels(list.addListas(filt,filt2));
							System.out.println(filt3.consultaHotel());
							break;
							
					}
				
					break;
				
				case 4:
					Scanner s = new Scanner(System.in);
					Client cli = new Client();
					String re;
					String d;
					int cas;
					
					System.out.println(sentence.getString("Signup"));
					System.out.println(sentence.getString("Name"));
					re = s.nextLine();
					cli.setName(re);
					
					
					System.out.println(sentence.getString("Surname"));
					re = s.nextLine();
					cli.setSurname(re);
					
					System.out.println(sentence.getString("Nick"));
					re = s.nextLine();
					cli.setNickname(re);
					
					System.out.println(sentence.getString("Birthdate"));
					d = s.nextLine();
				
					cli.setBirthdate(d);
					listUser.addClient(cli);
					
					System.out.println(sentence.getString("Seeclient"));
					cas = s.nextInt();
					
					if(cas == 1) System.out.println(cli.getDatos(sentence));
					
					break;
				
				case 5:
					String n;
					String ps;
					Scanner scca = new Scanner(System.in);
					System.out.println(sentence.getString("Nick"));
					n = scca.nextLine();
					System.out.println(sentence.getString("Passw"));
					ps = scca.nextLine();
					Admin prb = new Admin(n,ps);
					System.out.println(sentence.getString(listUser.existAdmin(prb)));
										
				
					
			}
				
			}while(caso < 12) ;
			
		}catch (Exception e) {
			System.out.println(sentence.getString("Error"));
		}
		sc.close();
		

	}


}
