package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void montarMenus() {

        double total=0;
        MenuVegetariano menu1 = new MenuVegetariano(
                "Hambúrguer vegano",400,50);
        MenuAdulto menu2 = new MenuAdulto(
                "Hambúrguer completo",500);
        MenuInfantil menu3 = new MenuInfantil(
                "Hambúrguer infantil", 300, "Mini craque", 100);

        total += menu1.preparacao();
        total += menu2.preparacao();
        total += menu3.preparacao();

        System.out.println("Total da compra " + total);

    }

}