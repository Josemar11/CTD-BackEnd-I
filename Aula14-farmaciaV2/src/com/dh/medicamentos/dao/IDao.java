package com.dh.medicamentos.dao;

import java.util.List;

public interface IDao <T>{

    public T salvar(T t);
    public T buscar(Integer id);
}
