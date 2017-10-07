/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author wanderson
 */
public class BeansMedico {
   //modelo beans cria a classe e atributos e os get e set
    private int codigo;
    private String nome_medicos;
    private String especializacao;
    private int crm;
    private String pesquisa;
    
     public String getNome_medicos() {
        return nome_medicos;
    }

    /**
     * @param nome_medicos the nome_medicos to set
     */
    public void setNome_medicos(String nome_medicos) {
        this.nome_medicos = nome_medicos;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    /**
     * @param especializacao the especializacao to set
     */
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    /**
     * @return the crm
     */
    public int getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(int crm) {
        this.crm = crm;
    }

    public void getEspecializacao(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome_medicos
     */
   
    
}
