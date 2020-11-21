/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan55handphoneoo;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF-1
 * 10119024
 */
public class Android extends Handphone {
    private String keyStore;
    
    public Android(String man, String os, String model, int harga, String keyStore) {
        super(man, os, model, harga);
        this.keyStore = keyStore;
    }
    
    public String getKeyStore() {
        return this.keyStore;
    }
    
    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}
