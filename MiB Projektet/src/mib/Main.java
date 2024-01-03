/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gustav, Neryse, Oskar
 */
public class Main {
    
    private static InfDB idb;

    public static void main(String[] args) throws InfException {
      try {
          //Skapar databasuppkoppling med korrekta uppgifter som parametrar
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
      new Inloggning(idb).setVisible(true);
      //Instansierar databasen för Valideringsklassen så den kan köra sqlfrågor
      new Validering(idb);
    }
}

