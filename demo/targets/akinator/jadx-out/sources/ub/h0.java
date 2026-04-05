package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum h0 implements ic.k {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;


    /* renamed from: b, reason: collision with root package name */
    public final int f88231b = 1 << ordinal();

    h0() {
    }

    @Override // ic.k
    public boolean enabledByDefault() {
        return false;
    }

    @Override // ic.k
    public boolean enabledIn(int i10) {
        return (i10 & this.f88231b) != 0;
    }

    @Override // ic.k
    public int getMask() {
        return this.f88231b;
    }
}
