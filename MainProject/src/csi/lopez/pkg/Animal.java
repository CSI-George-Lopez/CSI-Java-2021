package csi.lopez.pkg;


public class Animal {
	//	Fields
    String name;
    int age;
    String scientificName;
    Taxomony taxomony;
    
    
    public Animal(String name,int age, String scientificName) {
		this.name = name;
		this.age = age;
		this.scientificName = scientificName;
	}
	public Animal() {}
	
	public Animal(Taxomony taxomony, String name, int age, String scientificName) {
		this.name = name;
		this.age = age;
		this.scientificName = scientificName;
		this.taxomony = taxomony;
	}

    //  Getters and Setters  
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getScientificName(){
        return scientificName;
    }
    public void setScientificName(String scientificName){
        this.scientificName = scientificName;
    }
    
    public Taxomony getTaxomony() {
    	return taxomony;
    }
    
    public String toString() {
   	    String s = String.format("name:  %s \n Age: %s \n ScientificName: %s \n Taxomony: %s",name, age, scientificName, taxomony, getTaxomony().toString());
    	return s;
   }
   
    
    
    public static void main(String[] args) {
    	Animal a = new Animal();
    	a.setName("Tigre");
    	a.setAge(9);
    	a.setScientificName("Panthera Tigris");
    	
    	
    	System.out.println("Name: " + a.getName());
        System.out.println("Age: " + a.getAge());
        System.out.println("Scientific Name: " + a.getScientificName());
        
        
        Animal a2 = new Animal("Cat", 3, "Felis catus");
        
        System.out.println("Name:" + a2.name);
        System.out.println("Age:" + a2.age);
        System.out.println("Scientific Name:" + a2.scientificName);
        
        
        
                
        Taxomony taxomony  = new Taxomony("Eukaryote", "Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", "Genus","Felis Catus");
        
        Animal a3 = new Animal(taxomony, "Cat", 4, "Felis Catus");
        
        a3.getTaxomony().getDomain();
        a3.getTaxomony().getKingdom();        
        a3.getTaxomony().getPhylum();

        
        System.out.println("Domain: " + a3.getTaxomony().getDomain());
        System.out.println("Kingdom: " + a3.getTaxomony().getKingdom());
        System.out.println("Phylum: " + a3.getTaxomony().getPhylum());
        System.out.println();
        System.out.println(a3.toString());
        


        

    }  
}
