package co.edu.unbosque.controller;

import co.edu.unbosque.model.LinkedList;
import co.edu.unbosque.view.View;

public class Controller {
    private LinkedList list;
    private View view;
    public Controller(){
        list = new LinkedList();
        view = new View();
        execute();
    }
    public void execute() {
        int nodeValue = 0;
        int mainResponse = 0;
        do{
            switch (view.showMainMenu()){
                case 1:
                    //Add to tail
                    nodeValue = view.askForData();
                    if(nodeValue == -1){
                        view.showMessage("Invalid input");
                    }else{
                        list.addToTail(nodeValue);
                    }
                    break;
                case 2:
                    //Add to position
                    break;
                case 3:
                    //Add to head
                    break;
                case 4:
                    //Delete data
                    int deleteRes = view.showDeleteMenu();
                    if(deleteRes == -1 || deleteRes > 4){
                        view.showMessage("Invalid input");
                    }else if(deleteRes == 2){
                        //Delete tail
                        boolean isDeleted = list.deleteFromTail();
                        if(!isDeleted){
                            view.showMessage("Node not found");
                        }else{
                            view.showMessage("Deleted successfully");
                        }
                    }else if(deleteRes == 1){
                        //Delete head
                        boolean isDeleted = list.deleteFromHead();
                        if(!isDeleted){
                            view.showMessage("Node not found");
                        }else{
                            view.showMessage("Deleted successfully");
                        }
                    }else if(deleteRes == 3){
                        //Delete from position
                        int targetPosition = view.askForData();
                        if(targetPosition == -1){
                            view.showMessage("Invalid input");
                        }else{
                            boolean isDeleted = list.deleteFromPosition(targetPosition);
                            if(isDeleted)
                                view.showMessage("Deleted successfully");
                            else
                                view.showMessage("Node not found");
                        }
                    }
                    break;
                case 5:
                    //Search data
                    break;
                case 6:
                    //Clean list
                    break;
                case 7:
                    //Show list
                    list.displayList();
                    break;
                case 8:
                    //Exit
                    break;
                default:
                    //Err
                    view.showMessage("Invalid input");
                    break;
            }
        }while(mainResponse != 8);
    }
}
