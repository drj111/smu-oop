import java.util.Scanner;

public class Homework4 {
    Scanner sc = new Scanner(System.in);
    // 큰 수를 작은 수로 나누었을 때,
    // '큰 수와 작은 수'의 공약수는 '작은 수와 그 나머지' 공약수와 동일합니다.
    // 때문에 두 쌍의 최대 공약수는 같습니다.
    // 작은 수를 그 나머지로 나누었을 때도 동일합니다.
    // 이렇게 작은 수를 그 나머지로 나누는 나눗셈을 반복했을 때,
    // 나머지가 0이 되는 순간의 작은 수가 최대공약수입니다.



    //재귀 호출을 통한 구현
    int gcd(int num1, int num2) {

        //절댓값 적용
        if (num1<0) num1 = -num1;
        if (num2<0) num2 = -num2;

        //한쪽이 0일 시, 0이 아닌 쪽 리턴
        if (num1==0) return num2;
        if (num2==0) return num1;

        //양쪽이 같을 시, 같은 수 리턴
        if (num1==num2) return num1;

        //gcd(작은쪽, 나머지) 재귀호출
        if (num1>num2) {
            return gcd(num2, num1%num2);
        } else {
            return gcd(num1, num2%num1);
        }
    }



    //반복문을 통한 구현
    int gcdLoop(int num1, int num2) {
        if (num1<0) num1 = -num1;
        if (num2<0) num2 = -num2;
        if (num1==0) return num2;
        if (num2==0) return num1;
        if (num1==num2) return num1;

        // 나뉨 당하는 수, 나누는 수 설정
        int dividend;
        int divisor;
        if (num1>num2) {
            dividend = num1;
            divisor = num2;
        } else {
            dividend = num2;
            divisor = num1;
        }

        // 나누는 수가 0이 되었을 때 나뉨 당하는 수가 최대공약수.
        while (divisor != 0) {
            int temp = dividend % divisor;
            dividend = divisor;
            divisor = temp;
        }
        return dividend;
    }



    void main() {

        //재귀 호출 사용
        System.out.print("두 수를 입력하세요: ");
        System.out.printf("두 수의 최대공약수는 %d 입니다.\n", gcd(sc.nextInt(), sc.nextInt()));

//        //반복문 사용
//        System.out.print("두 수를 입력하세요: ");
//        System.out.printf("두 수의 최대공약수는 %d 입니다.\n", gcdLoop(sc.nextInt(), sc.nextInt()));
    }
}