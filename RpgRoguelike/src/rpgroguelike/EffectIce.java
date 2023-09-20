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

    @Override
    public void ApplyEffect(Character character) {
        character.setTotalMana(character.getTotalMana() - getPower());
    }
    
}
