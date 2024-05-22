package writer;



public class ProstyOzdobnik implements Ozdobnik {
    @Override
    public String ozdabiaj(String s) {
        return "<<<<<" + s + ">>>>>";
    }
}



