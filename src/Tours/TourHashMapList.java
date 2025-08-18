/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tours;

import Lists.List;
import java.util.HashMap;

/**
 *
 * @author rodol
 */
public class TourHashMapList implements List<Tour> {

    HashMap<String, Tour> map;

    public TourHashMapList() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean add(Tour t) {
        if (map.containsKey(t.getGuide().getId())) {
            return false;
        }
        map.put(t.getGuide().getId(), t);
        return true;
    }

    @Override
    public boolean remove(Tour t) {
        if (!map.containsKey(t.getGuide().getId())) {
            return false;
        }
        map.remove(t.getGuide().getId());
        return true;
    }

    @Override
    public Tour find(Object id) {
        return map.get(String.valueOf(id));
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public HashMap<String, Tour> getMap() {
        return map;
    }

}
