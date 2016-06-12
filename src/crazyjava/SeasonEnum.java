package crazyjava;




//所有的枚举了都继承java.lang.Enum类

public enum SeasonEnum{

	SPRING,SUMMER,FALL,WINTER;
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		switch (this) {
		case SPRING:
			if (name.equals("春")) {
				this.name = name;
			}
			break;
		case SUMMER:
			if (name.equals("夏")) {
				this.name = name;
			}
			break;
		case FALL:
			if (name.equals("秋")) {
				this.name = name;
			}
			break;
		case WINTER:
			if (name.equals("冬")) {
				this.name = name;
			}
			break;
		}
		
	}
	
}
