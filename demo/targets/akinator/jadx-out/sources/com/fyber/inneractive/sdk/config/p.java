package com.fyber.inneractive.sdk.config;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f23339a;

    public p(s sVar) {
        this.f23339a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        o oVar = (o) obj;
        if (oVar != null) {
            s sVar = this.f23339a;
            if (oVar.equals(sVar.f23394b)) {
                return;
            }
            sVar.f23396d = true;
            sVar.f23394b = oVar;
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new q(sVar));
        }
    }
}
