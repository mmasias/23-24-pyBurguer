class Cocinero {

    public void prepararHamburguesa(){

        int numeroSalsas = 2;
        int numeroExtras = 1;

        Hamburguesa hamburguesa = new Hamburguesa(new Pan("Brioche"), numeroSalsas, numeroExtras);
        
        Extra queso = new Extra("Queso");
        hamburguesa.ponerExtra(queso);

        Extra huevo = new Extra("Huevo frito");
        hamburguesa.ponerExtra(huevo);

        Carne carne = new Carne();
        hamburguesa.ponerCarne(carne);

        Salsa mayonesa = new Salsa("Mayonesa");
        hamburguesa.ponerSalsa(mayonesa);

        hamburguesa.ponerPan(new Pan("Brioche"));
        
        hamburguesa.ver();
    }

    public static void main(String[] args) {
        Cocinero bobEsponja = new Cocinero();
        bobEsponja.prepararHamburguesa();
    }    
}
