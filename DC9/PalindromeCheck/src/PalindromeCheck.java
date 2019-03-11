public class PalindromeCheck {
    public static void main(String[] args){
        System.out.println(palindromeInt(11));
        System.out.println(palindromeInt(1125211));
        System.out.println(palindromeInt(11225211));
        System.out.println(palindromeString("Abba"));
        System.out.println(palindromeString("Agnes i senga"));
        System.out.println(palindromeString("Suppe"));
    }

    public static String palindromeInt(int original){
        int savedOriginal = original;
        int reverseNumber = 0;
        while (original > 0){
            int lastNumber = original % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            original /= 10;
        }
        if (reverseNumber == savedOriginal){
            return "It's a palindrome number";
        } else {
            return "It's not a palindrome number";
        }
    }

    public static String palindromeString(String original){
        String savedOriginal = original;
        String reverseString = "";
        for (int i = original.length()-1; i >= 0; i--){
            reverseString += original.substring(i,i+1);
        }

        if (reverseString.toLowerCase().equals(savedOriginal.toLowerCase())){
            return "It's a palindrome";
        } else {
            return "It's not a palindrome";
        }
    }
}
