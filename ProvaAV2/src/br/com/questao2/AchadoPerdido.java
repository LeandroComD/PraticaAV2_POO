package br.com.questao2;

public class AchadoPerdido implements PublicacaoInterface {

    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String local_achado;
    private String data_hora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public AchadoPerdido() {
    }


    public void completaDados(String local_achado, String data_hora, String foto){
        this.local_achado = local_achado;
        this.data_hora = data_hora;
        this.foto = foto;
    }



    @Override
    public boolean buscarTitulo() {
        if(buscarTitulo() != false) {
            return true;
        }
            return false;

    }

    @Override
    public String visualizarDetalhes() {
        return "\n" + titulo + "\n" + descricao + "\n" + tipo + "\n" +status + "\n" +local_achado + "\n" +data_hora + "\n"+ foto;
    }



}
