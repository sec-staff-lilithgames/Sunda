package nh;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o4 extends m4 implements SortedSet {
    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return e().comparator();
    }

    public abstract SortedSet e();

    @Override // java.util.SortedSet
    public Object first() {
        return e().first();
    }

    public SortedSet<Object> headSet(Object obj) {
        return e().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return e().last();
    }

    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return e().subSet(obj, obj2);
    }

    public SortedSet<Object> tailSet(Object obj) {
        return e().tailSet(obj);
    }
}
