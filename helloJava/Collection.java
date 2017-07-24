import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Junaid Salaat.
 */
public class Collection {
    public static void Logger(String type, List<Integer> list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }

    public static void main(String [] args){
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = Arrays.asList(12,68,1);

        HashMap<Integer, String> myHash = new HashMap<>();
        myHash.put(1, "karachi");
        myHash.put(2, "la");
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(33);
        linkedList.add(333);
        linkedList.add(335);

        Logger("AL", numbers);
        Logger("LL", linkedList);
        Logger("ArraysAsList", numbers2);

    }
}
