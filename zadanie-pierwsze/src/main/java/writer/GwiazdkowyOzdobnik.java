package writer;

public class GwiazdkowyOzdobnik implements Ozdobnik {
    @Override
    public String ozdabiaj(String s) {
        return "*****" + s + "*****";
    }
}