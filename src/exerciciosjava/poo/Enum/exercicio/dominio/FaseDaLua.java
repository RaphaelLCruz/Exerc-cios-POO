package exerciciosjava.poo.Enum.exercicio.dominio;

public enum FaseDaLua {
    NOVA ("Lua totalmente escura, ideal para observar estrelas."),
    CRESCENTE("Uma fatia crescente de luz aparece, marcando o início do crescimento."),
    CHEIA("Lua totalmente iluminada, brilhante e redonda no céu."),
    MINGUANTE("Metade da lua iluminada, diminuindo sua luz visível.");

    private String descricao;
    FaseDaLua(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
