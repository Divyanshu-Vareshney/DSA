import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
       ArrayList<Integer>list=new ArrayList<>();
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
    //    System.out.println(list.get(0));
       for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
       }
       list.remove(1);
       list.remove(list.indexOf(4));
       System.out.println();
       for(Integer element:list){
        System.out.println(element);
       }
    }
}
