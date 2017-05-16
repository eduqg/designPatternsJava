public class MarioMorto implements MarioState {
    public MarioState pegarCogumelo(){
        System.out.println("Mario nao pode crescer se estiver morto....");
        return this;
    }
    public MarioState pegarFlor(){
        System.out.println("Mario não pode soltar bolas de fogo morto!");
        return this;
    }
    public MarioState pegarPena(){
        System.out.println("Voar? Ele está no ceu");
        return this;
    }
    public MarioState levarDano(){
        System.out.println("Levar dano morto já é sacanagem");
        return this;
    }

}