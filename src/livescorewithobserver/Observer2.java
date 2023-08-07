/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescorewithobserver;

/**
 *
 * @author Tong
 */
public class Observer2 implements myObserver{
    @Override
    public void update(HeadQuater h){
        System.out.println("(from obs2) live result: " + h.getLiveScore());
    }
}
