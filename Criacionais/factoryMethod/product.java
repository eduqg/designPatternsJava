public abstract class product {//Document

    private String documentCode;

    public Document(String docCode){
        this.setDocumentCode(docCode);
    }

    public abstract void open();
    public abstract void close();
    public abstract void record();

//get e set
}