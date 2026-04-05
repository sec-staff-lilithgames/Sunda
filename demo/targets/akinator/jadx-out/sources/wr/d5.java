package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d5 implements e5 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f90876a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f90877b;

    public d5(Object obj, Object obj2) {
        this.f90876a = obj;
        this.f90877b = obj2;
    }

    @Override // wr.e5
    public Object get(Object obj, int i10, int i11) {
        if (this.f90876a == obj) {
            return this.f90877b;
        }
        return null;
    }

    @Override // wr.e5
    public e5 put(Object obj, Object obj2, int i10, int i11) {
        Object obj3 = this.f90876a;
        int iHashCode = obj3.hashCode();
        return iHashCode != i10 ? c5.a(new d5(obj, obj2), i10, this, iHashCode, i11) : obj3 == obj ? new d5(obj, obj2) : new b5(new Object[]{obj3, obj}, new Object[]{this.f90877b, obj2});
    }

    @Override // wr.e5
    public int size() {
        return 1;
    }

    public String toString() {
        return String.format("Leaf(key=%s value=%s)", this.f90876a, this.f90877b);
    }
}
