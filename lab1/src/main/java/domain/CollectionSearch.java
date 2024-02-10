package domain;

import java.util.HashMap;
import java.util.Objects;

public class CollectionSearch {

    private String name;

    private Integer id;
    private HashMap<Integer, String> map;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionSearch that = (CollectionSearch) o;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
