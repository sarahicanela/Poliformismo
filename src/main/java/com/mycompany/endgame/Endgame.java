/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author LAPONE
 */
public class Endgame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("Black Panter","Ser el rey de todo wakanda","Garras de Vibranium");
        Villano galactus=new Villano("Galactus","Devorar mundos","usa de chalán a Silver Surfer");
        Avenger ironMan=new Avenger("Tony Stark","Genio,filantropo,multimillonario,playboy","Mark 42","Prime");
        Thanos thanos=new Thanos("Thanos","El titám loco","Ejercito Chitaury","Gemas del infinito");
        
        //aplicando el polimorfismo
        
        Personaje[]personajes={blackPanter, galactus, ironMan,thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
            
            //método específico de avenger
            ((Avenger)ironMan).reunirse();
            //ejemplo método específico de thanos
            thanos.chasquearDedos();
        }
    }
}
