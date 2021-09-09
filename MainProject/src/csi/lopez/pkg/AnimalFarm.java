package csi.lopez.pkg;

public class AnimalFarm {
	Animal animals;
	String name;

	int age;
    String scientificName;
    Taxomony taxomony;
    
	public AnimalFarm( String name, int age, String scientificName, Taxomony taxomony) {
		this.name = name;
		this.age = age;
		this.scientificName = scientificName;
		this.taxomony = taxomony;
	}
    
	public static void main(String[] args) {
		
		Taxomony taxomony1  = new Taxomony("Eukaryote", "Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", "Genus","Felis Catus");Taxomony taxomony2 = new Taxomony("Eukaryote", "Animalia", "Chordata", "Chondrichthyes", "Carcharhiniformes", "Carcharhinidae", "Galeocerdo", "G. cuvier");AnimalFarm a2 = new AnimalFarm("Tiger Shark", 4, "Galeocerdo cuvier", taxomony2);		Taxomony taxomony3 = new Taxomony("Eukaryote", "Animalia", "Chordata", "Aves", "Psittaciformes", "Psittacidae", "Amazona", "A. vittata");AnimalFarm a3 = new AnimalFarm("Cotorra Puertoriqueña", 2, "Galeocerdo cuvier", taxomony3);		Taxomony taxomony4 = new Taxomony("Eukaryote", "Animalia", "Chordata", "Actinopteygii", "Scorpaeniformes", "Scorpaenidae", "Pterois", "Pterois volitans");AnimalFarm a4 = new AnimalFarm("Cotorra Puertoriqueña", 2, "Galeocerdo cuvier", taxomony3);		AnimalFarm a1 = new AnimalFarm("Cat", 3, "Felis catus", taxomony1);		
		
		AnimalFarm[] animalArray = new AnimalFarm[5];
		
		animalArray[0] = a1;
		animalArray[1] = a2;
		animalArray[2] = a3;
		animalArray[3] = a4;
		animalArray[0] = null;
		
		
	}

}
