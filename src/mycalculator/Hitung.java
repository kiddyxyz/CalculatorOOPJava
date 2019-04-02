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
class Hitung extends Log {
  
    public String kali(Operation op){
        float hasil = op.getAngka_pertama() * op.getAngka_kedua();
        String total = hasil + "";
        
        // Logging
        writeLog("kali");
        
        return total;
    }
    
    public String tambah(Operation op){
        float hasil = op.getAngka_pertama() + op.getAngka_kedua();
        String total = hasil + "";
        
        // Logging
        writeLog("tambah");
        
        return total;
    }
    
    public String bagi(Operation op){
        float hasil = op.getAngka_pertama() / op.getAngka_kedua();
        String total = hasil + "";
        
        // Logging
        writeLog("bagi");
        
        return total;
    }
    
    public String kurang(Operation op){
        float hasil = op.getAngka_pertama() - op.getAngka_kedua();
        String total = hasil + "";
        
        // Logging
        writeLog("kurang");
        
        return total;
    }

    @Override
    public void writeLog(String log) {
        System.out.println("Operasi " + log + " telah dijalankan");
    }
}
