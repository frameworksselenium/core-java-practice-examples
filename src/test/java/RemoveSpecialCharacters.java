public class RemoveSpecialCharacters {

    public static void main(String[] args){

        String str = "kjahksa ihiuhdfc asssa &&&";
        String afterStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(afterStr);

        //removing the white spaces
        String str1 = "Krishna ihiuhdfc asssa";
        String afterStr1 = str1.replaceAll("\\s", "");
        System.out.println(afterStr1);
    }
}
