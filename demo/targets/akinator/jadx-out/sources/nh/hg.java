package nh;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class hg extends gg implements SortedSet {
    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return ((SortedSet) this.f76617b).comparator();
    }

    @Override // java.util.SortedSet
    public Object first() {
        return z7.find(this.f76617b.iterator(), this.f76618c);
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> headSet(Object obj) {
        return new hg(((SortedSet) this.f76617b).headSet(obj), this.f76618c);
    }

    public Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f76617b;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f76618c.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return new hg(((SortedSet) this.f76617b).subSet(obj, obj2), this.f76618c);
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> tailSet(Object obj) {
        return new hg(((SortedSet) this.f76617b).tailSet(obj), this.f76618c);
    }
}
