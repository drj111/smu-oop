import java.util.Scanner;

public class Homework3 {
    void main() {
        Scanner sc = new Scanner(System.in);

        //입력받을 양 정수 입력, 그 크기의 배열 생성
        System.out.print("몇 개의 정수를 입력할 예정인가요?: ");
        int size = sc.nextInt();
        int arr[] = new int[size];


        //배열의 인덱스 0부터 끝까지 각 요소에 값 넣기 반복
        int index = 0;
        for (int num : arr) {
            System.out.print("수를 입력하세요: ");
            arr[index] = sc.nextInt();
            index++;
        }

        //배열의 인덱스 0을 임시로 저장한 후, 배열의 모든 요소와 비교하며 더 큰값을 저장 후 출력
        int max = arr[0];
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("최댓값: "+max);

        //배열의 인덱스 0을 임시로 저장한 후, 배열의 모든 요소와 비교하며 더 작은값을 저장 후 출력
        int min = arr[0];
        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }
        System.out.println("최소값: "+min);
    }
}
