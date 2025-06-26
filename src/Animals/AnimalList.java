/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;
import Lists.List;
import java.util.Arrays;
/**
 *
 * @author llean
 */
public class AnimalList implements List <Animal> {
   private Animal list[];
   
   public boolean add(Animal t) {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i]==null){
                list[i]=t;
                return true;
            }
        }
        return false;
    }
    
    public boolean remove(Animal t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == t) {
                list[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public void showAll() {
        Arrays.toString(list);
    }
    
    public Animal find(Object id) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                return list[i];
            }
        }
        return null;
    }
    
}
