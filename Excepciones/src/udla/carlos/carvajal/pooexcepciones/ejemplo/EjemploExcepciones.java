package udla.carlos.carvajal.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un numero: ");
        //int divisor = Integer.parseInt(valor); //trasnformar al valor
        int denominador = Integer.parseInt(valor);;
        //double division = cal.dividir(10, denominador);

        double division;
        try {
            //divisor = Integer.parseInt(valor);
           //int division = 10/0;
            //int division = 10/divisor;
            division = cal.dividir(10, denominador);
            System.out.println(division);
        }catch (DivisionPorCeroException dpce){ // Exception ex metodo que resive un parametro y exception es lo mas generico
            System.out.println("Captura el error matematico: " + dpce.getMessage());
            main(args);
        }catch (NumberFormatException nfe) {
            System.out.println("Captura el error de formato: " + nfe.getMessage());
            main(args); //recursividad volver a llamar la funcion
        }finally {
            System.out.println("Es opcional y se ejecuta siempre... ");
        }
        System.out.println("Continuar con el flujo de eaplicación");

    }
}
// main resive parametros
