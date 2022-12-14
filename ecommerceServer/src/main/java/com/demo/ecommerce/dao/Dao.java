package com.demo.ecommerce.Dao;

import java.util.List;

public interface Dao<T> {

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);

    T find(T t);

}
