package si.feri.knjiznica.Razredi;
import java.util.ArrayList;
import java.util.List;

public class Uporabnik {
    private int idUporabnik;
    private String ime;
    private String priimek;
    private String upIme;
    private String geslo;
    private String email;
    private int tk_idNaslov;
    public boolean pravilno;
    private List<Knjiga> izposojeneKnjige = new ArrayList<>();
    private Naslov naslov;

    public Uporabnik(int idUporabnik, String ime, String priimek, String upIme, String geslo, String email, int tk_idNaslov) {
        this.idUporabnik = idUporabnik;
        this.ime = ime;
        this.priimek = priimek;
        this.upIme = upIme;
        this.geslo = geslo;
        this.email = email;
        this.tk_idNaslov = tk_idNaslov;
    }

    public Uporabnik() {

    }



    public void dodajKnjigo(Knjiga knjiga) {
        izposojeneKnjige.add(knjiga);
    }

    public List<Knjiga> getIzposojeneKnjige() {
        return izposojeneKnjige;
    }

    public void setIzposojeneKnjige(List<Knjiga> izposojeneKnjige) {
        this.izposojeneKnjige = izposojeneKnjige;
    }

    public int getIdUporabnik() {
        return idUporabnik;
    }

    public void setIdUporabnik(int idUporabnik) {
        this.idUporabnik = idUporabnik;
    }

    public Naslov getNaslov() {
        return naslov;
    }

    public void setNaslov(Naslov naslov) {
        this.naslov = naslov;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public String getUpIme() {
        return upIme;
    }

    public void setUpIme(String upIme) {
        this.upIme = upIme;
    }

    public String getGeslo() {
        return geslo;
    }

    public void setGeslo(String geslo) {
        this.geslo = geslo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTk_idNaslov() {
        return tk_idNaslov;
    }

    public void setTk_idNaslov(int tk_idNaslov) {
        this.tk_idNaslov = tk_idNaslov;
    }

    public boolean getPravilno(){return pravilno; }

    public void setPravilno(boolean p){this.pravilno=p;}
}
