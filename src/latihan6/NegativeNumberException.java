/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 *
 * @author User
 */
public class NegativeNumberException extends Exception {
    
    private int bilangan;
    //default constructor
    NegativeNumberException(){
    }
    //constructor dengan parameter bertipe String
    NegativeNumberException(String pesan){
        super(pesan);
    }
    //connstructor dengan parameter bertipe String dan int
    NegativeNumberException(String pesan,int nilai, int bilangan ){
        super(pesan);
        bilangan = nilai;
    }

    NegativeNumberException(String bilangan_tidak_boleh_negatif, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getBilangan(int bilangan){
        return bilangan;
    } 

    String getBilangan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

   