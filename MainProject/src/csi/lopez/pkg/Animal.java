package csi.lopez.pkg;

public class Animal {
	//	Fields
    String name;
    int age;
    String scientificName;
    
    
    public Animal(String name,int age, String scientificName) {
		this.name = name;
		this.age = age;
		this.scientificName = scientificName;
	}
	public Animal() {}

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
        
        
    	
        
        
    
    }  
}
