package edu.effectivejava.item18;

import java.util.Collection;
import java.util.Set;

/**
 * Exemplo retirado do livro Effective Java 3rd edition,<br>
 * Item 18 - Prefira a composição à herança <br>
 * <p>
 * A classe InstrumentedSet é conhecida como uma classe wrapper porque cada instância InstrumentedSet contém outra instância Set.
 * Isso também é conhecido como padrão Decorator[Gamma95] porque a classe InstrumentedSet "decora" um set ao adicionar a instrumentação (addCount).
 *
 * @author frfontoura
 * @version 1.0 03/03/2020
 */
public class InstrumentedSet<E> extends FowardingSet<E> {

    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
