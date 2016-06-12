package crazyjava;

public class EnumTest {

	public void judge(SeasonEnum seasonEnum) {
		switch (seasonEnum) {
		case SPRING:
			System.out.println("´ºÅ¯»¨¿ª");
			break;
		case SUMMER:
			System.out.println("ÏÄÈÕÑ×Ñ×");
			break;
		case FALL:
			System.out.println("ÇïÒâÅ¨Å¨");
			break;
		case WINTER:
			System.out.println("hahahaha");
			break;
		}
	}
	public static void main(String[] args) {
		for (SeasonEnum seasonEnum : SeasonEnum.values()) {
			System.out.println(seasonEnum +"Î»ÖÃ:"+seasonEnum.ordinal());
		}
		new EnumTest().judge(SeasonEnum.SPRING);
		SeasonEnum fall =  Enum.valueOf(SeasonEnum.class, "FALL");
		fall.setName("Çï");
		System.out.println(fall.name()+":"+fall.getName());
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
