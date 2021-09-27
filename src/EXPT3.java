//RIDDHI KUMBHANI SE4 25
class ComplexNumbers {
    float realpart, imagpart;

    ComplexNumbers() {
        realpart = 0;
        imagpart = 0;
    }

    ComplexNumbers(float n) {
        realpart = imagpart = n;
    }

    ComplexNumbers(float realpart, float imagpart) {
        this.realpart = realpart;
        this.imagpart = imagpart;
    }

    void display() {
        System.out.println(realpart + " + " + imagpart + "i");
    }

    void add(ComplexNumbers c1, ComplexNumbers c2) {

        realpart = c1.realpart + c2.realpart;
        imagpart = c1.imagpart + c2.imagpart;
        display();
    }
}

public class EXPT3 {
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers();
        ComplexNumbers c2 = new ComplexNumbers(2);
        ComplexNumbers c3 = new ComplexNumbers(20, 5);
        c1.display();
        c2.display();
        c3.display();
        c3.add(c1, c2);//displays c3 as c1+c2
        c1.add(c1, c2);//displays c1 as c1+c2
    }
}

