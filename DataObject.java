/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damin;

/**
 *
 * @author user
 */
public class DataObject {
    
    private double atr1, atr2, atr3, atr4, atr5;
    private String kelas;

    public DataObject(double atr1, double atr2, double atr3, double atr4, double atr5, String kelas) {
        this.atr1 = atr1;
        this.atr2 = atr2;
        this.atr3 = atr3;
        this.atr4 = atr4;
        this.atr5 = atr5;
        this.kelas = kelas;
    }

    DataObject(double atr1, double atr2, double atr3, double atr4, String kelas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getAtr1() {
        return atr1;
    }

    public void setAtr1(double atr1) {
        this.atr1 = atr1;
    }

    public double getAtr2() {
        return atr2;
    }

    public void setAtr2(double atr2) {
        this.atr2 = atr2;
    }

    public double getAtr3() {
        return atr3;
    }

    public void setAtr3(double atr3) {
        this.atr3 = atr3;
    }

    public double getAtr4() {
        return atr4;
    }

    public void setAtr4(double atr4) {
        this.atr4 = atr4;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public double getAtr5() {
        return atr5;
    }

    public void setAtr5(double atr5) {
        this.atr5 = atr5;
    }
    
    
}
