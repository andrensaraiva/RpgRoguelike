/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

import java.util.ArrayList;

/**
 *
 * @author asaraiva
 */
public class Character {
    private String name;
    private int totalMana,actualMana;
    private int totalHealth,actualHealth;
    private ArrayList<Card> deck;
    private ArrayList<Effect> onEffect;
    
    public Character(){}
    
    public Character(String name, int totalMana, int totalHealth){
        this.name = name;
        this.totalHealth = totalHealth;
        this.totalMana = totalMana;
        this.deck = new ArrayList<>();
        this.actualHealth = totalHealth;
        this.actualMana = totalMana;
        this.onEffect = new ArrayList<>();
    }

    public void UseCard(int selectedCard, Enemy enemy){
        deck.get(selectedCard).UseCard(enemy);
    }
    public void TakeDamage(int damage){
        setActualHealth(-damage);
        if(actualHealth <= 0){
            System.out.println("GAME OVER");
        }
    }
    
    public void ApplyEffect(){
        
    }
        public void ShowStats() {
      System.out.print("Seu nome é: " + getName() + ", você possui " + getActualHealth()+ " de VIDA e " + getActualMana() + " de MANA.");
            for (int i = 0; i < getDeck().size(); i++) {
                System.out.print("\n Carta "+ (i+1)+": " + deck.get(i).getName()+ ", mana: " + deck.get(i).getMana() + ", poder: " + 
                        deck.get(i).getPower() + ", efeito: ");        
                if(deck.get(i).getEffect() != null){
                        System.out.print(deck.get(i).getEffect().getName());
                }else{
                    System.out.print("Não Possui");
                }
            }
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
     * @return the totalMana
     */
    public int getTotalMana() {
        return totalMana;
    }

    /**
     * @param totalMana the totalMana to set
     */
    public void setTotalMana(int totalMana) {
        this.totalMana = totalMana;
    }

    /**
     * @return the actualMana
     */
    public int getActualMana() {
        return actualMana;
    }

    /**
     * @param actualMana the actualMana to set
     */
    public void setActualMana(int actualMana) {
        this.actualMana = actualMana;
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
     * @return the deck
     */
    public ArrayList<Card> getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    /**
     * @return the onEffect
     */
    public ArrayList<Effect> getOnEffect() {
        return onEffect;
    }

    /**
     * @param onEffect the onEffect to set
     */
    public void setOnEffect(ArrayList<Effect> onEffect) {
        this.onEffect = onEffect;
    }
    
    
    
    
}
