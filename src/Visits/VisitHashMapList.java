/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import Lists.List;
import java.util.HashMap;

/**
 *
 * @author rodol
 */
public class VisitHashMapList implements List <Visit> {

    HashMap<String, Visit> map;

    public VisitHashMapList() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean add(Visit t) {
        if (map.containsKey(t.getVisitor().getId())) {
            return false;
        }
        map.put(t.getVisitor().getId(), t);
        return true;
    }

    @Override
    public boolean remove(Visit t) {
        if (!map.containsKey(t.getVisitor().getId())) {
            return false;
        }
        map.remove(t.getVisitor().getId());
        return true;
    }

    @Override
    public Visit find(Object id) {
        return map.get(String.valueOf(id));
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public HashMap<String, Visit> getMap() {
        return map;
    }
    
}
