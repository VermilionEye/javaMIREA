public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder();

        if (lastName != null) {
            fullNameBuilder.append(lastName);
            fullNameBuilder.append(" ");
        }

        if (firstName != null) {
            fullNameBuilder.append(firstName.charAt(0));
            fullNameBuilder.append(".");
        }

        if (middleName != null) {
            fullNameBuilder.append(middleName.charAt(0));
            fullNameBuilder.append(".");
        }

        return fullNameBuilder.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFullName()); // Выводит "Иванов И.И."

        Person person2 = new Person("Петров", "Петр", null);
        System.out.println(person2.getFullName()); // Выводит "Петров П."

        Person person3 = new Person("Сидоров", null, null);
        System.out.println(person3.getFullName()); // Выводит "Сидоров"
    }
}
