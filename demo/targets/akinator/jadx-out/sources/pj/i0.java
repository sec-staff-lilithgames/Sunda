package pj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f81445a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81446b;

    public i0(f0 f0Var, ru.a aVar) {
        this.f81445a = f0Var;
        this.f81446b = aVar;
    }

    public static i0 create(f0 f0Var, ru.a aVar) {
        return new i0(f0Var, aVar);
    }

    public static nj.q0 providesProtoStorageClientForLimiterStore(f0 f0Var, Application application) {
        return (nj.q0) dj.d.checkNotNullFromProvides(f0Var.providesProtoStorageClientForLimiterStore(application));
    }

    @Override // dj.b, dj.e, ru.a
    public nj.q0 get() {
        return providesProtoStorageClientForLimiterStore(this.f81445a, (Application) this.f81446b.get());
    }
}
