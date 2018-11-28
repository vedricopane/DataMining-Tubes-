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
public class DAMIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlgoK_Medoid medo = new AlgoK_Medoid();
        
        medo.inputDataTesting(1777.35, 268.38, 389.77, 118.05, 234.14, "NEGATIVE");
        medo.inputDataTesting(1434.78, 310.03, 1779.99, 169.87, 235.86, "POSITIVE");
        medo.inputDataTesting(827.24, 293.07, 164.73, 139.94, 288.11, "NEGATIVE");
        medo.inputDataTesting(1196.64, 188.55, 723.4, 207.16, 196.34, "POSITIVE");
        medo.inputDataTesting(607.8, 278.95, 361.31, 71.63, 89.72, "NEGATIVE");
        medo.inputDataTesting(254.4, 303.99, 1386.82, 52.77, 97.16, "POSITIVE");
        medo.inputDataTesting(1832.5, 269.26, 154.06, 74.47, 158.16, "NEGATIVE");
        medo.inputDataTesting(590.62, 415.64, 1781.32, 101.24, 141.78, "POSITIVE");
        medo.inputDataTesting(2080.17, 397.39, 380.6, 108.99, 338.56, "NEGATIVE");
        medo.inputDataTesting(551.55, 605.86, 2514.77, 91.79, 140.81, "POSITIVE");
        medo.inputDataTesting(4558.77, 1146.29,	333.18,	61.24, 1327.65,	"NEGATIVE");
        medo.inputDataTesting(1860.13, 369.3, 3321.15, 147.27, 264.02, "POSITIVE");
        medo.inputDataTesting(694.02, 184.96, 494.25, 109.61, 308.69, "NEGATIVE");
        medo.inputDataTesting(830.26, 132.35, 1491.05, 104.22, 240.93, "POSITIVE");
        medo.inputDataTesting(1100.94, 292.78, 543.47, 169.06, 225.81, "NEGATIVE");
        medo.inputDataTesting(1183.31, 155.08, 314.35, 113.49, 91.86, "POSITIVE");
        medo.inputDataTesting(1198.69, 65.22, 111.71, 70.18, 154.86, "NEGATIVE");
        medo.inputDataTesting(638.23, 78.39, 258.27, 46.64, 94.7, "POSITIVE");
        medo.inputDataTesting(957.16, 197.99, 125.09, 72.02, 167.95, "NEGATIVE");
        
        medo.k_medoid();
        
    }
    
}
