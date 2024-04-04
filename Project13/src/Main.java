public class Main {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        // 1. Распечатать последний символ строки
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 2. Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Заканчивается ли строка на '!!!': " + endsWithExclamation);

        // 3. Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Начинается ли строка с 'I like': " + startsWithILike);

        // 4. Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);

        // 5. Найти позицию подстроки "Java"
        int javaPosition = inputString.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + javaPosition);

        // 6. Заменить все символы 'а' на 'о'
        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены: " + replacedString);

        // 7. Преобразовать строку к верхнему регистру
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 8. Преобразовать строку к нижнему регистру
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 9. Вырезать подстроку "Java" с помощью метода String.substring()
        String substringJava = inputString.substring(7, 11);
        System.out.println("Вырезанная подстрока 'Java': " + substringJava);
    }
}
