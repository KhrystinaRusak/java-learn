package hometask11;

//Задача 1:
//        Пользователь вводит с клавиатуры строку.
//        Вывести из строки все аббревиатуры.
//        Аббревиатурой будем считать слово от 2 до 6 символов,
//        состоящее только из прописных букв, без чисел.
/*public class mailValidator {

    public static Matcher isValidEmail(String str) {
        String emailRegexExpression = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+.\\.)+[a-z" + "A-Z]{2,7}$";//"^\\d{10}$"+"^(\\+\\d{1,2}( )?)?((\\(\\d{1,7})";

        Pattern patternEmail = Pattern.compile(emailRegexExpression);
        if (patternEmail == null)
            return false;
        return patternEmail.matcher(str);
    }

    public static void main(String[] args) {
        System.out.println("Input the string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//
////        Задача 2* (рекомендуемое всем):
////        Программа на вход получает произвольный текст.
////        В этом тексте может быть
////                - номер документа(один или несколько) в формате: xxxx-xxxx-xx, где x - это любая цифра;
////        - номер телефона в формате: +(xx)xxxxxxx
////                - емейл.
////                Строка может содержать не всю информацию, т.е. например, может не содержать номер телефона или другое.
////        Необходимо найти эту информацию и вывести в консоль в формате:
////        email: teachmeskills@gmail.com
////        document number: 1423-1512-51
////        telephone number: +(29)1232546
//
        String documentNumberRegexExpression = "^\\d{4}[- ]?\\d{4}[- .]?\\d{2}$";
        String telephoneNumberRegexExpression = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$)";

        //System.out.println(matcherEmail.find());
        // System.out.println("Email is " + patternEmail.matcher(emailRegexExpression).matches());

        Pattern patternDocumentNumber = Pattern.compile(documentNumberRegexExpression);
        Matcher matcherDocumentNumber = patternDocumentNumber.matcher(str);

        System.out.println(matcherDocumentNumber.find());
        System.out.println("DocumentNumber is " + patternDocumentNumber.matcher(documentNumberRegexExpression).matches());

        Pattern patternTelephoneNumber = Pattern.compile(telephoneNumberRegexExpression);
        Matcher matcherTelephoneNumber = patternTelephoneNumber.matcher(str);

        System.out.println(matcherTelephoneNumber.find());
        System.out.println("TelephoneNumber " + patternTelephoneNumber.matcher(telephoneNumberRegexExpression).matches());
    }
}
*/