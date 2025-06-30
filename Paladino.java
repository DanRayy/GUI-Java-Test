package heranca;

/**
 *
 * @author dan-pc
 */
public class Paladino extends Jogador {
    private Jogador jogador;
    
    public Paladino(String nome, Integer idade){
        super(nome, idade, 120, 50, 20, 50); // vida forca defesa armadura
    }
}
