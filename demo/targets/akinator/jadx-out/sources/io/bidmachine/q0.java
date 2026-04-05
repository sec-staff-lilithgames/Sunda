package io.bidmachine;

import io.bidmachine.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 implements AdRequest.AdRequestListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BidMachineAd f61986a;

    public q0(BidMachineAd bidMachineAd) {
        this.f61986a = bidMachineAd;
    }

    @Override // io.bidmachine.AdRequest.AdRequestListener
    public void onRequestExpired(AdRequest<Object, ?, Object> adRequest) {
        BidMachineAd bidMachineAd = this.f61986a;
        if (adRequest == bidMachineAd.adRequest) {
            bidMachineAd.adProcessCallback.processExpired();
        }
    }

    @Override // io.bidmachine.AdRequest.AdRequestListener
    public void onRequestFailed(AdRequest<Object, ?, Object> adRequest, pr.a aVar) {
        BidMachineAd bidMachineAd = this.f61986a;
        if (adRequest == bidMachineAd.adRequest) {
            bidMachineAd.processRequestFail(aVar);
        }
    }

    @Override // io.bidmachine.AdRequest.AdRequestListener
    public void onRequestSuccess(AdRequest<Object, ?, Object> adRequest, up.c cVar) {
        BidMachineAd bidMachineAd = this.f61986a;
        if (adRequest == bidMachineAd.adRequest) {
            bidMachineAd.processRequestSuccess(adRequest);
        }
    }
}
