package exerciciosjava.poo.Enum.exercicio.dominio;

public class ObservatorioLunar {
    // Apenas um atributo do tipo enum FaseDaLua é suficiente
    private FaseDaLua faseLua;

    // O construtor agora recebe apenas o enum, eliminando a String
    public ObservatorioLunar(FaseDaLua faseLua) {
        this.faseLua = faseLua;
    }

    public void exibirFaseAtual(){
        // Usamos faseLua.name() para obter o nome da constante do enum (ex: "NOVA")
        System.out.println("Fase atual: " + this.faseLua.name() + "\nDescrição: " + faseLua.getDescricao());
    }
}