import java.util.*;

public class Conta {
    private String username;
    private String password;
    private boolean isLogged;

    private HashSet<ContaObserver> jogadores = new HashSet<ContaObserver>();

    public Conta(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLogged = false;
    }

    public void addPlayerIntrested(Jogador jogador){
        this.jogadores.add(jogador);
    }

    public void login(){
        this.isLogged = true;
        for(ContaObserver jogadores : this.jogadores) {
            jogadores.notifica();
        }
    }

    public String getUsername() {
        return this.username;
    }

}