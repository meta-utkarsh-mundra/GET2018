package system;

import java.util.ArrayList;
import java.util.List;

/**
 * The Cage class will add the cage to the Zoo
 * Here many getter setter are present to initializes the Cage properties
 *
 */
public class Cage {

	private AnimalType animalType;
	private int capacity;
	List<Animal> listOfAnimals = new ArrayList<>();
			
	public Cage(AnimalType animalType, int capacity) {
		this.animalType = animalType;
		this.capacity = capacity;
	}
	
	public AnimalType getAnimalType() {
		return animalType;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Animal> getListOfAnimals() {
		return listOfAnimals;
	}

	public void getInfo() {
		
		for(Animal animal: listOfAnimals)
		{
			System.out.println(animal.getName());
		}
	}
	
	public void addAnimal(Animal animal) {
			listOfAnimals.add(animal);
	}
	
	public boolean removeAnimal() {
		
		boolean removed = false;
		
		if(listOfAnimals.size() > 0)
		{
			listOfAnimals.remove(0);
			removed = true;
		}
		
		return removed;
	}
	
	public int spareCapacity() {
		return capacity - listOfAnimals.size();
	}
}
