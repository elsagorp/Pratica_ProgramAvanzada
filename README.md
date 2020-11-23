# Pratica3PA
En esta Prática continuamos desarrollando el código de la Prática anterior. Esta consistía en crear un programa con diferentes clases todo centrado en la gestión de hoteles. Y en esta tercera parte hemos añadido varias clases más que explicaremos mas adelante.

## Indice
- [Diagrama de clases]
- []
- []
- []
- []
- []
- []

## Diagrama de clases

## Herencia y polimorfismo
En este trabajo hemos credo una superclase **Hotel** de la cual se extiende ha varias subclases: **Habitacion*, **HotelPool** , **HotelRestaurant** y **HotelPoolRestaurant**. Y todos los diferentes tipos de Hoteles se gestionan en la clase **ListaHotels**.

-**Habitacion** estaía formada por todos los datos de cada habitación.
```ruby
public class Habitacion extends Hotel{
    private int num;
    private int cap;
    private float prize;
}
```
-**HotelPool** estaría formada por los hoteles con piscina. Donde te puede decir si la piscina es cubierta o en interior con un booleano.
```ruby
bool outpool;
```
-**HotelReestaurant** estaría formada po los hoteles con restaurante. También en esta subclase hemos utilizado un booleano paara informar si hay terraza o no hay.
```ruby
bool restaurTerrace;
```
-**HotelPoolRestaurant** estaría formada por los hoteles con piscina y restaurante. Ya que esta subclase es una "fusión" entre las otras dos, en esta se añadirian los dos booleanos anteriores.
```ruby
bool outpool;
bool restaurTerrace;
```
En el caso de querer un hotel que no tenga ni piscina ni restaurante se usaría la superclase.

Por otro lado también hemos añadido las clases **Client** , **Admin** y la clase **ListaStoreUser**.

-**Client** almacena toda la información de los clientes.
```
```
-**Admin** almacena los datoss de los administradores del gestor de hoteles.
```
```
-**ListaStoreUser** y esta clase se encarga de gestionar los diferentes tipos de usuarios que puede haber en la web.
```
```
## Sobrecarga

## Interfaces y Genericos

## Menu
Hemos creado una clase **Menu** con un static void main. En esta clase es donde se crearan los diferentes objetos. Y donde estará situado el código que interactua con las personas que usen este programa. Y se irán llamando a las diferentes funciones.
```ruby
public class Menu {

	public static void main(String[] args) {
  
  }

```
Para sacar por pantalla se utiliza ```System.out.print("Algo); ```  o si quieres que haga un salto de línea se pone ```System.out.println("Algo");``` . Ejemplo: 

