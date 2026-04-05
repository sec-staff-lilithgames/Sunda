package nh;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o0 extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f76518b = new o0();

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return 0;
    }

    @Override // nh.we
    public <E> b5 immutableSortedCopy(Iterable<E> iterable) {
        return b5.copyOf(iterable);
    }

    @Override // nh.we
    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        return p8.newArrayList(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }

    @Override // nh.we
    public <S> we reverse() {
        return this;
    }
}
