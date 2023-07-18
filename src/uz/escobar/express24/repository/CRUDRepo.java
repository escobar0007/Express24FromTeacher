package uz.escobar.express24.repository;

public interface CRUDRepo<T,I> {
    boolean save(T t);
    boolean update(T t, I i);
    boolean delete(I i);
    T getById(I i);

}
