/*

The ambiguity in this situation arises due to the method overloading in Java. Method overloading is a feature in Java where two or more methods can have the same name but different parameters.  In your code, you have two overloaded sum methods:
void sum(int a,long b)
void sum(long a,int b)
When you call obj.sum(20,20), Java gets confused about which method to call because both methods are equally good matches for these arguments. Both 20 values are int, but they can be automatically promoted to long as well. So, both sum(int a,long b) and sum(long a,int b) are valid calls, and Java can't decide which one to execute. This situation is known as method call ambiguity, and it's a compile-time error in Java.
*/

class MethodAmbiguityExamples {

    void sum(int a,long b){System.out.println("a method invoked which is having int and long");}

    void sum(long a,int b){System.out.println("b method invoked which is having long and int");}

    public static void main(String args[]){
        MethodAmbiguityExamples obj=new MethodAmbiguityExamples();
        obj.sum(20,(long)20);//no ambiguity
        //obj.sum(20,20);// ambiguity - compile time error
    }

}