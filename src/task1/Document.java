package task1;

public class Document {
   private String string;
   private char[]document;

    public Document(String string) {
        this.string = string;
    }


   public static void listLetters(String string) {
        char[] positions = string.toCharArray();
        for (int i = 0; i < positions.length; i++) {
            System.out.println(i + " позиция" + "\t || " + positions[i]);
        }
        System.out.println(string.substring(0, 4) + " " + string.substring(7, 11));//1
    }

    public static void documentReplace(String string) {
        String result = string.replaceAll("aaa", "***");//2
        System.out.println(result.replaceAll("bbb", "***"));
    }


    public static void documentReplaceWithInsert(String string) {
        StringBuffer result = new StringBuffer(string.replaceAll("\\d", ""));//3
        System.out.println(result.insert(3, "/").insert(7, "/").insert(9, "/"));
    }



    public static void documentReplaceWithInsertToUpperCase(String string) {
        StringBuilder result = new StringBuilder(string.replaceAll("\\d", ""));//4
        System.out.println(result.insert(0, "Letters: ").insert(12, "/").insert(16, "/").insert(18, "/"));
        System.out.println(result.toString().toUpperCase());
    }


    public static void contains(String string) {
        if (string.contains("abc")) {                                 //5
            System.out.println("Строка содержит последовательность");
        } else {
            System.out.println("Строка не содержит последовательность");
        }
    }

    public static void startsWith(String string) {
        System.out.println(string.startsWith("5555")); //6
    }

    public static void endsWith(String string){
        System.out.println(string.endsWith("1a2b"));//7
    }






}
