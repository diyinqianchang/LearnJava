package crazyjava;

public class EnumTest {

	public void judge(SeasonEnum seasonEnum) {
		switch (seasonEnum) {
		case SPRING:
			System.out.println("��ů����");
			break;
		case SUMMER:
			System.out.println("��������");
			break;
		case FALL:
			System.out.println("����ŨŨ");
			break;
		case WINTER:
			System.out.println("hahahaha");
			break;
		}
	}
	public static void main(String[] args) {
		for (SeasonEnum seasonEnum : SeasonEnum.values()) {
			System.out.println(seasonEnum +"λ��:"+seasonEnum.ordinal());
		}
		new EnumTest().judge(SeasonEnum.SPRING);
		SeasonEnum fall =  Enum.valueOf(SeasonEnum.class, "FALL");
		fall.setName("��");
		System.out.println(fall.name()+":"+fall.getName());
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
