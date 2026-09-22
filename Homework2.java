import java.util.Scanner;

class Homework2 {
    void main() {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("1번째 학생: %d %s %s %s\n", st1.getStudentNumber(), st1.getName(), st1.getMajor(), st1.getPhone());
        System.out.printf("2번째 학생: %d %s %s %s\n", st2.getStudentNumber(), st2.getName(), st2.getMajor(), st2.getPhone());
        System.out.printf("3번째 학생: %d %s %s %s\n", st3.getStudentNumber(), st3.getName(), st3.getMajor(), st3.getPhone());
    }
}


class Student {
    int studentNumber;
    String name;
    String major;
    long phone;

    Scanner sc = new Scanner(System.in);

    void setStudentNumber() {studentNumber = sc.nextInt();}
    void setName() {name = sc.next();}
    void setMajor() {major = sc.next();}
    void setPhone() {phone = sc.nextLong();}

    int getStudentNumber() {return studentNumber;}
    String getName() {return name;}
    String getMajor() {return major;}
    String getPhone() {
        String strPhone;
        strPhone = "0"+Long.toString(phone);
        strPhone = strPhone.substring(0,3)+"-"+strPhone.substring(3,7)+"-"+strPhone.substring(7,11);
        return strPhone;
    }

    Student() {
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        setStudentNumber();
        setName();
        setMajor();
        setPhone();
    }
}