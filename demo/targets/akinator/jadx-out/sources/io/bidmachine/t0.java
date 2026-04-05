package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f62020c;

    public /* synthetic */ t0(Object obj, int i10) {
        this.f62019b = i10;
        this.f62020c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i10 = this.f62019b;
        Object obj = this.f62020c;
        switch (i10) {
            case 0:
                BidMachineAd bidMachineAd = ((a1) obj).f59836b;
                if (bidMachineAd.listener instanceof AdFullScreenListener) {
                    bidMachineAd.log("notify AdClosed");
                    ((AdFullScreenListener) bidMachineAd.listener).onAdClosed(bidMachineAd, bidMachineAd.isFinishTracked.get());
                }
                if (bidMachineAd.isDuplicateShowDisabled()) {
                    bidMachineAd.log("duplicate showing is disabled, starting destroy internally");
                    bidMachineAd.destroy();
                    break;
                }
                break;
            case 1:
                AdCridThreadHandler.runnable$lambda$0((AdCridThreadHandler) obj);
                break;
            case 2:
                n nVar = (n) obj;
                int i11 = n.f61893y;
                nVar.getClass();
                try {
                    up.a adObject = nVar.getAdObject();
                    if (adObject != null) {
                        adObject.hide();
                        break;
                    }
                } catch (Throwable th2) {
                    nm.a.w(th2);
                    return;
                }
                break;
            case 3:
                ((InitializationCallback) obj).onInitialized();
                break;
            default:
                NetworkRegistry.lambda$registerNetworks$0((NetworkRegistryCallback) obj);
                break;
        }
    }
}
