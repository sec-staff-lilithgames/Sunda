package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f62000c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr.a f62001e;

    public /* synthetic */ s0(a1 a1Var, pr.a aVar, int i10) {
        this.f61999b = i10;
        this.f62000c = a1Var;
        this.f62001e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61999b) {
            case 0:
                BidMachineAd bidMachineAd = this.f62000c.f59836b;
                if (bidMachineAd.listener != null) {
                    bidMachineAd.log("notify AdShowFailed");
                    bidMachineAd.listener.onAdShowFailed(bidMachineAd, this.f62001e);
                    break;
                }
                break;
            default:
                BidMachineAd bidMachineAd2 = this.f62000c.f59836b;
                if (bidMachineAd2.listener != null) {
                    bidMachineAd2.log("notify AdLoadFailed");
                    bidMachineAd2.listener.onAdLoadFailed(bidMachineAd2, this.f62001e);
                    break;
                }
                break;
        }
    }
}
