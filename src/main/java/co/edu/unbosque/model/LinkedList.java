package co.edu.unbosque.model;

public class LinkedList {
    private Node root;
    private Node aux;
    public LinkedList(){

    }

    public void addToTail(int data){
        if(this.root == null){
            this.root = new Node(data);
        }else{
            aux = root;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(new Node(data));
        }
    }

    public boolean displayList(){
        if(this.root == null){
            return false;
        }else{
            aux = root;
            while(aux != null){
                if(aux.getNext() == null){
                    System.out.println(aux.getData());
                }else{
                    System.out.print(aux.getData() + " --> ");
                }
                aux = aux.getNext();
            }
            return true;
        }
    }

    public boolean deleteFromTail(){
        if(this.root == null){
            return false;
        }else{
            aux = root;
            while(aux.getNext().getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(null);
            return true;
        }
    }

    public boolean deleteFromHead(){
        if(this.root == null){
            return false;
        }else{
            root = root.getNext();
            return true;
        }
    }

    public boolean deleteFromPosition(int data){
        if(this.root == null){
            return false;
        }else{
            aux = root;
            while (aux.getNext().getData() != data){
                aux = aux.getNext();
            }
            //TODO: Continue
            if(aux.getNext().getNext() == null){
                //Is tail
                System.out.println(aux.getData());
                //System.out.println("Removed from tail");
                return this.deleteFromTail();
            }else if(aux.getNext() == root){
                //Is head
                System.out.println("Removed from head");
                return this.deleteFromHead();
            }else{
                Node secAux = aux.getNext().getNext();
                aux.setNext(null);
                aux.setNext(secAux);
                return true;
            }

        }
    }
}
