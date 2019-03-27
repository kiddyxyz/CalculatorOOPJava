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
public class Hitung {
   
    public String kali(Operation op){
        float hasil = op.getAngka_pertama() * op.getAngka_kedua();
        String total = hasil + "";
        return total;
    }
    
    public String tambah(Operation op){
        float hasil = op.getAngka_pertama() + op.getAngka_kedua();
        String total = hasil + "";
        return total;
    }
    
    public String bagi(Operation op){
        float hasil = op.getAngka_pertama() / op.getAngka_kedua();
        String total = hasil + "";
        return total;
    }
    
    public String kurang(Operation op){
        float hasil = op.getAngka_pertama() - op.getAngka_kedua();
        String total = hasil + "";
        return total;
    }
}
