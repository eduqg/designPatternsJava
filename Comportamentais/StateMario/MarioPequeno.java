public class MarioPequeno implements MarioState {
    public MarioState pegarCogumelo(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

    public MarioState pegarFlor(){
        System.out.println("Mario Grande e Com Fogo!");
        return new MarioFogo();
    }

    public MarioState pegarPena(){
        System.out.println("Mario Grande e com Capa!");
        return new MarioCapa();
    }

    public MarioState levarDano(){
        System.out.println("Mario morto!");
        return new MarioMorto();
    }

}