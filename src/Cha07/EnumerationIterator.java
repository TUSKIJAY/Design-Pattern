package Cha07;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
    Enumeration enu;

    public EnumerationIterator(Enumeration enu){
        this.enu = enu;
    }
    @Override
    public boolean hasNext() {
        return enu.hasMoreElements();
    }

    @Override
    public Object next() {
        return enu.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
