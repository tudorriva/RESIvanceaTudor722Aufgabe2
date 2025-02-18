package Repository;

import Entities.Produkten;
import Entities.Charakteren;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Repo<T> implements IRepository<T> {
    private final AtomicInteger idCount = new AtomicInteger(0);
    private final Map<Integer, T> map = new HashMap<>();

    @Override
    public void create(T obj) {
        int id = idCount.incrementAndGet();
        if (obj instanceof Charakteren){
            ((Charakteren) obj).setId(id);
        }
        map.putIfAbsent(id, obj);
    }

    @Override
    public void update(int id, T newObj) {
        map.replace(id, newObj);
    }

    @Override
    public void delete(int id) {
        map.remove(id);
    }

    @Override
    public T get(int id) {
        return map.get(id);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(map.values());
    }
}