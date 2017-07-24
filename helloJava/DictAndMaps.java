import java.util.*;

/**
 * Created by Junaid Salaat.
 */
public class DictAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> pair = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            pair.put(name, phone);
        }
//        while(in.hasNext()){
//            String s = in.next();
//            for(Map<String,Integer> myMap : dict){
//                if (!myMap.containsKey(s)){
//                    System.out.println(s+"Not found");
//                }
//                else{
//                    System.out.println(s+"="+myMap.get(s));
//                }
//            }
//        }

        while(in.hasNext()) {
            String s = in.next();
            if (pair.containsKey(s)){
                System.out.println(s+"="+pair.get(s));

            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
