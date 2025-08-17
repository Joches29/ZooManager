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
public class ZookeeperHashMapList implements List <Zookeeper> {

    HashMap<String, Zookeeper> map;

    public ZookeeperHashMapList() {
        this.map = new HashMap<>();
    }

    public HashMap<String, Zookeeper> getMap() {
        return map;
    }

    @Override
    public boolean add(Zookeeper t) {
        if (map.containsKey(t.getId())) {
            return false;
        }
        map.put(t.getId(), t);
        return true;
    }

    @Override
    public boolean remove(Zookeeper t) {
        if (!map.containsKey(t.getId())) {
            return false;
        }
        map.remove(t.getId());
        return true;
    }

    @Override
    public Zookeeper find(Object id) {
        return map.get(String.valueOf(id));
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
