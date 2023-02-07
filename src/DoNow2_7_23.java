import java.util.*;

public class DoNow2_7_23 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < numList.size(); i++) {
            numList.add(numList.get(i));
        }

        System.out.println(numList);

    }
}
