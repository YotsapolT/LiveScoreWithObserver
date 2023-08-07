/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescorewithobserver;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tong
 */
public class HeadQuater {
    private ArrayList<myObserver> obsList;
    private String LiveScore;
    
    public HeadQuater(){
        obsList = new ArrayList<myObserver>();
    }
    public void register(myObserver observer){
        obsList.add(observer);
    }
    
    public void notifyObservers(){
        for (int i = 0; i < obsList.size(); i++){
            obsList.get(i).update(this);
        }
    }
    
    public String getLiveScore(){
        return LiveScore;
    }
    
    public void setLiveScore(){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score ");
            String newScore = in.nextLine();
            if(newScore.equals("")){
                break;
            }
            LiveScore = newScore;
            notifyObservers();
        }
    }
}
