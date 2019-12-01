package BTU
import java.util.*;

public class Assignment3Main {

    public static void main(String[] args){
        //N1();
        N2();
    }

    static void N1(){
        List<Integer> randomNums = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            randomNums.add(rand.nextInt(10));
        }
        List<Integer> randomNumsCopy = new ArrayList<>(randomNums);
        Collections.sort(randomNumsCopy);

        int index = 0;
        for (Iterator it =randomNums.iterator();it.hasNext();){
            it.next();
            if (index%2==0){
                it.remove();
            }
            index++;
        }

        Collections.sort(randomNums);
        System.out.println(randomNums);
        System.out.println(randomNumsCopy);
    }

    static void N2(){
        List<Integer> randomNums = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            randomNums.add(rand.nextInt(6)+5);
        }

        List<Integer> randomNumsCopy = new ArrayList<>(randomNums);
        for (int i = 3; i < randomNumsCopy.size(); i+=3) {
            if (i > randomNumsCopy.size()){
                break;
            }
            randomNumsCopy.add(i+1,rand.nextInt(6)+20);
        }

        System.out.println(randomNums);
        System.out.println(randomNumsCopy);
    }
}