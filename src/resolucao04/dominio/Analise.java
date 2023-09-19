package resolucao04.dominio;

import java.util.Date;

public class Analise {
    private Date data;
    private String descricao;

    public Analise(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public Date getData(){
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}
