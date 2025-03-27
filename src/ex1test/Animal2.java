package ex1test;


public class Animal2 {

	private String species;
	private int age;
	private String gender;

	public void Animal(String species, 
			int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	public void showAnimal() {
		System.out.println("동물의 종류:"+ species);
		System.out.println("나이:"+ age);
		System.out.println("성별:"+ gender);
	}
}
