package io.bidmachine.iab.vast;

import io.bidmachine.iab.vast.processor.VastAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastAd f60510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f60511c;

    public p(t tVar, VastAd vastAd) {
        this.f60511c = tVar;
        this.f60510b = vastAd;
    }

    @Override // java.lang.Runnable
    public void run() {
        t tVar = this.f60511c;
        z zVar = tVar.f60535h;
        if (zVar != null) {
            ((vm.n) zVar).onSuccess(tVar, this.f60510b);
        }
    }
}
