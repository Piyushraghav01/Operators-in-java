class Concate {
    public static void main(String[] args) {
        String firstName = "Mary";
        String lastName = "Alice";
        int age = 20;

        char ch = 'a';
        //char ch2 = 'b';

        char ch2 = (char)(ch+1);

        System.out.println(ch2);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName + " is " + age + " years old.");

    }

}
