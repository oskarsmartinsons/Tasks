package Lesson2.Task8;

class Complex {
    private final int realPart, imgPart;
    public Complex(int realPart, int imgPart) {
        this.realPart = realPart;
        this.imgPart = imgPart;
    }
    public int getRealPart() {return realPart;}
    public int getImgPart() {return imgPart;}

    // sum complex numbers
    static Complex sumComplex(Complex complexNumber1, Complex complexNumber2) {
        int realNumber = complexNumber1.getRealPart()+complexNumber2.getRealPart();
        int realImaginary=complexNumber1.getImgPart()+complexNumber2.getImgPart();
        return new Complex(realNumber,realImaginary);
    }
    static Complex differenceComplex(Complex complexNumber1, Complex complexNumber2) {
        int realNumber = complexNumber1.getRealPart()-complexNumber2.getRealPart();
        int realImaginary=complexNumber1.getImgPart()-complexNumber2.getImgPart();
        return new Complex(realNumber,realImaginary);
    }
    static Complex productComplex(Complex complexNumber1, Complex complexNumber2) {
        int realNumber = (complexNumber1.getRealPart()*complexNumber2.getRealPart()-complexNumber1.getImgPart()*complexNumber2.getImgPart());
        int realImaginary=(complexNumber1.getRealPart()*complexNumber2.getImgPart()+complexNumber1.getImgPart()*complexNumber2.getRealPart());
        return new Complex(realNumber,realImaginary);
    }
    void printOutSum(){
        System.out.printf("Sum of two Complex numbers: %d%+di %n", realPart, imgPart);
    }
    void printOutDifference(){
        System.out.printf("Difference of two Complex numbers: %d%+di %n", realPart, imgPart);
    }
    void printOutProduct(){
        System.out.printf("Product of two Complex numbers: %d%+di %n", realPart, imgPart);
    }
}
