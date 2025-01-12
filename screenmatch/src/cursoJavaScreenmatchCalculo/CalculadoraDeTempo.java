package cursoJavaScreenmatchCalculo;

import cursoJavaScreenmatchModelos.Filme;
import cursoJavaScreenmatchModelos.Serie;
import cursoJavaScreenmatchModelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoMinutos();
//    }

    public void inclui(Titulo titulo){ // Utilizando Polimorfismo, ao em vez de usar as subclasses usa-se a superclasse titulo para aumentar as escolhas possíveis
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
