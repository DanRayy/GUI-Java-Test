package heranca;

/**
 *
 * @author dan-pc
 */
public class Jogador {
    private String nome;
    private Integer idade;
    private Integer vida;
    private Integer defesa;
    private Integer armadura;
    private Integer forca;
    
    public Jogador(String nome, Integer idade, Integer vida, Integer forca, Integer defesa, Integer armadura){
        this.nome = nome;
        this.idade = idade;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.armadura = armadura;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Integer getIdade(){
        return idade;
    }
    
    public Integer getVida(){
        return vida;
    }
    
    public Integer getForca(){
        return forca;
    }
    
    public Integer getArmadura(){
        return armadura;
    }
    
    public Integer getDefesa(){
        return defesa;
    }
}
