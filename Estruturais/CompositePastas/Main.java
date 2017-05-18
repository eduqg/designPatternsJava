public class Main{
    public static void main(String[] args){
        Imagem imagem = new Imagem("imagem1.jpg");
        Imagem imagem2 = new Imagem("imagem2.jpg");
        Video video1 = new Video("video1.avi");

        Pasta pasta = new Pasta("Minha_pasta");
        pasta.adiciona(video1);
        pasta.adiciona(imagem2);
        pasta.listaArquivos();

   }
}
