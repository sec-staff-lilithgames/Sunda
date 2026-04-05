package nh;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class si extends pi implements SortedSet {
    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        Comparator<Object> comparator;
        synchronized (this.f76516c) {
            comparator = c().comparator();
        }
        return comparator;
    }

    @Override // nh.pi
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet c() {
        return (SortedSet) super.c();
    }

    @Override // java.util.SortedSet
    public Object first() {
        Object objFirst;
        synchronized (this.f76516c) {
            objFirst = c().first();
        }
        return objFirst;
    }

    public SortedSet<Object> headSet(Object obj) {
        si siVar;
        synchronized (this.f76516c) {
            siVar = new si(c().headSet(obj), this.f76516c);
        }
        return siVar;
    }

    @Override // java.util.SortedSet
    public Object last() {
        Object objLast;
        synchronized (this.f76516c) {
            objLast = c().last();
        }
        return objLast;
    }

    public SortedSet<Object> subSet(Object obj, Object obj2) {
        si siVar;
        synchronized (this.f76516c) {
            siVar = new si(c().subSet(obj, obj2), this.f76516c);
        }
        return siVar;
    }

    public SortedSet<Object> tailSet(Object obj) {
        si siVar;
        synchronized (this.f76516c) {
            siVar = new si(c().tailSet(obj), this.f76516c);
        }
        return siVar;
    }
}
