public class concreteCreator extends creator {//My apllication

    //creates specific pdf, conected only to pdf
    @Override
    public Document createDocument(String codeDoc){
        super.document = new MyPDFDocument...
    }

}