package prototype;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 1 on 09.04.2016.
 */
public class Prototype implements Cloneable {


    private List<String> list;

    public Prototype() {

    }

    private Prototype(List<String> list) {
        this.list = list;
    }

    @Override
    public Object clone() {

        List<String> listCloned = list.stream()
                .collect(Collectors.toList());
        return new Prototype(listCloned);
    }

    public List<String> getList() {
        return list;
    }

    public void collect() {
        list = Arrays.asList("a", "b", "c");
    }
}
