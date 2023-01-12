import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {

        List<String> frutas1 = new ArrayList<>(); 
        frutas1.add("banana");
        frutas1.add("uva");
        frutas1.add("pera");
        frutas1.add("melancia");
        frutas1.add("melao");

        List<String> frutas2 = new ArrayList<>(); 
        frutas2.add("morango");
        frutas2.add("uva");
        frutas2.add("goiaba");
        frutas2.add("melancia");
        frutas2.add("pitanga");

        String repetidas =  "";
        for (int i = 0 ; i< frutas1.size() ; i ++) {
            for  (int j = 0 ; j< frutas2.size() ; j++) {
                if (frutas1.get(i) == frutas2.get(j)) {
                    repetidas += ""+frutas1.get(j)+" ";           }
            }   

        }
        System.out.println(repetidas);
    }
}
