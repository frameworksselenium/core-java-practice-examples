public class FindVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "This is a test string";

        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); ++i)
        {

            char ch = str.charAt(i);

            // Check if the character is a vowel
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            // Check if the character is a consonant
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
