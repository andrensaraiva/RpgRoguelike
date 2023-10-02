/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

/**
 *
 * @author asaraiva
 */
public abstract class Card {
    private String name;
    private int mana;
    private int power;
    Effect effect;
    private boolean canUse;
    
    public Card(){}
    
    public Card(String name, int mana, int power, Effect effect){
        this.name = name;
        this.mana = mana;
        this.power = power;
        this.effect = effect;
        this.canUse = true;
    }
    
    public abstract void UseCard(Enemy enemy);
    public abstract void ShowStats();
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * @param mana the mana to set
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * @return the effect
     */
    public Effect getEffect() {
        return effect;
    }

    /**
     * @param effect the effect to set
     */
    public void setEffect(Effect effect) {
        this.effect = effect;
    }
    
    
    
    
    
}
