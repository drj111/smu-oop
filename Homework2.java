import java.util.Scanner;

class Student {
    int studentID;
    String name;
    String major;
    String phone;

    int getStudentID() {return studentID;}
    String getName() {return name;}
    String getMajor() {return major;}
    String getPhone() {return phone;}

    void setStudentID(int studentID) {this.studentID = studentID;}
    void setName(String name) {this.name = name;}
    void setMajor(String major) {this.major = major;}
    void setPhone(int phone) {
        String strPhone = Integer.toString(phone);
        this.phone = "0" + strPhone.substring(0, 2) + "-" + strPhone.substring(2, 6) + "-" + strPhone.substring(6, 10);
    }
}


class Homework2 {
    Scanner sc = new Scanner(System.in);

    Student st1 = new Student();
    Student st2 = new Student();
    Student st3 = new Student();
    Student[] sArr = {st1, st2, st3};

    void main() {
        for (int i=0; i<=2; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            sArr[i].setStudentID(sc.nextInt());
            sArr[i].setName(sc.next());
            sArr[i].setMajor(sc.next());
            sArr[i].setPhone(sc.nextInt());
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i=0; i<=2; i++) {
            System.out.printf("%d번째 학생: %d %s %s %s\n", i+1, sArr[i].getStudentID(), sArr[i].getName(), sArr[i].getMajor(), sArr[i].getPhone());
        }
    }
}