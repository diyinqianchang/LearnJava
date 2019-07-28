package code7;



public class StringLearn {

    public static void main(String[] args){

        String s1 = new String("abcdefg");

        System.out.println(s1);
        
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("java");
        sBuilder.insert(0, "Hello ");
        System.out.println(sBuilder);
        sBuilder.replace(5, 6, ",");
        System.out.println(sBuilder);
        System.out.println(sBuilder.reverse());
        

    }


}
