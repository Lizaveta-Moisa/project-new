public class Main {
    public static void main(String[] args) {

        Hypot hypot = new Hypot();
        hypot.heigthMM = 3;
        hypot.radiusMM = 1;
        double volumeOfHypot = hypot.methodCalculate();
        System.out.println("Объём цилиндра: " + volumeOfHypot);

        Cube cube1 = new Cube();
        cube1.sideMM = 3;
        int volumeOfCube = cube1.calculateVolume();
        System.out.println("Объём куба: " + volumeOfCube);
    }
}
