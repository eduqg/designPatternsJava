public abstract class TemplateExecucao {
    public static void executaRotinaRepteis() {
        geraRelatorios();
        enviaEmail();
    }
    public static void executaRotinaAves() {

    }
    public static void geraRelatorios() {
        System.out.println("Gera relatorios repteis");
    }
    public static void enviaEmail() {
        System.out.println("enviaEmail");
    }
}