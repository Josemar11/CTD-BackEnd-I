package com.company;

public class MenuInfantil extends Menu{

    private String brinquedo;
    private double custoBrinquedo;

    public  MenuInfantil(String descripcion, double preco, String brinquedo, double custoBrinquedo) {
        super(descripcion, preco);
        this.brinquedo = brinquedo;
        this.custoBrinquedo = custoBrinquedo;
    }

    @Override
    public void montado() {
        System.out.println(getDescricao());
        System.out.println("Acrescenta brinquedo:");
        System.out.println(brinquedo);
    }

    @Override
    public double precoMenu() {
        return super.precoMenu() + custoBrinquedo;
    }
}
