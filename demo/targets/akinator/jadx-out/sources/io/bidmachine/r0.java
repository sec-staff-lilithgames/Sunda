package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BidMachineAd f61991a;

    public r0(BidMachineAd bidMachineAd) {
        this.f61991a = bidMachineAd;
    }

    @Override // io.bidmachine.i
    public void onRequestDestroyed(AdRequest<Object, ?, Object> adRequest) {
        BidMachineAd bidMachineAd = this.f61991a;
        if (adRequest == bidMachineAd.adRequest) {
            bidMachineAd.destroy();
        }
    }
}
