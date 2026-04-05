package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum k0 implements ic.k {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_TARGET(n.AUTO_CLOSE_TARGET),
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_CONTENT(n.AUTO_CLOSE_JSON_CONTENT),
    /* JADX INFO: Fake field, exist only in values array */
    FLUSH_PASSED_TO_STREAM(n.FLUSH_PASSED_TO_STREAM),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_BIGDECIMAL_AS_PLAIN(n.WRITE_BIGDECIMAL_AS_PLAIN),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT_DUPLICATE_DETECTION(n.STRICT_DUPLICATE_DETECTION),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNKNOWN(n.IGNORE_UNKNOWN),
    /* JADX INFO: Fake field, exist only in values array */
    USE_FAST_DOUBLE_WRITER(n.USE_FAST_DOUBLE_WRITER);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f88272b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88273c;

    /* renamed from: e, reason: collision with root package name */
    public final n f88274e;

    k0(n nVar) {
        this.f88274e = nVar;
        this.f88273c = nVar.getMask();
        this.f88272b = nVar.enabledByDefault();
    }

    public static int collectDefaults() {
        int mask = 0;
        for (k0 k0Var : values()) {
            if (k0Var.enabledByDefault()) {
                mask |= k0Var.getMask();
            }
        }
        return mask;
    }

    @Override // ic.k
    public boolean enabledByDefault() {
        return this.f88272b;
    }

    @Override // ic.k
    public boolean enabledIn(int i10) {
        return (i10 & this.f88273c) != 0;
    }

    @Override // ic.k
    public int getMask() {
        return this.f88273c;
    }

    public n mappedFeature() {
        return this.f88274e;
    }
}
