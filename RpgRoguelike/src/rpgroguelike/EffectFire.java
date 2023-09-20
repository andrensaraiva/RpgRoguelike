/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

/**
 *
 * @author andre
 */
public class EffectFire extends Effect {

    public EffectFire(String name, int power){
        super(name,power);
    }
    
    @Override
    public void ApplyEffect(Character character) {
        character.TakeDamage(getPower());
    }

    @Override
    public void ShowStats() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
