import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stillTrue = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> notes = new ArrayList<>();
        while (stillTrue){
            System.out.println("1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            int choice = scan.nextInt();
            String temp = scan.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Введите задачу для планирования:");
                    String input = scan.nextLine();
                    notes.add(input);
                    break;
                case 2:
                    for(int i = 1; i <= notes.size(); i++){
                        System.out.println(i + ". " + notes.get(i - 1));
                    }
                    break;
                case 3:
                    System.out.println("Какую задачу удалить?");
                    choice = scan.nextInt();
                    notes.remove(choice - 1);
                    break;
                case 0:
                    stillTrue = false;
                    break;
                default:
                    System.out.println("Такой опции нету");
            }
        }
    }
}
