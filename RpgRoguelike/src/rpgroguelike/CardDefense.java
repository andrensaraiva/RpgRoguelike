/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

/**
 *
 * @author asaraiva
 */
public class CardDefense extends Card {

    public CardDefense(String name, int mana, int power, Effect effect) {
        super(name, mana, power, effect);
    }
    
    @Override
    public void UseCard(Enemy enemy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ShowStats() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
