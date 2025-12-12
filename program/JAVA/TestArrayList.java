import java.util.*;
public class TestArrayList{
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("cat");
        names.add("dog");
        names.add("pig");
        names.set(1,"graphes");
        names.remove(1);
        names.clear();
        System.out.println(names);
    }
}