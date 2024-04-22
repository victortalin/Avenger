/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class Endgame {

    public static void main(String[] args) {
       Heroe blackPanter=new Heroe("Black Panter grrr","Ser el rey de todo wakanda","Garras de Vibranium");
       Villano galactus=new Villano("Galactus","Devorar mundos","usa de chalan a silver surfer");
       Avenger ironMan=new Avenger("Tony Stark","Genio,Filantropo,multimillonario,playboy","Mark 42"," Prime");
       Thanos thanos=new Thanos("Thanos","El titan loco","Ejercito Chitaury"," Gemas del infinito");
       
         //aplicando poliformismo
               
    Personaje[] personajes={blackPanter,galactus,ironMan,thanos};
    for(Personaje personaje:personajes){
        personaje.atacar();
    }
    
    //metodo especifico de avenger
    ((Avenger)ironMan).reunirse();
    
    
    //ejemplo metodo especifico de thanos
    thanos.chasquearDedos();
    
   }

}