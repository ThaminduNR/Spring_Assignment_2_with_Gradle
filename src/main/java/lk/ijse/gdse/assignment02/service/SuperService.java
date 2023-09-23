package lk.ijse.gdse.assignment02.service;

import java.util.List;

public interface SuperService<T,ID> {

    public T add(T t);
    public boolean delete(ID id);
    public T update(T t);
    public T search(ID id);

    List<T> getAll();
}
