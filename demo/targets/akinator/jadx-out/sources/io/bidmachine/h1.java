package io.bidmachine;

import io.bidmachine.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h1 implements AdRequest.AdRequestListener {
    @Override // io.bidmachine.AdRequest.AdRequestListener
    public void onRequestExpired(AdRequest adRequest) {
        BidMachineFetcher.release(adRequest);
    }

    @Override // io.bidmachine.AdRequest.AdRequestListener
    public void onRequestFailed(AdRequest adRequest, pr.a aVar) {
    }

    @Override // io.bidmachine.AdRequest.AdRequestListener
    public void onRequestSuccess(AdRequest adRequest, up.c cVar) {
    }
}
