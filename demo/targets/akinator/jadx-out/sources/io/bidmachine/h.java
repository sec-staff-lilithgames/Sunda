package io.bidmachine;

import io.bidmachine.ApiRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f60367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApiRequest.Builder f60368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequest f60369c;

    public h(AdRequest adRequest, String str, ApiRequest.Builder builder) {
        this.f60369c = adRequest;
        this.f60367a = str;
        this.f60368b = builder;
    }

    @Override // io.bidmachine.o
    public void onCancel() {
        this.f60369c.processApiRequestCancel();
    }

    @Override // io.bidmachine.o
    public void onFail(pr.a aVar) {
        this.f60369c.processApiRequestLoadedFail(this.f60368b, aVar);
    }

    @Override // io.bidmachine.o
    public void onSuccess(n nVar) {
        String str = this.f60367a;
        AdRequest adRequest = this.f60369c;
        adRequest.setAuctionUrl(str);
        adRequest.processApiRequestSuccess(nVar);
    }
}
