package crazyjava;




//���е�ö���˶��̳�java.lang.Enum��

public enum SeasonEnum{

	SPRING,SUMMER,FALL,WINTER;
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		switch (this) {
		case SPRING:
			if (name.equals("��")) {
				this.name = name;
			}
			break;
		case SUMMER:
			if (name.equals("��")) {
				this.name = name;
			}
			break;
		case FALL:
			if (name.equals("��")) {
				this.name = name;
			}
			break;
		case WINTER:
			if (name.equals("��")) {
				this.name = name;
			}
			break;
		}
		
	}
	
}
