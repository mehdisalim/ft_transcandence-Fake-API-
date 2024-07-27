package com.salim.FakeAPI.service.interfaces;

import java.util.List;
import java.util.Optional;


public interface ICommonServices<T> {

    List<T>     getAllData();
    Optional<T> getDataById(Long id);
    T           insertData(T data);
    void        deleteAll();
    void        deleteById(Long id);

}