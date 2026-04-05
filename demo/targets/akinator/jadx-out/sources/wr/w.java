package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final i f91165a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91166b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f91167c;

    public w(i iVar, int i10, boolean z10) {
        this.f91165a = (i) mh.p1.checkNotNull(iVar, "callOptions");
        this.f91166b = i10;
        this.f91167c = z10;
    }

    public static v newBuilder() {
        return new v();
    }

    public i getCallOptions() {
        return this.f91165a;
    }

    public int getPreviousAttempts() {
        return this.f91166b;
    }

    public boolean isTransparentRetry() {
        return this.f91167c;
    }

    public v toBuilder() {
        return new v().setCallOptions(this.f91165a).setPreviousAttempts(this.f91166b).setIsTransparentRetry(this.f91167c);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("callOptions", this.f91165a).add("previousAttempts", this.f91166b).add("isTransparentRetry", this.f91167c).toString();
    }
}
