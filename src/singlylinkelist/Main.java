package singlylinkelist;

public class Main {

    public static void main(String[] args) {

        singlylinkedlist<Integer>list = new singlylinkedlist<Integer>();
        
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(45);
        list.addfirst(80);
        list.addfirst(55);
        list.addLast(90);
        
        
       // list.removeLast();
        //list.removefirst();
        
        list.display();

    }
}
