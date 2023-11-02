/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasOverrideInheritance;

import TugasInheritance.*;

/**
 *
 * @author X1
 */
public class main {
public static void main(String[] args) {
        Animals hewan = new Animals();
        
        //contoh dengan override
        anjing anjing = new anjing();
        anjing.bersuara("Doggy");
        
        //contoh tanpa override
        hewanbersuara("Katty");
        kucing kucing = new kucing();
        kucing.suara();
        
        hewanbersuara("goat");        
        kambing kambing = new kambing();
        kambing.suara();
        
        serigala serigala = new serigala();
        serigala.bersuara("Wolfy");

        hewanbersuara("Lion");        
        Singa singa = new Singa();
        singa.bersuara();
    }    

    private static void hewanbersuara(String katty) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void singasuara() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}