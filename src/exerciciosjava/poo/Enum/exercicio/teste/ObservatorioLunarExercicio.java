package exerciciosjava.poo.Enum.exercicio.teste;

import exerciciosjava.poo.Enum.exercicio.dominio.FaseDaLua;
import exerciciosjava.poo.Enum.exercicio.dominio.ObservatorioLunar;



public class ObservatorioLunarExercicio {
    public static void main(String[] args) {
        ObservatorioLunar observatorioLunar = new ObservatorioLunar(FaseDaLua.NOVA);
        ObservatorioLunar observatorioLunar2 = new ObservatorioLunar( FaseDaLua.CRESCENTE);
        ObservatorioLunar observatorioLunar3 = new ObservatorioLunar( FaseDaLua.CHEIA);
        ObservatorioLunar observatorioLunar4 = new ObservatorioLunar(FaseDaLua.MINGUANTE);



        observatorioLunar.exibirFaseAtual();
    }
}
