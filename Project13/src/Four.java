public class Four {
    public static String convertToFormatted(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return "Некорректный номер";
        }

        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        if (digitsOnly.length() != 11) {
            return "Некорректная длина номера";
        }

        String countryCode;
        if (digitsOnly.charAt(0) == '8') {
            countryCode = "+7";
        } else if (phoneNumber.charAt(0) == '+') {
            countryCode = "+"+digitsOnly.charAt(0);
        } else {
            return "Некорректный код страны";
        }

        String formattedNumber = countryCode +"-"+ digitsOnly.substring(1, 4) + "-" +
                digitsOnly.substring(4, 7) + "-" +
                digitsOnly.substring(7);

        return formattedNumber;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        System.out.println(convertToFormatted(phoneNumber1));
        System.out.println(convertToFormatted(phoneNumber2));
        System.out.println(convertToFormatted(phoneNumber3));
    }
}
