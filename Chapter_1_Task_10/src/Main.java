public class Main {
    public static void main(String[] args) {
        double inch, metr;
        int counter = 0;
        int ft = 12;
        for (inch = 1; inch <= 12 * ft; inch++) {
            metr = inch / 39.37;
            System.out.println(inch + " дюмам соотвествует " + metr + " метров.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }

    }
}
