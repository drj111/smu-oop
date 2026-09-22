class Practice04 {
    void main() {
        Coffee c1 = new Coffee("Kenya", "AA");
        c1.roast();
        c1.grind(1);
        c1.brew();

        Coffee c2 = new Coffee("Brazil");
        c2.roast();
        c2.grind(4);
        c2.brew();
    }
}

class Coffee {
    String origin;
    String grade;
    int degreeOfRoast;
    Coffee(String str) {
        origin = str;
        grade = "default";
    }
    Coffee(String str1, String str2) {
        origin = str1;
        grade = str2;
    }

    void roast() {
        System.out.printf("roasting... %s, %s grade.\n", origin, grade);
    }

    void grind(int num) {
        degreeOfRoast = num;
        System.out.printf("grinding... degree of roast is %d.\n", degreeOfRoast);
    }

    void brew() {
        System.out.print("brewing...\n");
    }
}