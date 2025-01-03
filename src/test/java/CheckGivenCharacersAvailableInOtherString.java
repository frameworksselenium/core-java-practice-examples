public class CheckGivenCharacersAvailableInOtherString {

    public static void main(String[] args){

        //given 2 strings, check whether all characters of one string are available in other string

        //Approach 1
        String str = "Krishna";
        String rts = "nhsirK";
        boolean status = true;
        if(str.length() == rts.length()) {
            for (int i = 0; i <= str.length()-1; i++) {
                String s = Character.toString(str.charAt(i));
                if(!rts.contains(s)){
                    status = false;
                    break;
                }
            }
            if(status){
                System.out.println("Both string characters are matching");
            }else{
                System.out.println("Both string characters are not matching");
            }
        }else{
            System.out.println("Both string lengths are not matching");
        }

        //solution 2
        String str1 = "Krishna";
        String rts1 = "nhsirK";
        boolean status1 = true;
        for (char c: str1.toCharArray())  {
            if(!rts1.contains(Character.toString(c))){
                status1 = false;
            }
        }
        if(status1){
            System.out.println("Both string characters are matching");
        }else{
            System.out.println("Both string characters are not matching");
        }


        //given 2 strings, check whether all characters of one string are available in other string with position
        //solution 1
        String str2 = "Krishna";
        String rts2 = "Krishns";
        boolean status2 = true;
        for (int i = 0; i < str2.length(); i++) {
            if (rts2.charAt(i) != str2.charAt(i)) {
                status2 = false;
                break;
            }
        }
        if(status2){
            System.out.println("Both string characters are matching");
        }else{
            System.out.println("Both string characters are not matching");
        }
    }

}