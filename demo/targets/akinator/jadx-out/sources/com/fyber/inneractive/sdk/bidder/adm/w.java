package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.network.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f23077a;

    public w(y yVar) {
        this.f23077a = yVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.getClass();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f24047d;
                dVar.a(this.f23077a.f23082d).f();
                dVar.b(this.f23077a.f23082d).f24063c = System.currentTimeMillis();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.f24047d.a(this.f23077a.f23082d).h();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.f24047d.a(this.f23077a.f23082d).d();
                break;
            case "sdkRequestEndedButWillBeRetried":
                com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f24047d.b(this.f23077a.f23082d);
                iVarB.f24061a.put(new com.fyber.inneractive.sdk.metrics.h("retrying"), Long.valueOf(System.currentTimeMillis() - iVarB.f24063c));
                break;
        }
    }
}
