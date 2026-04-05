package vp;

import io.bidmachine.AdObjectImpl;
import io.bidmachine.AdProcessCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends AdObjectImpl.BaseUnifiedAdCallback implements hr.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f89526a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AdProcessCallback adProcessCallback) {
        super(adProcessCallback);
        this.f89526a = lVar;
    }

    @Override // hr.m
    public void onAdLoaded(t tVar) {
        l lVar = this.f89526a;
        try {
            lVar.setNativeNetworkAdapter(tVar);
            if (((m) ((x) lVar.getAdRequest()).getAdRequestParameters()).isValidateAssets() && !tVar.isValid()) {
                this.processCallback.processLoadFail(pr.a.incorrectContent("Native ad does not contain all required assets"));
            } else if (tVar.isNetworkControlLoadingAssets()) {
                this.processCallback.processLoadSuccess();
            } else {
                l.a(lVar, lVar.getApplicationContext(), tVar);
            }
        } catch (Exception e10) {
            nm.a.w(e10);
            this.processCallback.processLoadFail(pr.a.throwable("Exception loading native ad assets", e10));
        }
    }
}
