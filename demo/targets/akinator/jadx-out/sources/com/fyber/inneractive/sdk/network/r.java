package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f24274a;

    public r(s sVar) {
        this.f24274a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.getClass();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d.f24047d.a(this.f24274a.f24255d).f();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.f24047d.a(this.f24274a.f24255d).g();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.f24047d.a(this.f24274a.f24255d).d();
                break;
        }
    }
}
