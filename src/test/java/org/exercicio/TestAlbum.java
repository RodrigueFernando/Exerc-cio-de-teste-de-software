package org.exercicio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class TestAlbum {
    @Test
    @DisplayName("Teste fotos que cabem na página")
    public void testFotosCabemValidas() {
        Album pagina = new Album(5, 7);
        assertTrue(pagina.ColarFotos(3,4,3,4));
        //assertThat(pagina.ColarFotos(3, 4, 3, 4), equalTo(true));

    }

    @Test
    @DisplayName("Testar foto muito grande")
    public void testFotoNaoValida() {
        Album pagina = new Album(10, 10);
        assertFalse(pagina.ColarFotos(10, 100, 3, 3));
    }
    @Test
    public void testDimensoesNegativasInvalido() {
        Album pagina = new Album(7, 5);
        assertFalse(pagina.ColarFotos(-3, 4, 3, 4));
    }
    @Test
    @DisplayName("Teste com dimensões ")
    public void testDimensoesZeroInvalido() {
        Album pagina = new Album(7, 5);
        assertFalse(pagina.ColarFotos(0, 4, 3, 4));
    }

    @Test
    @DisplayName("Testar limites valores máximos")
    public void testLimiteMaximo() {
        Album pagina = new Album(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertTrue(pagina.ColarFotos(1000000, 1000000, 1000000, 1000000));
    }
}