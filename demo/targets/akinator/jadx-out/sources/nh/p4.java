package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p4 extends b5 {
    @Override // nh.b5, nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return ((cf) this).f76158e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ((cf) this).f76158e.isEmpty();
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        ((cf) this).f76158e.getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return ((cf) this).f76158e.size();
    }
}
