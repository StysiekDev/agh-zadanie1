package writer;

public class NiceWriter implements IWriter {
    private IOzdobnik ozdobnik;

    public void setOzdobnik(IOzdobnik ozdobnik) {
        this.ozdobnik = ozdobnik;
    }

    @Override
    public void writer(String s) {
        String ozdobionyTekst = ozdobnik.ozdob(s);
        System.out.println(ozdobionyTekst);
    }
}

