package AbstractClasses.Challenge;

public class Main {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data){
            //create new item with value set to the string s
        }
    }
}
