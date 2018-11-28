/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damin;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AlgoK_Medoid {
    
    public ArrayList<DataObject> listDataObjectTraining = new ArrayList<DataObject>();
    public ArrayList<DataObject> listDataObjectTesting = new ArrayList<DataObject>();
    
    private double data_Kmedoid[] = new double[44];
    private String data_kelas[] = new String[44];
    
    public AlgoK_Medoid() {
        
    }
   
//    public void inputDataTraining(double atr1, double atr2, double atr3, double atr4, String kelas) {
//        listDataObjectTraining.add(new DataObject(atr1, atr2, atr3, atr4, kelas));
//    }
    
    public void inputDataTesting(double atr1, double atr2, double atr3, double atr4, double atr5, String kelas) {
        listDataObjectTesting.add(new DataObject(atr1, atr2, atr3, atr4, atr5, kelas));
    }
    
    public void normalisasi() {
        double maxAtr1 = 0;
        double maxAtr2 = 0;
        double maxAtr3 = 0;
        double maxAtr4 = 0;
        double maxAtr5 = 0;
        
        for (int i=0; i < 19; i++) {
            if (listDataObjectTesting.get(i).getAtr1() > maxAtr1) {
                maxAtr1 = listDataObjectTesting.get(i).getAtr1(); 
            }
            if (listDataObjectTesting.get(i).getAtr2() > maxAtr2) {
                maxAtr2 = listDataObjectTesting.get(i).getAtr2(); 
            }
            if (listDataObjectTesting.get(i).getAtr3() > maxAtr3) {
                maxAtr3 = listDataObjectTesting.get(i).getAtr3(); 
            }
            if (listDataObjectTesting.get(i).getAtr4() > maxAtr4) {
                maxAtr4 = listDataObjectTesting.get(i).getAtr4(); 
            }
            if (listDataObjectTesting.get(i).getAtr5() > maxAtr5) {
                maxAtr5 = listDataObjectTesting.get(i).getAtr5(); 
            }
        } 
        
        double normAtr1, normAtr2, normAtr3, normAtr4, normAtr5;
        for (int j=0; j < 19; j++) {
            normAtr1 = listDataObjectTesting.get(j).getAtr1() / maxAtr1;
            listDataObjectTesting.get(j).setAtr1(normAtr1);
            normAtr2 = listDataObjectTesting.get(j).getAtr2() / maxAtr2;
            listDataObjectTesting.get(j).setAtr2(normAtr2);
            normAtr3 = listDataObjectTesting.get(j).getAtr3() / maxAtr3;
            listDataObjectTesting.get(j).setAtr3(normAtr3);
            normAtr4 = listDataObjectTesting.get(j).getAtr4() / maxAtr4;
            listDataObjectTesting.get(j).setAtr4(normAtr4);
            normAtr5 = listDataObjectTesting.get(j).getAtr5() / maxAtr5;
            listDataObjectTesting.get(j).setAtr5(normAtr5);
        }
        
    }
    
    public void k_medoid() {
        normalisasi();
        for (int i=0; i < 19; i++) {
//            double sum = (listDataObjectTesting.get(i).getAtr1()) + (listDataObjectTesting.get(i).getAtr2());
//            
//            data_Kmedoid[i] = sum;
            
            System.out.println(listDataObjectTesting.get(i).getAtr5());
        }
        
        
        
    }  
}
