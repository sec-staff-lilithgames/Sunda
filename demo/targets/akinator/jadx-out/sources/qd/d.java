package qd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f82752b = new c().build();

    /* renamed from: a, reason: collision with root package name */
    public final k f82753a;

    public d(k kVar) {
        this.f82753a = kVar;
    }

    public static d getDefaultInstance() {
        return f82752b;
    }

    public static c newBuilder() {
        return new c();
    }

    public k getStorageMetrics() {
        k kVar = this.f82753a;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public k getStorageMetricsInternal() {
        return this.f82753a;
    }
}
