import java.util.Scanner;

class Subway {
    int line;
    Subway(int num) {   //생성자 커스텀
        line = num;
    }
    void run() {
        System.out.println("Line " + line + " runs");
    }
}

class practice03 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();      //몇 호선인지 지정

        Subway sw = new Subway(select); //지정한 노선번호를 속성으로 삼는 클래스
        sw.run();                       //그 속성으로 함수 실행
    }
}