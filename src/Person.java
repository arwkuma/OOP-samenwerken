
// Blauwdruk
public class Person {
	
	public String naam;
	
	public int leeftijd;
	
	public int zakgeld;
			
	public boolean waarzeggerJaEnNee;	
	
	public String land;
	
	public boolean twijfelaar;
	
	public void increaseLeeftijd() {
		leeftijd = leeftijd + 1;
	}	
	public void increaseZakgeld() {
		zakgeld = zakgeld + 50;
	}
	
	public void print() {
		System.out.println("Person: Mijn naam is " + naam + " en ik ben " + leeftijd + " jaar oud");
	}
	
	public void increaseLeeftijd(int leeftijd) {
		this.leeftijd = this.leeftijd + leeftijd;		
	}
	public void increaseZakgeld(int zakgeld) {
		this.zakgeld = this.zakgeld + zakgeld;		
	}
	public boolean isYoung() {
		return leeftijd < 27;
	}
	public boolean isRich() {
		return zakgeld < 5000;
	}
	
	public Person(int zakgeld) {
		this.zakgeld = zakgeld;
	}
	
	public Person (String name, int leeftijd)
	 { this.naam = name; 
	 this.leeftijd = leeftijd;
		
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
}
