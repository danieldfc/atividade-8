/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author danielfelizardo
 */
public class Quadrado implements Figura {

  private double lado;

  public Quadrado(double lado) {
    this.lado = lado;
  }
  
  @Override
  public double calcularArea() {
    return this.lado * this.lado;
  }
}
