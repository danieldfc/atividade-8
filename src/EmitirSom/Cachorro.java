/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmitirSom;

/**
 *
 * @author danielfelizardo
 */
public class Cachorro implements EmissorDeSom {
  
  private String nome; 
  
  public Cachorro(String nome){
    this.nome = nome;
  }
  
  public String emitirSom(){
    return "au au";
  }
}
