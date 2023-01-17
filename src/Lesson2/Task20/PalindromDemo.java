package Lesson2.Task20;

public class PalindromDemo {
    public static void main(String[] args) {
        String test = "aca";
        Palindrom palindrom = new Palindrom();
        palindrom.myString = test;
        boolean result = palindrom.isPalindrome();

        System.out.printf("Is '%s' palindrom? : %s ", test, result);
    }

}
