package crazyjava;

/*
 * �ַ�������һ�������ַ����У�java�ṩ����String��StringBuffer������װ�ַ��������ṩ
 * ��һϵ�з����������ַ�������
 * String���ǲ��ɱ��ࡣ��һ��һ��String���󱻴����Ժ󣬰�������������е��ַ������ǲ��ɸı��
 * StringBuffer���������һ���ַ������пɱ���ַ�������һ��StringBuffer�������Ժ�
 * ͨ��StringBuffer�ṩ��append()��insert()��setChartAt()�ȷ������Ըı�����ַ���
 * 
 * */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch ={'I',' ','l','o','v','e',' ','y','o','u'};
		String string = new String(ch);
		System.out.println(string);
		System.out.println(string.charAt(5));
		System.out.println(string.lastIndexOf('o'));
		//�滻
		System.out.println(string.replace('o', 'i'));
		System.out.println(string.toUpperCase());
		
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("java");
		System.out.println(sBuffer);
		System.out.println(sBuffer.insert(0, "hello  "));
		System.out.println(sBuffer.replace(5, 6, ","));
		System.out.println(sBuffer.reverse());
		System.out.println(sBuffer.length());
		System.out.println(sBuffer.capacity());
	}

}
