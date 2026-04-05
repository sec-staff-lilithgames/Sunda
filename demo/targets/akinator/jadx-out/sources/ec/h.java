package ec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum h implements ub.f {
    /* JADX INFO: Fake field, exist only in values array */
    QUOTE_FIELD_NAMES(true, ub.n.QUOTE_FIELD_NAMES),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_NAN_AS_STRINGS(true, ub.n.QUOTE_NON_NUMERIC_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_NUMBERS_AS_STRINGS(false, ub.n.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, ub.n.ESCAPE_NON_ASCII),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_HEX_UPPER_CASE(true, ub.n.WRITE_HEX_UPPER_CASE),
    ESCAPE_FORWARD_SLASHES(false, ub.n.ESCAPE_FORWARD_SLASHES),
    /* JADX INFO: Fake field, exist only in values array */
    COMBINE_UNICODE_SURROGATES_IN_UTF8(false, ub.n.COMBINE_UNICODE_SURROGATES_IN_UTF8);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f54054b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54055c = 1 << ordinal();

    /* renamed from: e, reason: collision with root package name */
    public final ub.n f54056e;

    h(boolean z10, ub.n nVar) {
        this.f54054b = z10;
        this.f54056e = nVar;
    }

    public static int collectDefaults() {
        int mask = 0;
        for (h hVar : values()) {
            if (hVar.enabledByDefault()) {
                mask |= hVar.getMask();
            }
        }
        return mask;
    }

    @Override // ub.f, ic.k
    public boolean enabledByDefault() {
        return this.f54054b;
    }

    @Override // ub.f, ic.k
    public boolean enabledIn(int i10) {
        return (i10 & this.f54055c) != 0;
    }

    @Override // ub.f, ic.k
    public int getMask() {
        return this.f54055c;
    }

    public ub.n mappedFeature() {
        return this.f54056e;
    }
}
