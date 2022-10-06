package task1;

public class Document {
    private String string;
    private char[] document;

    public Document(String string) {
        this.string = string;
    }

    public static void contains(String string) throws ExceptionContains {
        if (string.toLowerCase().contains("abc")) {
            System.out.println("Строка "+string+" содержит последовательность abc");
        } else {
            throw new ExceptionContains("Строка содержит последовательность abc");
        }
    }

    public static void startsWith(String string)throws EceptionContainsStart {
        if (string.startsWith("5555")){
            System.out.println("Строка "+string+" начинается с  последовательности 5555");
        }else {
            throw new EceptionContainsStart("Нет совпадений");
        }
    }

    public static void endsWith(String string) throws ExceptionContainsEnds{
       if (string.endsWith("1a2b")){
           System.out.println(("Строка "+string+" кончается на последовательность 1a2b"));
        }else {
           throw new ExceptionContainsEnds("Нет совпадений");
       }
    }


}
