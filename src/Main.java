public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    public static void exercise1() {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName);
        // Задание 2
        String fullNameUpCase = fullName.toUpperCase();
        System.out.println(fullNameUpCase);
    }
    public static void exercise2 () {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println(fullName);
    }
}