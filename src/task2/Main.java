package task2;

public class Main {
    public static void main(String[] args) {
        try {
            TestClass.methodTest("NAGIBATOR2006VIP","PASSWORD1234","PASSWORD1234");
        } catch (WrongLoginException|WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
