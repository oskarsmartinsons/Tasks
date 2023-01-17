package Lesson2.Task20;

public class Palindrom {
    String myString="";
    String reverseString="";

    public boolean isPalindrome () {
        for (int i = 0; i < myString.length(); i++) {
            reverseString = myString.charAt(i)+reverseString;
        }
        return myString.equals(reverseString);
    }
}
