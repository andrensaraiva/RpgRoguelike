/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

/**
 *
 * @author asaraiva
 */
public class CardAttack extends Card{
    
    public CardAttack(String name, int mana, int power, Effect effect){
        super(name,mana,power,effect);
    }
    
    @Override
    public void UseCard(Enemy enemy) {
       enemy.TakeDamage(getPower());
         System.out.println("Você causou " + getPower() + " ao inimigo. HP atual inimigo: " + enemy.getActualHealth());
    }

    @Override
    public void ShowStats() {
        System.out.println("Name: " + getName() + " | Power: " + getPower() + " | Mana: " + getMana() + " | + Effect: ");
        System.out.println("Essa carta APLICA dano ao inimigo");
    }
    
}
