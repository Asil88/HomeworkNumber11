package task2;

public class TestClass {
    String Login;
    String Password;
    String confirmPassword;


    static void methodTest(String Login, String Password, String confirmPassword) throws WrongLoginException,WrongPasswordException {
        if (Login.length() < 20 && !Login.contains(" ")) {
            System.out.println("true");
        } else {
            throw new WrongLoginException("Ошибка ввода логина");
        }


        if (Password.equals(confirmPassword)) {
            if (Password.length() < 20 && !Password.contains(" ") && Password.contains("\\d")) {
                System.out.println("true");
            }
        } else {
            throw new WrongPasswordException("Ошибка ввода пароля");
        }

    }
}
