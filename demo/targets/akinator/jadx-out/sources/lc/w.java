package lc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum w implements o {
    READ_NULL_PROPERTIES(true),
    WRITE_NULL_PROPERTIES(true),
    WRITE_PROPERTIES_SORTED(false),
    STRIP_TRAILING_BIGDECIMAL_ZEROES(true),
    FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION(false),
    USE_BIG_DECIMAL_FOR_FLOATS(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f73171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73172c = 1 << ordinal();

    w(boolean z10) {
        this.f73171b = z10;
    }

    @Override // lc.o, ic.k
    public boolean enabledByDefault() {
        return this.f73171b;
    }

    @Override // lc.o, ic.k
    public boolean enabledIn(int i10) {
        return (i10 & this.f73172c) != 0;
    }

    @Override // lc.o
    public int featureIndex() {
        return 1;
    }

    @Override // lc.o, ic.k
    public int getMask() {
        return this.f73172c;
    }
}
