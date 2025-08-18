/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;
import java.util.HashMap;

/**
 *
 * @author rodol
 */
public class GuideHashMapList implements List<Guide> {

    HashMap<String, Guide> map;

    public GuideHashMapList() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean add(Guide t) {
        if (map.containsKey(t.getId())) {
            return false;
        }
        map.put(t.getId(), t);
        return true;
    }

    @Override
    public boolean remove(Guide t) {
        if (!map.containsKey(t.getId())) {
            return false;
        }
        map.remove(t.getId());
        return true;
    }

    @Override
    public Guide find(Object id) {
        return map.get(String.valueOf(id));
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public HashMap<String, Guide> getMap() {
        return map;
    }

}
