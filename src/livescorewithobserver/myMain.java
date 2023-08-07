/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescorewithobserver;

/**
 *
 * @author Tong
 */
public class myMain {
    public static void main(String[] args){
        HeadQuater h = new HeadQuater();
        Observer1 obs1 = new Observer1();
        Observer2 obs2 = new Observer2();
        
        h.register(obs1);
        h.register(obs2);
        
        h.setLiveScore();
    }
}
