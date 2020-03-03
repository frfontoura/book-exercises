package edu.effectivejava.item18;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Exemplo retirado do livro Effective Java 3rd edition,<br>
 * Item 18 - Prefira a composição à herança <br>
 * @author frfontoura
 * @version 1.0 03/03/2020
 */
public class FowardingSet<E> implements Set<E> {

    private final Set<E> s;

    public FowardingSet(Set<E> s) {
        this.s = s;
    }

    @Override
    public int size() {
        return s.size();
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return s.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return s.iterator();
    }

    @Override
    public Object[] toArray() {
        return s.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return s.toArray(ts);
    }

    @Override
    public boolean add(E e) {
        return s.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return s.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return s.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return s.addAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return s.retainAll(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return s.removeAll(collection);
    }

    @Override
    public void clear() {
        s.clear();
    }
}
