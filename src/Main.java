import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args){
		Main main = new Main();
		AnimalShelter animalShelter = main.new AnimalShelter();
		
		Pet mocha = new Pet("Mocha", AnimalType.DOG);
		Pet mochi = new Pet("Mochi", AnimalType.DOG);
		Pet cato = new Pet("Cato", AnimalType.CAT);
		Pet coffee = new Pet("Coffee", AnimalType.CAT);
		
		animalShelter.enqueue(mocha);	
		animalShelter.enqueue(mochi);
		animalShelter.enqueue(cato);
		animalShelter.enqueue(coffee);
	
		System.out.println("Adopted cat: " + animalShelter.dequeueCat().name);
		System.out.println("Adopted dog: " + animalShelter.dequeueDog().name);
	}
	
	public enum AnimalType {
		DOG, CAT
	}
	
	public static class Pet {

		public Pet(String name, AnimalType animalType){
			this.animalType = animalType;
			this.name = name;
		}
		public AnimalType animalType;
		public String name;
			
	}
	
	public class AnimalShelter {

		public LinkedList<Pet> queue;
		
		public AnimalShelter() {
			queue = new LinkedList<Pet>();
		}
		
		public void enqueue(Pet pet){
			queue.add(pet);
		}
		
		public Pet dequeue(){
			return queue.getFirst();
		}
		
		public Pet dequeueDog(){
			return null;
			
		}
		
		public Pet dequeueCat(){
			return null;
			
		}
	}
}
