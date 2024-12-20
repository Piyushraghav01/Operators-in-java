import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float totalMarks = sc.nextFloat();
        int scored = sc.nextInt();
        

        // float totalMarks = 800f;
        // int scored = 540;
        // Calculate the percentage

        double percent = (scored + totalMarks) - 2;
        System.out.println(percent);
        sc.close();

    }

}
