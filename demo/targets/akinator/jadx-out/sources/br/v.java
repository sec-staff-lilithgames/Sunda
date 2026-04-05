package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10004a;

    /* renamed from: b, reason: collision with root package name */
    public final u f10005b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10006c;

    public v(boolean z10, u algorithmParams, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithmParams, "algorithmParams");
        this.f10004a = z10;
        this.f10005b = algorithmParams;
        this.f10006c = j10;
    }

    public final u getAlgorithmParams() {
        return this.f10005b;
    }

    public final long getDurationMs() {
        return this.f10006c;
    }

    public final boolean isBroken() {
        return this.f10004a;
    }
}
