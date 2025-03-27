package ex12inheritance; 


public class Animal {
	 
	//멤버변수
	private String species; //종
//	private String species; 
	public int age; //나이
	public String gender; //성별
	
	
	//생성자 
	public Animal(String species, int age, 
			String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	
	//현재상태 
	public void showAnimal() {
		System.out.println("동물의 종류는:"+ species);
		System.out.println("나이는:"+ age);
		System.out.println("성별은:"+ gender);
		
	}

	
	/*
		getter메서드 
			: private으로 선언된 멤버변수를 클래스 외부로 반환할때 
			사용하는 메서드
	 */	
	public String getSpecies() {
		return species;
	}	
}		

//public class Animal {
//	public String Species;
//	public String Age;
//	public String Gender;
//
//
//	String showAnimal() {
//	System.out.println("동물의 종류:" ,"포유류" ,"어류" ,"조류");
//	System.out.println("동물의 나이:");
//	System.out.println("동물의 성별:"); }
//	
//	
//	public Animal(String Species, String Age, String Gender) {
//		this.Species = Species;
//		this.Age = Age;
//		this.Gender = Gender;
//	}

	

	
	

