/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgroguelike;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asaraiva
 */
public class GameplayManager {

    Scanner ler = new Scanner(System.in);
    private int andarAtual;
    private final ArrayList<Enemy> enemiesFloor01;
    private final ArrayList<Enemy> enemiesFloor02;
    private final ArrayList<Enemy> enemiesFloor03;
    private final ArrayList<Enemy> enemiesFloorBoss;

    private final ArrayList<Card> cards;

    private final ArrayList<Effect> effects;

    public GameplayManager() {
        andarAtual = 0;
        
        enemiesFloor01 = new ArrayList();
        enemiesFloor02 = new ArrayList();
        enemiesFloor03 = new ArrayList();
        enemiesFloorBoss = new ArrayList();

        cards = new ArrayList();

        effects = new ArrayList();
    }

    public void SeedGame(Character character) {
        EffectFire fE1 = new EffectFire("Ember", 1);
        EffectFire fE2 = new EffectFire("FlameTrower", 3);
        EffectFire fE3 = new EffectFire("Sun Fire", 5);

        EffectIce fI1 = new EffectIce("Ice Cube", 1);
        EffectIce fI2 = new EffectIce("Blizzard", 3);
        EffectIce fI3 = new EffectIce("Absolute Zero", 5);

        Enemy en1 = new Enemy("Slime", 10, 2, 1, null);
        Enemy en2 = new Enemy("Goblin", 7, 3, 1, null);
        Enemy en3 = new Enemy("Rat", 3, 5, 1, null);
        getEnemiesFloor01().add(en1);
        getEnemiesFloor01().add(en2);
        getEnemiesFloor01().add(en3);

        Enemy en4 = new Enemy("Slime Fire", 15, 3, 2, fE1);
        Enemy en5 = new Enemy("Goblin Warrior", 20, 8, 2, null);
        Enemy en6 = new Enemy("Giant Rat ", 18, 5, 2, null);
        getEnemiesFloor02().add(en4);
        getEnemiesFloor02().add(en5);
        getEnemiesFloor02().add(en6);

        Enemy en7 = new Enemy("Slime King", 30, 15, 3, null);
        Enemy en8 = new Enemy("Goblin Mage", 20, 20, 3, fI2);
        Enemy en9 = new Enemy("Fire Rat ", 25, 10, 3, fE2);
        getEnemiesFloor03().add(en7);
        getEnemiesFloor03().add(en8);
        getEnemiesFloor03().add(en9);

        Enemy en10 = new Enemy("Boss Ice Slime", 100, 50, 4, fI3);
        Enemy en11 = new Enemy("Inferno Goblin", 100, 50, 4, fE3);
        Enemy en12 = new Enemy("The Rat ", 200, 100, 4, fI1);
        getEnemiesFloorBoss().add(en10);
        getEnemiesFloorBoss().add(en11);
        getEnemiesFloorBoss().add(en12);

        CardAttack cA1 = new CardAttack("Punch", 1, 2, null);
        CardAttack cA2 = new CardAttack("Mini FireBall", 2, 1, fE1);
        CardAttack cA3 = new CardAttack("Ice Shard", 2, 1, fI1);
        CardAttack cA4 = new CardAttack("Hadouken", 3, 10, null);
        CardAttack cA5 = new CardAttack("FireBall", 5, 10, fI2);

        CardDefense cD1 = new CardDefense("Block", 1, 1, null);
        CardDefense cD2 = new CardDefense("Ice Wall", 3, 2, fI2);
        CardDefense cD3 = new CardDefense("Fire Wall", 3, 2, fE2);
        CardDefense cD4 = new CardDefense("God Hand", 5, 5, null);
        CardDefense cD5 = new CardDefense("Demon Hand", 5, 3, fE3);

        cards.add(cA1);
        cards.add(cA2);
        cards.add(cA3);
        cards.add(cA4);
        cards.add(cA5);
        cards.add(cD1);
        cards.add(cD2);
        cards.add(cD3);
        cards.add(cD4);
        cards.add(cD5);
        
        character.getDeck().add(cA1);
        character.getDeck().add(cA1);
        character.getDeck().add(cD1);
        character.getDeck().add(cD1);
        character.getDeck().add(cA2);
    
    }
    public void IniciarGame(Character character){
        System.out.println("Bem vindo ao ROGUELIKE JAVA");
        System.out.println("Aqui estão seus status");
        character.ShowStats();
        System.out.println("Você está no andar "+ getAndarAtual()+ "da torre JAVA, escolha uma opção abaixo: ");
        System.out.println("1 - Batalhar contra um Inimigo");
        System.out.println("2 - Subir de andar"); 
        System.out.println("3 - Ver Status"); 
        String escolha = ler.nextLine();
        switch(escolha){
            case "1":
                Batalhar(character);
                break;
            case "2":
                SubirAndar();
                break;
            case "3":
                character.ShowStats();
                break;
        }
    }
    public void Batalhar(Character character){
    
    }
    public void SubirAndar(){}

    /**
     * @return the enemiesFloor01
     */
    public ArrayList<Enemy> getEnemiesFloor01() {
        return enemiesFloor01;
    }

    /**
     * @return the enemiesFloor02
     */
    public ArrayList<Enemy> getEnemiesFloor02() {
        return enemiesFloor02;
    }

    /**
     * @return the enemiesFloor03
     */
    public ArrayList<Enemy> getEnemiesFloor03() {
        return enemiesFloor03;
    }

    /**
     * @return the enemiesFloorBoss
     */
    public ArrayList<Enemy> getEnemiesFloorBoss() {
        return enemiesFloorBoss;
    }

    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * @return the effects
     */
    public ArrayList<Effect> getEffects() {
        return effects;
    }

    /**
     * @return the andarAtual
     */
    public int getAndarAtual() {
        return andarAtual;
    }

    /**
     * @param andarAtual the andarAtual to set
     */
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

}
