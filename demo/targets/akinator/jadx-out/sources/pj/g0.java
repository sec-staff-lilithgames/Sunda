package pj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f81439a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81440b;

    public g0(f0 f0Var, ru.a aVar) {
        this.f81439a = f0Var;
        this.f81440b = aVar;
    }

    public static g0 create(f0 f0Var, ru.a aVar) {
        return new g0(f0Var, aVar);
    }

    public static nj.q0 providesProtoStorageClientForCampaign(f0 f0Var, Application application) {
        return (nj.q0) dj.d.checkNotNullFromProvides(f0Var.providesProtoStorageClientForCampaign(application));
    }

    @Override // dj.b, dj.e, ru.a
    public nj.q0 get() {
        return providesProtoStorageClientForCampaign(this.f81439a, (Application) this.f81440b.get());
    }
}
