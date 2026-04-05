package lc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum u implements o {
    READ_ENUM_KEYS_USING_INDEX,
    WRITE_ENUMS_TO_LOWERCASE;


    /* renamed from: b, reason: collision with root package name */
    public final int f73163b = 1 << ordinal();

    u() {
    }

    @Override // lc.o, ic.k
    public boolean enabledByDefault() {
        return false;
    }

    @Override // lc.o, ic.k
    public boolean enabledIn(int i10) {
        return (i10 & this.f73163b) != 0;
    }

    @Override // lc.o
    public int featureIndex() {
        return 0;
    }

    @Override // lc.o, ic.k
    public int getMask() {
        return this.f73163b;
    }
}
