import java.util.Scanner;

class StudentGrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int subNum, i;
        float totalMarks = 0, marks;
        System.out.println("enter the number of subjects");
        subNum = sc.nextInt();
        System.out.println("enter the marks of each subject(out of 100)");
        for (i = 1; i <= subNum; i++) {
            System.out.println("enter the marks in subject " + i + " (out of 100)");
            marks = sc.nextFloat();
            if (marks > 100) {
                System.out.println("enter marks out of 100");
            }
            totalMarks += marks;
        }
        float average = totalMarks / subNum;
        System.out.println("TOTAL MARKS: " + totalMarks);
        System.out.println("AVERAGE: " + average);
        ;
        if (average <= 100 && average >= 90) {
            System.out.println("GRADE: A+");
        } else if (average < 90 && average > 75) {
            System.out.println("GRADE: A");
        } else if (average < 75 && average >= 65) {
            System.out.println("GRADE: B");
        } else if (average < 65 && average >= 50) {
            System.out.println("GRADE: C");

        } else if (average < 50 && average >= 40) {
            System.out.println("GRADE: D");
        } else {
            System.out.println("GRADE: F");
        }

    }
}