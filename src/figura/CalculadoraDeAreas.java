/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.util.ArrayList;

/**
 *
 * @author danielfelizardo
 */
public class CalculadoraDeAreas {

  public static void main(String[] args) {
    ArrayList<Figura> figuras = new ArrayList<Figura>();
    figuras.add(new Quadrado(2));
    figuras.add(new Triangulo(3, 2));

    double areaTotal = 0.0;
    for (Figura figura: figuras){
      areaTotal += figura.calcularArea();
    }
    System.out.printf("Área total: %.1f\n", areaTotal);
  }
}
