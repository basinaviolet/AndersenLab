public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];

        staff[0] = new Employee("Steve Jobs", "SEO", "stevej@apple.com", "11111111111", 1000000, 56);
        staff[1] = new Employee("Bill Gates", "SEO", "billyj@windows.com", "22222222222", 999999, 68);
        staff[2] = new Employee("Mark Zuckerberg", "Internet entrepreneur", "mark@fb.com", "12312312345", 500000, 39);
        staff[3] = new Employee("Hedy Lamarr", "Inventor", "hedy@google.com", "99222111111", 1000, 35);
        staff[4] = new Employee("Marie Curie", "physicist and chemist", "radiy@google.com", "88999777777", 10000, 60);

        for (Employee employeeItem : staff) {
            if (employeeItem.getAge() > 39) employeeItem.prnEmployeeInformation();
        }
    }
}
