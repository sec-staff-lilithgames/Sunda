package nh;

import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f8 extends AbstractList {

    /* renamed from: b, reason: collision with root package name */
    public final List f76256b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76257c;

    public f8(List list, int i10) {
        this.f76256b = list;
        this.f76257c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f76256b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return qh.f.divide(this.f76256b.size(), this.f76257c, RoundingMode.CEILING);
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Object> get(int i10) {
        mh.p1.checkElementIndex(i10, size());
        int i11 = this.f76257c;
        int i12 = i10 * i11;
        List list = this.f76256b;
        return list.subList(i12, Math.min(i11 + i12, list.size()));
    }
}
