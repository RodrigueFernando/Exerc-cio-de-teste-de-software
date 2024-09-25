package org.exercicio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class TestAlbum {
    @Test
    @DisplayName("Teste fotos quecabem na página")
    public void testFotosCabemValidas() {
        Album pagina = new Album(5, 7);
        assertTrue(pagina.ColarFotos(3,4,3,4));
        //assertThat(pagina.ColarFotos(3, 4, 3, 4), equalTo(true));

    }



}