![fotoPrueba](https://user-images.githubusercontent.com/72611127/97572627-dc0eda00-19e8-11eb-8750-9c21893af783.jpeg)

Y para que el usuario pudiera meter datos por pantalla hemos utilizado la biblioteca ```import java.util.Scanner; ``` .Por ahora solo hemos hecho que el usuario pueda meter por pantalla ```String``` o ```int``` . Ejemplo:

![fotoPrueba2](https://user-images.githubusercontent.com/72611127/97573342-e4b3e000-19e9-11eb-9ad3-6edce6d84a48.jpeg)


## Internacionalización de la aplicación
Para conseguir traducir todo lo que salga por pantalla a varios idiomas, en este caso español e inglés. Hemos creado una clase **Traductor** en la que hemos importado varias librerias.
```ruby
import java.util.ResourceBundle;
import java.util.Locale;

public class Translator {

}
```
A continuación hemos creado unos **ficheros.properties** en los que dentro introduces primero la palabrabraclave = Frase en el idioma de ese fichero. La estructura de el nombre de el fichero que hay que darle es: **nombreEtiqueta_id_paísIdioma.properties** . Por ejemplo en nuetro trabajo hemos creado estos dos ficheros:

![1](https://user-images.githubusercontent.com/72611127/99972727-2fcdd280-2d9f-11eb-8199-edc3144b162b.jpeg)

Gracias a las funciones y variables creadas en la clase **Traductor** que estan a continuación se puede usar el traductor en el **Menu**.
```ruby
public class Translator {
	
	private Locale locale;
	private Locale chLoc = new Locale("ch","CH");
	private Locale enLoc = new Locale("en","US");
	private Locale esLoc = new Locale("es","ES");
	
	public Translator() {
		
	}
	public Locale getLocale() {
		return this.locale;
	}

	
	public String getTraduc(String word) {
		return ResourceBundle.getBundle("Messages", locale).getString(word);
	}
	
	public Locale setLoc(int languag) {
		if(languag == 1) {
			locale = Translator.this.enLoc;
			
		}else if(languag == 2){
			
			locale = Translator.this.esLoc;
			
		}else {
			
			locale = Translator.this.chLoc;
		}
		
		return locale;
	}	

}

```
Añadiendo un poco de código en **Menu** pidiendo por pantalla el idioma que quieres y cambiandolo dependiendo del seleccionado, se vería de esta manera:

![foto2](https://user-images.githubusercontent.com/72611127/99972775-3c522b00-2d9f-11eb-831a-93f5bf1e04a0.jpeg)

![foto3](https://user-images.githubusercontent.com/72611127/99972789-3f4d1b80-2d9f-11eb-872e-e1feb8eef5da.jpeg)

![Foto4](https://user-images.githubusercontent.com/72611127/99972797-41af7580-2d9f-11eb-9c24-7518491798ae.jpeg)

## Operador condicional
El operador ternario es otro de los operadores condicionales. Es una forma reducida de escribir un **if-then-else**. El operador ternario es representado mediante el símbolo **?:**.

La estructura del operador ternario es:
`(expresion)?valor_true:valor_false;`

En el caso de que la expresión tenga un valor de true se retorna el valor indicado después del cierre de interrogación **(?)** Y si la expresión tiene un valor de false se retorna el valor que esté después de los dos puntos **(:)**.

El operador ternario se suele utilizar para decidir que valor asignar. Un ejemplo de código del operador ternario sería:
```ruby
int vble1 = 5;
int vble2 = 4;
int mayor;

mayor = (vble1 > vble2)?vble1:vble2;

System.out.println("El mayor de los dos números es " + mayor);
```
En est prática lo hemos utilizado en diferentes funciones, a continución se puede ver como cambia la estructura con el operador **?:**.

![condicional](https://user-images.githubusercontent.com/72611127/99973639-432d6d80-2da0-11eb-98f0-39fbcea2b1ef.jpeg)
![condicional2](https://user-images.githubusercontent.com/72611127/99973643-44f73100-2da0-11eb-8fbf-13ea9baf7ff2.jpeg)
## Math


## LocalDate
Para usar una clase con **LocalDate** , hemos creado la clase **Cliente**. En la que a partir de que el usuario introduzca su fecha de nacimiento, una función para calcular su edad usa ese dato y con **LocalDate** de  la fecha actual saca la edad del usuario. Utilizando los diferentes métodos de la clase **LocalDate** . Se añade esta clase con ```import java.time.LocalDate;```. Y también hemos utilizado la librería ```import java.time.format.DateTimeFormatter;``` para establecer el formato que queremos. Y además lo utilizamos para dar el día actual cuando imprimes los datos del cliente.

```ruby
	public String getDatos() {
		return "Nickname: " + getNickname() + " \n" +
				"Name: " + getName() + " \n" +
				"Surname: " + getSurname() + "\n" +
				"Todays date: " + LocalDate.now().getDayOfMonth()  + "-"+  LocalDate.now().getMonthValue() + "-" +   LocalDate.now().getYear()  +" \n" +
				"Age: " + getAge() + "\n";					
				
	}
```
## Sonar Lint
Esta aplicación lo que hace es Lo que hace es enviarnos warnings a la lista de errores del entorno, y podremos hacer click (o enter) sobre cada uno para ir al fichero y línea en el que se está produciendo ese error.
[web que puede ayudarte](https://www.youtube.com/watch?v=sGElVI3fJAo&t=1s)

![sonar2](https://user-images.githubusercontent.com/72611127/99972550-f1d0ae80-2d9e-11eb-9636-d9c696dc60c3.jpeg)


![sonar1](https://user-images.githubusercontent.com/72611127/99972539-ef6e5480-2d9e-11eb-9050-117dbe131fef.jpeg)
