package org.projetos;

public class GerenciadorDeProgramasTV {
    private GerenciadorDeProgramasTV() {}


    private static GerenciadorDeProgramasTV instance = new GerenciadorDeProgramasTV();

    public static GerenciadorDeProgramasTV getInstance() {
        return instance;
    }


    private String programaAtual;


    public String getProgramaAtual() {
        return programaAtual;
    }

    public void setProgramaAtual(String programaAtual) {
        this.programaAtual = programaAtual;
    }
}
