package task2;

public class Main {
    public static void main(String[] args) {
        Task task=new Task("Hey hello,why you read this text,mm?");
        task.split();
    }
}

class Task{
    String text;

    public Task(String text) {
        this.text = text;
    }

    public void split (){
       String[]words=text.split(",| ");
       int max=0;
       Integer min=Integer.MAX_VALUE;
       for (int i=1;i< words.length;i++){
           System.out.println(words[i]);
           if (words[i-1].length()>max){
              max=words[i-1].length();}
           if (words[i-1].length()<min){
               min=words[i-1].length();}
       }
        System.out.println("Максимальная длина слова: "+max+"\n"+"Минимальная длина слова: "+min);

        for (int i=0;i< words.length;i++) {
            if (words[i].length() == max) {
                System.out.println("Самое длинное слово: " + words[i]);
            }
        }
        for (int i=0;i< words.length;i++) {
            if (words[i].length() == min) {
                System.out.println("Самое короткое слово: " + words[i]);
            }
        }
    }
}
