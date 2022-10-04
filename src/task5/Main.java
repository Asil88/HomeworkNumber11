package task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Индеец");
        task.duplicated();

    }
}

class Task {
    private String text;

    public Task(String text) {
        this.text = text;
    }

    public void duplicated() {
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            StringBuffer l = new StringBuffer(letters[i]);
            System.out.print(letters[i]);
            System.out.print(letters[i]);
        }
    }


}

