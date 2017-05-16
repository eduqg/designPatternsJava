public class MarioGrande implements MarioState {
    public MarioState pegarCogumelo(){
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }
    public MarioState pegarPena(){
        System.out.println("Mario com Capa!");
        return new MarioCapa();
    }
    public MarioState levarDano(){
        System.out.println("Mario Pequeno :(");
        return new MarioPequeno();
    }
    public MarioState pegarFlor(){
        System.out.println("Mario Fogo!");
        return new MarioFogo();
    }

}