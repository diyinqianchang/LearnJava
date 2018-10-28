package code6;


public enum Gender implements GenderDesc {

	MALE("男"){
		@Override
		public void info() {
			// TODO Auto-generated method stub
			System.out.println("男性");
		}
	},
	FEMALE("女"){
		@Override
		public void info() {
			// TODO Auto-generated method stub
		     System.out.println("女性");	
		}
	};
	private final String name;
	private Gender(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
