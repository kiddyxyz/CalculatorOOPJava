/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author Kiddy
 */
public class Operation {
    public String hasil = "0";
    private float angka_pertama;
    private float angka_kedua;

    public void setAngka_kedua(float angka_kedua) {
        this.angka_kedua = angka_kedua;
    }
    
    public float getAngka_kedua() {
        return angka_kedua;
    }

    public void setAngka_pertama(float angka_pertama) {
        this.angka_pertama = angka_pertama;
    }

    public float getAngka_pertama() {
        return angka_pertama;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getHasil() {
        return hasil;
    }
    
    public void kali(float a, float b){
        float hasil = a * b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void kali(int a, int b){
         int hasil = a * b;
         String total = hasil + "";
         setHasil(total);
    }
    
    public void tambah(float a, float b){
        float hasil = a + b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void tambah(int a, int b){
        int hasil = a + b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void bagi(float a, float b){
        float hasil = a / b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void bagi(int a, int b){
        int hasil = a / b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void kurang(float a, float b){
        float hasil = a - b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void kurang(int a, int b){
        int hasil = a - b;
        String total = hasil + "";
        setHasil(total);
    }
}
