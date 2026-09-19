package Practice;

import java.util.Scanner;

class Practice02 {
    void main() {
        ReadLine rl = new ReadLine();
        rl.readLineOutput();
    }
}

class ReadLine {
    void readLineOutput() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }
}