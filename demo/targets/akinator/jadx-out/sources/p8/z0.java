package p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z0 implements com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8.k0 f80915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f80916c;

    public z0(a1 a1Var, u8.k0 k0Var) {
        this.f80916c = a1Var;
        this.f80915b = k0Var;
    }

    @Override // com.bumptech.glide.load.data.d
    public void onDataReady(Object obj) {
        a1 a1Var = this.f80916c;
        u8.k0 k0Var = this.f80915b;
        u8.k0 k0Var2 = a1Var.f80731h;
        if (k0Var2 == null || k0Var2 != k0Var) {
            return;
        }
        a1 a1Var2 = this.f80916c;
        u8.k0 k0Var3 = this.f80915b;
        z zVar = a1Var2.f80726b.f80818p;
        if (obj != null && zVar.isDataCacheable(k0Var3.f88091c.getDataSource())) {
            a1Var2.f80730g = obj;
            a1Var2.f80727c.reschedule();
        } else {
            r rVar = a1Var2.f80727c;
            n8.q qVar = k0Var3.f88089a;
            com.bumptech.glide.load.data.e eVar = k0Var3.f88091c;
            rVar.onDataFetcherReady(qVar, obj, eVar, eVar.getDataSource(), a1Var2.f80732i);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void onLoadFailed(Exception exc) {
        a1 a1Var = this.f80916c;
        u8.k0 k0Var = this.f80915b;
        u8.k0 k0Var2 = a1Var.f80731h;
        if (k0Var2 == null || k0Var2 != k0Var) {
            return;
        }
        a1 a1Var2 = this.f80916c;
        u8.k0 k0Var3 = this.f80915b;
        r rVar = a1Var2.f80727c;
        h hVar = a1Var2.f80732i;
        com.bumptech.glide.load.data.e eVar = k0Var3.f88091c;
        rVar.onDataFetcherFailed(hVar, exc, eVar, eVar.getDataSource());
    }
}
