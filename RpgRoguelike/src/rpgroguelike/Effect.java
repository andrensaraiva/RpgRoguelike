/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

/**
 *
 * @author asaraiva
 */
public abstract class  Effect {
    private String name;
    private int power;
    
    public Effect(){}
    
    public Effect(String name, int power){
        this.name = name;
        this.power = power;
    }
    
    public abstract void ApplyEffect(Character character);

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
    
    
}
