package com.company;

public abstract class Menu {

    private double preco;
    private String descricao;

    public Menu(String descricao, double preco)
    {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public double preparacao()
    {
        montado();
        return precoMenu();
    }

    public abstract void montado();

    public double precoMenu() {
        return preco;
    }
}
