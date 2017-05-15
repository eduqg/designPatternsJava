public class MarioCapa implements MarioState {
    public MarioState pegarCogumelo(){
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }
    public MarioState pegarFlor(){
        System.out.println("Mario Fogo!");
        return new MarioFogo();
    }
    public MarioState pegarPena(){
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }
    public MarioState levarDano(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

}