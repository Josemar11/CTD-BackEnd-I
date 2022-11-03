package com.company;

public class MenuVegetariano extends Menu{
   private double custoEmbalagem;

   public MenuVegetariano(String descricao, double preco, double custoEmbalagem) {
       super(descricao, preco);
       this.custoEmbalagem = custoEmbalagem;
   }
    @Override
    public void montado() {
       System.out.println(getDescricao());
       System.out.println("Acrescenta embalagens e condimentos especiais.");
    }

    @Override
    public double precoMenu() {
        return super.precoMenu() + custoEmbalagem + super.precoMenu() * 0.01;
    }
}
