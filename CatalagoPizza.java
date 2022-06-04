package Actividad_C1_A2_01;


public class CatalagoPizza {
        Pizza pizza1 = new Pizza("Jamon",110);
        Pizza pizza2 = new Pizza("Mexicana",170);
        Pizza pizza3 = new Pizza("Peperoni",120);
        Pizza[] pizzas = {pizza1,pizza2,pizza3};


        public CatalagoPizza(){

        }

        public Pizza sendPizza(byte i){
            return pizzas[i];
        }
}
