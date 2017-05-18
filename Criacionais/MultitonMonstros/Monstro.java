import java.util.*;

public class Monstro {
    private String nome;

    private static final int gelo = 0;
    private static final int fogo = 1;

    private static Map<Integer, Monstro> monstros = new HashMap<Integer, Monstro>();

    private Monstro() {
    }

    static {
        Monstro monstroGelo = new Monstro();
        monstroGelo.setNome("BIIRL");
        monstros.put(gelo, monstroGelo);

        Monstro monstroFogo = new Monstro();
        monstroFogo.setNome("BIIIIRRRLLL");
        monstros.put(fogo, monstroFogo);

    }

    public static Monstro getInstance(int tipo) {
        return Monstro.monstros.get(tipo);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}