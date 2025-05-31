public class StringTest {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("First ");
        sb.append(45);
        sb.append(" ,now this is the ");
        sb.append(76.87);
        sb.toString();
        System.out.println(sb.toString());
    }
}
