package Practice;

import java.util.Scanner;

class Practice05 {
    void main() {
        Scanner sc = new Scanner(System.in);

        double fah = sc.nextDouble();
        double cel = 5.0/9.0 * (fah-32);

        System.out.println(cel);
    }
}