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
        enemy.setDamage(enemy.getDamage() - getPower());
         System.out.println("Você retirou " + getPower() + " do inimigo. Ataque atual inimigo: " + enemy.getDamage());
    }

    @Override
    public void ShowStats() {
        System.out.println("Name: " + getName() + " | Power: " + getPower() + " | Mana: " + getMana() + " | + Effect: ");
        System.out.println("Essa carta RETIRA dano ao inimigo");
    }

}
