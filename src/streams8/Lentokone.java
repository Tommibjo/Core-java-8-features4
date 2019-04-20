/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams8;

/**
 *
 * @author tommib
 */
public class Lentokone {

    private String koneenNimi;
    private int koneenID;
    private int istumaPaikkoja;

    public Lentokone() {
    }

    public Lentokone(int koneenID, int istumaPaikkoja) {
        this.koneenID = koneenID;
        this.istumaPaikkoja = istumaPaikkoja;
    }

    public int getKoneenID() {
        return koneenID;
    }

    public void setKoneenID(int koneenID) {
        this.koneenID = koneenID;
    }

    public int getIstumaPaikkoja() {
        return istumaPaikkoja;
    }

    public void setIstumaPaikkoja(int istumaPaikkoja) {
        this.istumaPaikkoja = istumaPaikkoja;
    }

    public String getKoneenNimi() {
        return koneenNimi;
    }

    public void setKoneenNimi(String koneenNimi) {
        this.koneenNimi = koneenNimi;
    }
    
    public int compareByName(Lentokone a, Lentokone b){
        return a.koneenNimi.compareTo(b.koneenNimi);
    }

    @Override
    public String toString() {
        return "Lentokone{" + "koneenID=" + koneenID + ", istumaPaikkoja=" + istumaPaikkoja + '}';
    }

}
