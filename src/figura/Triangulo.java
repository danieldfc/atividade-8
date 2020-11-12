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
public class Triangulo implements Figura {

  private double base;
  private double altura;

  public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }
  
  @Override
  public double calcularArea() {
    return (this.base * this.altura) / 2;
  }
  
}
