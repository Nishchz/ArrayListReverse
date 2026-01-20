import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        // java collecton frame work
        ArrayList<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i = list.size()-1; i>=0; i--){//last index ka index i=5-4=4-->list.size()-1
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
      

    }
}
