package task4;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Нехороший человек сломал шалаш,убил индейца");
        task.checkPalindrom(4);

    }
}
class Task {
    private String text;

    public Task(String text) {
        this.text = text;
    }

   /* public String[] initSentence(){
        String[]strings = text.split(",| ");
        for (int i=0;i< strings.length;i++){
            System.out.println(strings[i]);
        }
        return strings;
    }*/

    public void checkPalindrom(int a) {
        String[] strings = text.split(",| ");
        for (int i = 0; i < strings.length; i++) {
            StringBuffer word = new StringBuffer(strings[a]);

            if (a <= strings.length || a > 0) {
                if (strings[a - 1].equals(word.reverse())) {
                    System.out.println("Слово - " + strings[a - 1] + "| является полиндромом");
                    break;
                } else {
                    System.out.println("Слово - " + strings[a - 1] + "| не является полиндромом");
                    break;
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return text.equals(task.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return text + "" ;
    }
}
