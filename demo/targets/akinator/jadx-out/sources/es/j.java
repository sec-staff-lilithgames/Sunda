package es;

import wr.f3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements f3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3 f55052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f55053b;

    public j(k kVar, f3 f3Var) {
        this.f55053b = kVar;
        this.f55052a = f3Var;
    }

    @Override // wr.f3
    public void onSubchannelState(wr.g0 g0Var) {
        this.f55052a.onSubchannelState(g0Var);
        this.f55053b.f55057b.onSubchannelState(g0Var);
    }
}
