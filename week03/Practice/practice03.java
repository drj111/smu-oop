import java.util.Scanner;

class practice03 {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SubWay.line = sc.nextInt();
        SubWay.run();
    }
}

class SubWay {
    static int line;
    static void run() {
        System.out.println("Line " + line + " runs");
    }
}


//먼가 부족함



