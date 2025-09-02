package school.sptech;

public class Gincana {
    String nome;
    Double premio;
    Integer qtdInscrito;
    boolean ativa;

    public Gincana(String nome, Double premio) {
        nome = "JavaCana";
        premio = 100.00;
        ativa = true;
    }

    public void inscrever(Integer qtd) {
        if (qtd != null && qtd > 0 && ativa == true) {
            qtdInscrito += qtd;
        }
    }


    public Integer remover(Integer qtd) {
        if (qtd != null && qtd > 0 && ativa == true && qtd <= qtdInscrito) {
            qtdInscrito -= qtd;
            return qtdInscrito;
        }
        return null;
    }

    public Integer desativar() {
        if (ativa == false) {
            return null;
        } else {
            ativa = false;
            qtdInscrito = 0;
            return qtdInscrito;
        }
    }

    public void transferir(Gincana destino, Integer qtdATransferir) {
        if (qtdATransferir != null && qtdATransferir > 0 && ativa == true) {

        }
        return;
    }

    public Boolean reajustarPremio(Double reajuste){
        if(reajuste == null || reajuste <= 0){
            return false;
        }else{
            reajuste *= reajuste;
            return true;
        }
    }

    public String getNome() {
        return nome;
    }

    public Double getPremio() {
        return premio;
    }

    public Integer getQtdInscrito() {
        return qtdInscrito;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}