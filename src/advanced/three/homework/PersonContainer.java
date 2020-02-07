/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.three.homework;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author Zana
 */
public class PersonContainer implements Iterable<Person> {

    @Override
    public Iterator<Person> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(Consumer<? super Person> action) {
        Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }

    
}
