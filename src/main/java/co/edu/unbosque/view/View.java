package co.edu.unbosque.view;

import java.util.Scanner;

public class View {
    private Scanner sc;
    public View(){
        sc = new Scanner(System.in);
    }

    public int showMainMenu(){
        System.out.print("LINKED LIST:\n" +
                "1. Add data to tail\n" +
                "2. Add data to position\n" +
                "3. Add data to head\n" +
                "4. Delete data\n" +
                "5. Search data\n" +
                "6. Clean list\n" +
                "7. Show list\n" +
                "8. Exit\n" +
                "> ");
        try{
            return Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            return -1;
        }

    }

    public int showDeleteMenu(){
        System.out.print("DELETE: \n" +
                "1. Head\n" +
                "2. Tail\n" +
                "3. Position\n" +
                "4. Return\n" +
                "> ");
        try{
            return Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            return -1;
        }
    }
    public int askForData(){
        System.out.print("Value: ");
        try{
            return Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            return -1;
        }

    }
    public void showMessage(String message){
        System.out.println(message);
    }
}
