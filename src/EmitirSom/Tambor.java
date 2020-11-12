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
public class Tambor implements EmissorDeSom {
  
  private String tamanho; 
  private String marca; 
  
  public Tambor(String tamanho, String marca){
    this.tamanho = tamanho;
    this.marca = marca;
  }
  
  public String emitirSom(){
    return "TUM TUM";
  }
}
