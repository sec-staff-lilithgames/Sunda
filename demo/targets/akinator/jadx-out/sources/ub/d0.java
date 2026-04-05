package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum d0 implements ic.k {
    DUPLICATE_PROPERTIES,
    /* JADX INFO: Fake field, exist only in values array */
    SCALARS_AS_OBJECTS,
    UNTYPED_SCALARS,
    /* JADX INFO: Fake field, exist only in values array */
    EXACT_FLOATS;


    /* renamed from: b, reason: collision with root package name */
    public final int f88205b = 1 << ordinal();

    d0() {
    }

    @Override // ic.k
    public boolean enabledByDefault() {
        return false;
    }

    @Override // ic.k
    public boolean enabledIn(int i10) {
        return (i10 & this.f88205b) != 0;
    }

    @Override // ic.k
    public int getMask() {
        return this.f88205b;
    }
}
