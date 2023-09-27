/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

/**
 *
 * @author andre
 */
public class EffectIce extends Effect {

    public EffectIce(String name, int power){
        super(name,power);
    }
    
    @Override
    public void ApplyEffect(Character character) {
        character.setTotalMana(character.getTotalMana() - getPower());
    }

    @Override
    public void ShowStats() {
    }
    
}
