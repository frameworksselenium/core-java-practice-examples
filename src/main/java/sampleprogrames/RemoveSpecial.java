public class RemoveSpecial {


    public static void main(String[] args){
        String name = "Krishna & Reddy";
        //String str = name.replaceAll("[^a-zA-Z0-9]", "");
        String str = name.replaceAll("[&]", "");
        System.out.println(str);
    }
}
