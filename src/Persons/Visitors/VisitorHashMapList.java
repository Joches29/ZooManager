/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import Lists.List;
import java.util.HashMap;

/**
 *
 * @author rodol
 */
public class VisitorHashMapList implements List<Visitor> {

    HashMap<String, Visitor> map;

    public VisitorHashMapList() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean add(Visitor t) {
        if (map.containsKey(t.getId())) {
            return false;
        }
        map.put(t.getId(), t);
        return true;
    }

    @Override
    public boolean remove(Visitor t) {
        if (!map.containsKey(t.getId())) {
            return false;
        }
        map.remove(t.getId());
        return true;
    }

    @Override
    public Visitor find(Object id) {
        return map.get(String.valueOf(id));
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // se usa para el loadTable en DiaSearchVisitor
    public HashMap<String, Visitor> getMap() {
        return map;
    }

}
