/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmitirSom;

import java.util.ArrayList;

/**
 *
 * @author danielfelizardo
 */
public class CaixaDeSom {
  
  private ArrayList<EmissorDeSom> emissores = new ArrayList<EmissorDeSom>();
     
  public void adicionarEmissor(EmissorDeSom e){
    this.emissores.add(e);
  }
  
  public void tocarTodosOsEmissores(){
    for (EmissorDeSom e: emissores){
      System.out.println(e.emitirSom());
    }
  }
}
