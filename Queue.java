import java.util.ArrayList;
public class Queue{
    ArrayList<Integer> elements = new ArrayList<>();

    public void add(int num){
        elements.add(num);
    }
    public int pop(){
        int firstNum = elements.get(0);
        elements.remove(0);
        return firstNum;
    }
}
