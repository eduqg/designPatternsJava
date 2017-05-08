public abstract class creator {//Aplication

    protected Document document;

    //Factory method abstraction, creates document
    public abstract Document createDocument(String codeDoc);

    public void sendDocument(){
        System.out.println("Sending document by e-mail " + this.document);
    }

}