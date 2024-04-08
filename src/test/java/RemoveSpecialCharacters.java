import java.util.StringTokenizer;

public class RemoveSpecialCharacters {

    public static void main(String[] args){

        //removing the special characters
        String str = "kjahksa ihiuhdfc asssa &&&";
        String afterStr = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(afterStr);


        //removing the white spaces
        String str1 = "Krishna ihiuhdfc asssa";
        String afterStr1 = str1.replaceAll("\\s", "");
        System.out.println(afterStr1);

        //write a code to remove octa decimals characters from the string
        String str3 = "Krishna ihiuhdfc asssa 01234";
        String afterStr3 = str3.replaceAll("0[0-7]+", "");
        System.out.println(afterStr3);


        //write a code to remove hexa decimals characters from the string
        String str2 = "Krishna ihiuhdfc asssa 0x1234";
        String afterStr2 = str2.replaceAll("0[xX][0-9a-fA-F]+", "");
        System.out.println(afterStr2);


        String str11 = "Krishna ihiuhdfc asssa 0x1234";
        StringTokenizer st = new StringTokenizer(str11);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (!token.matches("0[xX][0-9a-fA-F]+")) {
                sb.append(token).append(" ");
            }
        }

        String afterStr11 = sb.toString().trim();
        System.out.println(afterStr11);

    }
}
