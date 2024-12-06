package Marbles;

import Jogo.Posicao;
import Jogo.Tabuleiro;

/**
 * Classe que herda os comportamentos da classe abstrata Pecas e determina as regras de movimento das instâncias de Rei
 */
public class Rei extends Pecas {

    public Rei (Cor cor) {
        super(cor);
    }
    /**
     * Através do polimorfismo, especifica as regras de movimentação de uma instância de Rei
     */
    public boolean movimentoValido (Tabuleiro jogo, Posicao posicao) {
        int xAtual = this.getPosicaoAtual().getX();
        int yAtual = this.getPosicaoAtual().getY();

        int xFinal = posicao.getX();
        int yFinal  = posicao.getY();

        boolean valido = (xFinal == xAtual && Math.abs(yFinal - yAtual) == 1)||
        (yFinal == yAtual && Math.abs(xFinal - xAtual) == 1) ||
        (xFinal != xAtual && yFinal != yAtual && Math.abs(xFinal - xAtual) == 1 && Math.abs(yFinal - yAtual) == 1);

        return valido;
    }
    
    @Override
    public String toString() {
        String corPeca = "";

        if (this.getCor()==Cor.BRANCO) {
            corPeca = "\u265a";
        } else {
            corPeca = "\u2654";
        }

        return corPeca;
    }

}