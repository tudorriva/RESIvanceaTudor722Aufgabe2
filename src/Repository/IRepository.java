package Repository;

import java.util.List;

public interface IRepository<T> {
    void create(T obj);
    void update(int id, T newObj);
    void delete(int id);
    T get(int id);
    List<T> getAll();
    public T getByName(String name);
    public void updateByName(String name, T newObj);
    public void deleteByName(String name);
}