package task1;

import task1.Document;

public class Main {
    public static void main(String[] args) {

        Document.listLetters("9999aaa8888bbb2i2i");
        Document.documentReplace("9999aaa8888bbb2i2i");
        Document.documentReplaceWithInsert("9999aaa8888bbb2i2i");
        Document.documentReplaceWithInsertToUpperCase("9999aaa8888bbb2i2i");
        Document.contains("9999aaa8888bbb2i2i");
        Document.startsWith("9999aaa8888bbb2i2i");
        Document.endsWith("9999aaa8888bbb2i2i");

        /*String document = new String("9999aaa8888bbb2i2i");

        char[] positions = document.toCharArray();
        for (int i = 0; i < positions.length; i++) {
            System.out.println(i+" позиция"+"\t || "+positions[i]);
        }
        System.out.println(document.substring(0,4)+" "+document.substring(6,11));//1

        String documentreplace=document.replaceAll("aaa","***");//2
        System.out.println(documentreplace.replaceAll("bbb","***"));

        StringBuffer documentreplace2=new StringBuffer(document.replaceAll("\\d",""));//3
        System.out.println(documentreplace2.insert(3,"/").insert(7,"/").insert(9,"/"));

        StringBuilder documentreplace3=new StringBuilder(document.replaceAll("\\d",""));//4
        System.out.println(documentreplace3.insert(0,"Letters: ").insert(12,"/").insert(16,"/").insert(18,"/"));
        System.out.println(documentreplace3.toString().toUpperCase());


       if (document.contains("abc")){                                 //5
           System.out.println("Строка содержит последовательность");
       }else {
           System.out.println("Строка не содержит последовательность");
       }


        System.out.println(document.startsWith("5555")); //6


        System.out.println(document.endsWith("1a2b"));//7*/
    }
}