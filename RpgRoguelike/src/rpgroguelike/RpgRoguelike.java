/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpgroguelike;

import java.util.ArrayList;

/**
 *
 * @author asaraiva
 */
public class RpgRoguelike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameplayManager gm = new GameplayManager();
        Character player = new Character("Carlus", 5, 10);
        gm.SeedGame(player);
        gm.IniciarGame(player);
        gm.LoopGame(player);
        
    }  
}
