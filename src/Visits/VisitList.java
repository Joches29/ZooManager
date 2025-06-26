/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import Lists.List;
import java.util.Arrays;

/**
 *
 * @author rodol
 */
public class VisitList implements List <Visit> {
    private Visit[] visitas;

    @Override
   public boolean add(Visit t) {
        int max = visitas.length;
        for (int i = 0; i < max; i++) {
            if(visitas[i]==null){
                visitas[i]=t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Visit t) {
        for (int i = 0; i < visitas.length; i++) {
            if (visitas[i] == t) {
                visitas[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Visit find(Object id) {
        String idt = id.toString();
        for (int i = 0; i < visitas.length; i++) {
            if (visitas[i].getVisitor().getId().equalsIgnoreCase(idt)) {
                return visitas[i];
            }
        }
        return null;
    }

    @Override
    public void showAll() {
        Arrays.toString(visitas);
    }
}
