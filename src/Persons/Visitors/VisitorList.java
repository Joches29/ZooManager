/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import Lists.List;
import java.util.Arrays;

/**
 *
 * @author autoa
 */
public class VisitorList implements List <Visitor>{
    private Visitor[] list = new Visitor[200];
    
    @Override
    public boolean add(Visitor t) {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i]==null){
                list[i]=t;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean remove(Visitor t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == t) {
                list[i] = null;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Visitor find(Object id) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                return list[i];
            }
        }
        return null;
    }
    
    @Override
    public void showAll() {
        Arrays.toString(list);
    }
}
