package csi.lopez.pkg;

public class AnimalFarm {
	static Animal[] animals;
    
	public static void main(String[] args) {
		
		animals = new Animal[5];
		
		animals[0] = new Animal(new Taxomony("Eukaryote", "Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", "Felis","Felis Catus"),"Cat", 3, "Felis catus");	;
		animals[1] = new Animal(new Taxomony("Eukaryote", "Animalia", "Chordata", "Chondrichthyes", "Carcharhiniformes", "Carcharhinidae", "Galeocerdo", "G. cuvier"),"Tiger Shark", 4, "Galeocerdo cuvier");;
		animals[2] = new Animal(new Taxomony("Eukaryote", "Animalia", "Chordata", "Aves", "Psittaciformes", "Psittacidae", "Amazona", "A. vittata"),"Cotorra Puertoriqueña", 2, "Amazona vittata");
		animals[3] = new Animal(new Taxomony("Eukaryote", "Animalia", "Chordata", "Actinopteygii", "Scorpaeniformes", "Scorpaenidae", "Pterois", "Pterois volitans"), "Lion Fish", 1, "Pterois");
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		System.out.println(animals[4]);
		
	}
}
