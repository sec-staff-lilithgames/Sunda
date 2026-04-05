package l7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public enum b {
    ENABLED(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    READ_ONLY(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f72518b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72519c;

    b(boolean z10, boolean z11) {
        this.f72518b = z10;
        this.f72519c = z11;
    }

    public final boolean getReadEnabled() {
        return this.f72518b;
    }

    public final boolean getWriteEnabled() {
        return this.f72519c;
    }
}
