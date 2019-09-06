package canoa;

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author JULIANASOU, 6 de set de 2019, 08:24:53
 */// </editor-fold>
public class Canoa {

    //<editor-fold defaultstate="collapsed" desc="attributes...">
    String nome;
    boolean[] partes;

    //    <editor-fold defaultstate="collapsed" desc="main attributes...">
    
    //    </editor-fold>
    
    //    <editor-fold defaultstate="collapsed" desc="constants attributes...">
    
    //    </editor-fold>
    
    //    <editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //    </editor-fold>
    
    //    <editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    
    //    </editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructors...">

    public Canoa(String nome, int tamanho) {
        this.nome = nome;
        this.partes = new boolean[tamanho];
    }
    
   
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="methods...">


    
    //    <editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    public void setNome(String nome) {    
        this.nome = nome;
    }
    
      public String getNome(){
        return nome;
    }

    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="override methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="static methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="main methods...">
    public Integer tamanho() {
        return partes.length;
    }
    
    public boolean estaDestruida(){
//        int cont = partes.length;
        boolean existePedaco = false;
        for (int cont = 0; cont < partes.length; cont++) {
//            if(partes[i] == false){
//                cont--;
//            }
//            existePedaco = existePedaco | partes[cont];
            existePedaco |= partes[cont];
        }
        return existePedaco;

    }
    
    public void destruirParte( int indice){
        if(indice >= 0 && indice < partes.length){
            partes[indice] = false;
        }
    }
    
    //    </editor-fold>
    //</editor-fold>
   
        
}//class
