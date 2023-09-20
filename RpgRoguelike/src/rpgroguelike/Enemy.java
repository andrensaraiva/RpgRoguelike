/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

import java.util.Random;

/**
 *
 * @author asaraiva
 */
public class Enemy {
    
    private String name;
    private int totalHealth, actualHealth;
    private int damage, level;
    private Effect effect;
    
    public Enemy() {
    }
    
    public Enemy(String name, int totalHealth, int damage, int level, Effect effect) {
        this.name = name;
        this.totalHealth = totalHealth;
        this.actualHealth = this.totalHealth;
        this.level = level;
        this.damage = damage * level;
        this.effect = effect;
    }
    
    public void AttackEnemy(Character character) {
        character.TakeDamage(this.damage);
        if (effect != null) {
            Random rnd = new Random();
            int x = rnd.nextInt(1, 3);
            if (x == 2) {
                character.getOnEffect().add(effect);
            }
        }
    }
    
    public void TakeDamage(int damage) {
        setActualHealth(getActualHealth() - damage);
        if (getActualHealth() <= 0) {
            DeathEnemy();
        }
    }
    
    public void DeathEnemy() {
    }

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
     * @return the totalHealth
     */
    public int getTotalHealth() {
        return totalHealth;
    }

    /**
     * @param totalHealth the totalHealth to set
     */
    public void setTotalHealth(int totalHealth) {
        this.totalHealth = totalHealth;
    }

    /**
     * @return the actualHealth
     */
    public int getActualHealth() {
        return actualHealth;
    }

    /**
     * @param actualHealth the actualHealth to set
     */
    public void setActualHealth(int actualHealth) {
        this.actualHealth = actualHealth;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
    
}
