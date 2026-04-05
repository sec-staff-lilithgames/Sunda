package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f4 extends e4 implements List {
    @Override // java.util.List
    public void add(int i10, Object obj) {
        Collections.EMPTY_LIST.add(i10, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        return Collections.EMPTY_LIST.addAll(i10, collection);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || Collections.EMPTY_LIST.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i10) {
        return Collections.EMPTY_LIST.get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Collections.EMPTY_LIST.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return Collections.EMPTY_LIST.indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return Collections.EMPTY_LIST.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return Collections.EMPTY_LIST.listIterator();
    }

    @Override // java.util.List
    public Object remove(int i10) {
        return Collections.EMPTY_LIST.remove(i10);
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        return Collections.EMPTY_LIST.set(i10, obj);
    }

    @Override // java.util.List
    public List<Object> subList(int i10, int i11) {
        return Collections.EMPTY_LIST.subList(i10, i11);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i10) {
        return Collections.EMPTY_LIST.listIterator(i10);
    }
}
