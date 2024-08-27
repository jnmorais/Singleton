package org.projetos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorDeProgramasTVTest {
    @Test
    public void deveRetornarProgramaAtual() {
        GerenciadorDeProgramasTV.getInstance().setProgramaAtual("SporTV");
        assertEquals("SporTV", GerenciadorDeProgramasTV.getInstance().getProgramaAtual());
    }

    @Test
    public void deveAlterarProgramaAtual() {
        GerenciadorDeProgramasTV.getInstance().setProgramaAtual("Donos da Bola");
        assertEquals("Donos da Bola", GerenciadorDeProgramasTV.getInstance().getProgramaAtual());
    }
}