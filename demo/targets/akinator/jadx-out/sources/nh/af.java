package nh;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface af {
    void add(ze zeVar);

    void addAll(Iterable<ze> iterable);

    void addAll(af afVar);

    Set<ze> asDescendingSetOfRanges();

    Set<ze> asRanges();

    void clear();

    af complement();

    boolean contains(Comparable comparable);

    boolean encloses(ze zeVar);

    boolean enclosesAll(Iterable<ze> iterable);

    boolean enclosesAll(af afVar);

    boolean equals(Object obj);

    int hashCode();

    boolean intersects(ze zeVar);

    boolean isEmpty();

    ze rangeContaining(Comparable comparable);

    void remove(ze zeVar);

    void removeAll(Iterable<ze> iterable);

    void removeAll(af afVar);

    ze span();

    af subRangeSet(ze zeVar);

    String toString();
}
