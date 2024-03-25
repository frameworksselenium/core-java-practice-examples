public class CountsWords {

    public static void main(String[] args){

        String str = "Hello Krishna Reddy";

        //logic1
        String splitStr[] = str.split(" ");
        int noOfWords = splitStr.length;
        System.out.println("Logic1-No Of Words :" + noOfWords);

        //Logic2
        int counte=1;
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')){
                counte++;
            }
        }
        System.out.println("Logic2-No Of Words :" + counte);

    }
}
