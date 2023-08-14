
public class Application {
	//Property locatie

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");
		
		//product 1 is een variable
		Product product1 = new Product();
		product1.name = "TV";
		product1.soldOut = false;
		product1.price = 12;
		boolean 		uitkomst = product1.isCheap();
		//Declaration	//Assignment
		
		new Product (12);
		
		product1.increasePrice(100);
				
		System.out.println(product1.price);
		
		Person person1 = new Person();
		person1.naam = "Harry";
		person1.land = "Nederland";
		person1.leeftijd = 36;
		person1.twijfelaar = true;
		person1.waarzeggerJaEnNee = true;
		person1.zakgeld = 450;
		boolean uitkomst2 = person1.isYoung();
		boolean uitkomst3 = person1.isRich();
		
		person1.increaseLeeftijd(100);
		person1.increaseZakgeld(500000);
		
		Person person2 = new Person("Tim", 24);
		person2.print();
		
		System.out.println(person1.naam);
		System.out.println(person1.leeftijd);
		System.out.println(person1.land);
		System.out.println(person1.zakgeld);
		person1.print();
		System.out.println(uitkomst2);
		System.out.println(uitkomst3);
		
	}

}
