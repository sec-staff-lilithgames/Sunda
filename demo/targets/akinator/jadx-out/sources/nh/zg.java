package nh;

import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum zg extends bh {
    public zg() {
        super("FIRST_AFTER", 3);
    }

    @Override // nh.bh
    public <E> int resultIndex(Comparator<? super E> comparator, E e10, List<? extends E> list, int i10) {
        return bh.f76139c.resultIndex(comparator, e10, list, i10) + 1;
    }
}
