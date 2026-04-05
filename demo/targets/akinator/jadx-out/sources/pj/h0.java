package pj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f81442a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81443b;

    public h0(f0 f0Var, ru.a aVar) {
        this.f81442a = f0Var;
        this.f81443b = aVar;
    }

    public static h0 create(f0 f0Var, ru.a aVar) {
        return new h0(f0Var, aVar);
    }

    public static nj.q0 providesProtoStorageClientForImpressionStore(f0 f0Var, Application application) {
        return (nj.q0) dj.d.checkNotNullFromProvides(f0Var.providesProtoStorageClientForImpressionStore(application));
    }

    @Override // dj.b, dj.e, ru.a
    public nj.q0 get() {
        return providesProtoStorageClientForImpressionStore(this.f81442a, (Application) this.f81443b.get());
    }
}
