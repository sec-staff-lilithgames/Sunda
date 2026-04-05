package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum g0 implements ic.k {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_SOURCE(r.AUTO_CLOSE_SOURCE),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT_DUPLICATE_DETECTION(r.STRICT_DUPLICATE_DETECTION),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNDEFINED(r.IGNORE_UNDEFINED),
    /* JADX INFO: Fake field, exist only in values array */
    INCLUDE_SOURCE_IN_LOCATION(r.INCLUDE_SOURCE_IN_LOCATION),
    USE_FAST_DOUBLE_PARSER(r.USE_FAST_DOUBLE_PARSER),
    USE_FAST_BIG_NUMBER_PARSER(r.USE_FAST_BIG_NUMBER_PARSER);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f88225b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88226c;

    /* renamed from: e, reason: collision with root package name */
    public final r f88227e;

    g0(r rVar) {
        this.f88227e = rVar;
        this.f88226c = rVar.getMask();
        this.f88225b = rVar.enabledByDefault();
    }

    public static int collectDefaults() {
        int mask = 0;
        for (g0 g0Var : values()) {
            if (g0Var.enabledByDefault()) {
                mask |= g0Var.getMask();
            }
        }
        return mask;
    }

    @Override // ic.k
    public boolean enabledByDefault() {
        return this.f88225b;
    }

    @Override // ic.k
    public boolean enabledIn(int i10) {
        return (i10 & this.f88226c) != 0;
    }

    @Override // ic.k
    public int getMask() {
        return this.f88226c;
    }

    public r mappedFeature() {
        return this.f88227e;
    }
}
