package crazyjava;

public class ConstructorOverloas {

	public String name;
	public int count;
	
	public ConstructorOverloas() {
	}

	public ConstructorOverloas(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public static void main(String[] args) {
		ConstructorOverloas cOverloas1 = new ConstructorOverloas();
		ConstructorOverloas cOverloas2 = new ConstructorOverloas("Java", 3000);
		System.out.println(cOverloas1.name +" "+ cOverloas1.count);
		System.out.println(cOverloas2.name +" "+ cOverloas2.count);
	}

}
