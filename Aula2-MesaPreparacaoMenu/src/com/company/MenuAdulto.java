package com.company;

public class MenuAdulto extends Menu{

    public MenuAdulto(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public void montado() {
        System.out.println(getDescricao());
    }
}
