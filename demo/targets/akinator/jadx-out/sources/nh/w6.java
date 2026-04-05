package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w6 extends l6 {
    @Override // nh.u4
    public final int a(int i10, Object[] objArr) {
        return asList().a(i10, objArr);
    }

    public abstract Object get(int i10);

    @Override // nh.l6
    public final b5 h() {
        return new v6(this);
    }

    @Override // nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return asList().iterator();
    }
}
