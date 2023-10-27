import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange (300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).build());
        inventory.add(Orange.builder().weight(600).color(Color.RED).build());
        inventory.add(Orange.builder().weight(400).build());
        inventory.add(Orange.builder().color(Color.RED).build());
        inventory.add(Orange.builder().weight(50).build());



    }

    private static void prettyPrintOrange (List<Orange> inventory, OrangeFormatter orangeFormatter){
        for(Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
