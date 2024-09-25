package org.exercicio;

public class Album {
    private int larguraPagina;
    private int alturaPagina;

    public Album(int largura, int altura) {
        this.larguraPagina = largura;
        this.alturaPagina = altura;
    }

    public boolean ColarFotos(int L1, int H1, int L2, int H2) {
        if (L1 < 0 || H1 < 0 || L2  < 0 || H2 < 0) {
            return false;
        }
        return this.Encaixe(L1, H1, L2, H2) || this.Encaixe(L1, H1, H2, L2) || this.Encaixe(H1, L1, L2, H2) || this.Encaixe(H1, L1, H2, L2);
    }

    private boolean Encaixe(int L1, int H1, int L2, int H2) {
        return L1 + L2 <= this.larguraPagina && Math.max(H1, H2) <= this.alturaPagina || H1 + H2 <= this.alturaPagina && Math.max(L1, L2) <= this.larguraPagina;
    }
}
