public class Practice06_07 {
    void main() {
        double[] arr1 = {1.1, 2.3, 4.7, 7.5};

        double[] arr2 = new double[4];
        arr2[0] = 1.1;
        arr2[1] = 2.3;
        arr2[2] = 4.7;
        arr2[3] = 7.5;

        System.out.printf("첫번째 배열 크기는 %d, 배열 요소는 %.1f, %.1f, %.1f, %.1f\n", arr1.length, arr1[0], arr1[1], arr1[2], arr1[3]);
        System.out.printf("두번째 배열 크기는 %d, 배열 요소는 %.1f, %.1f, %.1f, %.1f\n", arr2.length, arr2[0], arr2[1], arr2[2], arr2[3]);
    }
}
