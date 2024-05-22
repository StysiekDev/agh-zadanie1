package writer;

public class OzdobnikDolar implements IOzdobnik {
    @Override
    public String ozdob(String s) {
        return "$$$$$" + s + "$$$$$";
    }
}
