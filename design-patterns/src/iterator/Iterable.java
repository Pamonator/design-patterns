/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Iterator;

/**
 *
 * @author a1402072
 * @param <E>
 */
public interface Iterable<E> {

    Iterator<E> iterator();

}
