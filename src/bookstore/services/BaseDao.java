package bookstore.services;

import java.util.List;

// seolah olah membuat method query
// generic class --> class yang punya tipe data general, tergantung ketika implement di class
public interface BaseDao<E, ID> {
    void save(E data);

    List<E> findALL();

    E findById(ID id);

    void update(ID id, E data);

    void delete(ID id);
}
