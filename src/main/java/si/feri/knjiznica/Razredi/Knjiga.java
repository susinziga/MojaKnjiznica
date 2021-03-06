package si.feri.knjiznica.Razredi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Knjiga {
    private int idKnjiga;
    private String naslov;
    private String avtor;
    private int isbn;
    private String zalozba;
    private int letoIzdaje;
     private String prevod;
     private String ilustracije;
     private String lokacija;
     private String zanr;
     private String publika;
     private int navoljo;

    public Knjiga(){}

    public Knjiga(int idKnjiga, String naslov, String avtor, int isbn, String zalozba, int letoIzdaje, String prevod, String ilustracije, String lokacija, String zanr, String publika, int navoljo) {
        this.idKnjiga=idKnjiga;
        this.naslov = naslov;
        this.avtor = avtor;
        this.isbn = isbn;
        this.zalozba = zalozba;
        this.letoIzdaje = letoIzdaje;
        this.prevod = prevod;
        this.ilustracije = ilustracije;
        this.lokacija = lokacija;
        this.zanr = zanr;
        this.publika = publika;
        this.navoljo=navoljo;
    }

    public int getNavoljo() {
        return navoljo;
    }

    @XmlElement
    public void setNavoljo(int navoljo) {
        this.navoljo = navoljo;
    }

    public String getNaslov() {
        return naslov;
    }

    @XmlElement
    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getAvtor() {
        return avtor;
    }

    @XmlElement
    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public int getIsbn() {
        return isbn;
    }

    @XmlElement
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getZalozba() {
        return zalozba;
    }

    @XmlElement
    public void setZalozba(String zalozba) {
        this.zalozba = zalozba;
    }

    public int getLetoIzdaje() {
        return letoIzdaje;
    }

    @XmlElement
    public void setLetoIzdaje(int letoIzdaje) {
        this.letoIzdaje = letoIzdaje;
    }

    public String getPrevod() {
        return prevod;
    }

    @XmlElement
    public void setPrevod(String prevod) {
        this.prevod = prevod;
    }

    public String getIlustracije() {
        return ilustracije;
    }

    @XmlElement
    public void setIlustracije(String ilustracije) {
        this.ilustracije = ilustracije;
    }

    public String getLokacija() {
        return lokacija;
    }

    @XmlElement
    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public String getZanr() {
        return zanr;
    }

    @XmlElement
    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getPublika() {
        return publika;
    }

    @XmlElement
    public void setPublika(String publika) {
        this.publika = publika;
    }

    public int getIdKnjiga() {
        return idKnjiga;
    }

    @XmlElement
    public void setIdKnjiga(int idKnjiga) {
        this.idKnjiga = idKnjiga;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "idKnjiga=" + idKnjiga +
                ", naslov='" + naslov + '\'' +
                ", avtor='" + avtor + '\'' +
                ", isbn=" + isbn +
                ", zalozba='" + zalozba + '\'' +
                ", letoIzdaje=" + letoIzdaje +
                ", prevod='" + prevod + '\'' +
                ", ilustracije='" + ilustracije + '\'' +
                ", lokacija='" + lokacija + '\'' +
                ", zanr='" + zanr + '\'' +
                ", publika='" + publika + '\'' +
                ", navoljo='" + navoljo + '\'' +
                '}';
    }
}
