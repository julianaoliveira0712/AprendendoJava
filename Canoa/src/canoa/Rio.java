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
 * @author JULIANASOU, 6 de set de 2019, 09:40:49
 */// </editor-fold>
public class Rio {

    //<editor-fold defaultstate="collapsed" desc="attributes...">
    //    <editor-fold defaultstate="collapsed" desc="main attributes...">
    boolean[] partes;
    Canoa canoa;
    int ultimaPosicaoCanoa;
    //    </editor-fold>

    //    <editor-fold defaultstate="collapsed" desc="constants attributes...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="static attributes...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    //    </editor-fold>
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors...">
    public Rio(int tamanhoRio, Canoa canoa) {
        partes = new boolean[tamanhoRio];
        this.canoa = canoa;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="methods...">
    //    <editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="override methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    private void reset(){
        for (int i = 0; i < tamanho(); i++) {
            partes[i]= false;
        }
    }
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="static methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="main methods...">
    
    public Integer tamanho() {
        return partes.length;
    }

    public void posicionarCanoaNoRio(int novaPosicao) {
        ultimaPosicaoCanoa = novaPosicao;
        reset();
        if (ultimaPosicaoCanoa >= 0 && ultimaPosicaoCanoa < tamanho()) {
            for (int j = 0; j < canoa.tamanho(); j++) {
                partes[novaPosicao] = canoa.partes[j];
                novaPosicao++;
            }
        }

    }
    
    public void receberTiro(int posicaoTiro){
        if (posicaoTiro >= 0 && posicaoTiro < tamanho()) {
            partes[posicaoTiro]=false;
        }
    }
    
    public void atualizarCanoa() {
        int contParteCanoa=0;
        for (int i = 0; i < tamanho() ;i++) {
            if(partes[i] != false){
                canoa.partes[contParteCanoa] = partes[i];
                contParteCanoa++;
            }
        }
    }

    //    </editor-fold>
    //</editor-fold>
}//class
