package secondtask;

public class Main {
    public static void main(String[] args) {
        //        Delete Character
        System.out.println(SecondTask.remove("P", "PHP Exercises and", "python Exercises"));

//        Computer class
        Computer computerDell = new Computer("Dell", 75);
        Computer computerLenovo = new Computer("Lenovo", 75);
        System.out.println(computerDell.brand);
        System.out.println(computerLenovo.brand);

//        SomethingIsWrongTask class
        SomethingIsWrong.mainMethod();

//        NumberHolder
        NumberHolder firstHolder = new NumberHolder(5, 3.5f); //
        firstHolder.displayAttributes();
    }
}


class SecondTask {
    public static String remove (String chr, String... strgs) {
        String concatenated_string = ""; // "PHP Exercises and python Exercises"
        String regex = String.format("(?i)%s", chr); //(?i)p
        // P, p
        for (String str : strgs) {
            concatenated_string = concatenated_string.concat(str + " ");
        }

        return concatenated_string.replaceAll(regex, "");
    }
}

class Computer {

    String brand;
    int screenSize;
    int numberOfCores;
    String type;

    public Computer(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    private void changeNumberOfCores(int num) {
        this.numberOfCores = num;
    }

    private void changeType(String type) {
        this.type = type;
    }
}

class SomethingIsWrong {
    public static void mainMethod() {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area()); // 40, 50
    }
}

class Rectangle {
    int width = 1;
    int height = 1;

    public int area() {
        return this.height * this.width;
    }
}

class NumberHolder {
    public int anInt;
    public float aFloat;

    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    public void displayAttributes() {
        System.out.printf("anInt=%d\n", this.anInt);
        System.out.printf("aFloat=%f\n", this.aFloat);
    }
}
