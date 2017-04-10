package org.japo.java.app;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import org.japo.java.lib.Info;
import org.japo.java.lib.UtilesArrays;
//@author 2K16 - Angel Pastelero angel.pastelero399@gmail.com
public class App {
    //
    //
    private static final String ARCHIVO = "config.properties";
    public void lanzarAplicacion() {

        
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        Random rnd = new Random();
        
        
        
        try (FileReader fr = new FileReader(ARCHIVO)) {
            Properties p = new Properties();
            p.load(fr);
            
            String pMin = p.getProperty("min");
            String pMay = p.getProperty("may");
            String pDig = p.getProperty("dig");
            String pSim = p.getProperty("sim");
            
            char[] min = pMin.toCharArray();
            char[] may = pMay.toCharArray();
            char[] dig = pDig.toCharArray();
            char[] sim = pSim.toCharArray();
            
            System.out.println("GENERADOR DE CONTRASEÑAS 2K17");
            System.out.println("=============================");
            
            int longitud = Info.obtenerInt("Longitud ...: ");
            char[] passCar = new char[longitud];
            
            passCar[0] = min[rnd.nextInt(min.length)];
            passCar[1] = may[rnd.nextInt(may.length)];
            passCar[2] = dig[rnd.nextInt(dig.length)];
            passCar[3] = sim[rnd.nextInt(sim.length)];
            
            
            char[] bombo = (pMin + pMay + pDig + pSim).toCharArray();
            
            for (int i = 4; i < passCar.length; i++) {
                
                passCar[i] = bombo[rnd.nextInt(bombo.length)];
                
            }
            
            for (int i = 0; i < passCar.length; i++) {
                int posRnd = rnd.nextInt(passCar.length);
                char valorAct = passCar[i];
                passCar[i] = passCar[posRnd];
                passCar[posRnd]  = valorAct;
                
            }
            
            String password = new String(passCar);
            System.out.printf("Password ...: %s\n", password);
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        
        
        
    }
}