package Lesson3.Task29;

class Digits {
    private final int number;
    public Digits(int number) {
        this.number = number;
    }

    void countDigits() {
        int test = number;
        int counter=1;
        while (test/10 != 0) {
            counter++;
            test = test/10;
        }
        System.out.printf("Digit count in number %d is: %d", number, counter);
    }
}
