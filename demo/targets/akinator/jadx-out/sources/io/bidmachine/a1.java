package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a1 extends b4 {

    /* renamed from: a, reason: collision with root package name */
    public AdCridThreadHandler f59835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BidMachineAd f59836b;

    public a1(BidMachineAd bidMachineAd) {
        this.f59836b = bidMachineAd;
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processClicked() {
        BidMachineAd bidMachineAd = this.f59836b;
        if (bidMachineAd.currentState.ordinal() > 3) {
            return;
        }
        bidMachineAd.log("processClicked");
        nm.j.onUiThread(new x0(this));
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processClosed() {
        BidMachineAd bidMachineAd = this.f59836b;
        if (bidMachineAd.currentState.ordinal() <= 3 && bidMachineAd.isCloseTracked.compareAndSet(false, true)) {
            bidMachineAd.log("processClosed (" + bidMachineAd.isFinishTracked.get() + ")");
            nm.j.onUiThread(new t0(this, 0));
        }
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processDestroy() {
        BidMachineAd bidMachineAd = this.f59836b;
        bidMachineAd.log("destroy requested");
        bidMachineAd.currentState = b1.f60316h;
        n adResponse = bidMachineAd.getAdResponse();
        if (adResponse != null) {
            adResponse.removeCallback(this);
        }
        bidMachineAd.destroyAdRequest();
        nm.j.ifNotNull(this.f59835a, new hv.t(18));
        this.f59835a = null;
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processExpired() {
        BidMachineAd bidMachineAd = this.f59836b;
        if (bidMachineAd.currentState.ordinal() > 3) {
            return;
        }
        bidMachineAd.log("processExpired");
        bidMachineAd.currentState = b1.f60317i;
        nm.j.onUiThread(new z0(this));
        nm.j.ifNotNull(this.f59835a, new hv.t(18));
        this.f59835a = null;
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processFillAd() {
        BidMachineAd bidMachineAd = this.f59836b;
        if (bidMachineAd.currentState.ordinal() > 3) {
            return;
        }
        bidMachineAd.log("processFillAd");
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processFinished() {
        BidMachineAd bidMachineAd = this.f59836b;
        if (bidMachineAd.currentState.ordinal() <= 3 && bidMachineAd.isFinishTracked.compareAndSet(false, true)) {
            bidMachineAd.log("processFinished");
            nm.j.onUiThread(new y0(this));
        }
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processLoadFail(pr.a aVar) {
        BidMachineAd bidMachineAd = this.f59836b;
        bidMachineAd.log("processLoadFail - " + aVar);
        bidMachineAd.currentState = b1.f60315g;
        nm.j.onUiThread(new s0(this, aVar, 1));
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processLoadSuccess() {
        BidMachineAd bidMachineAd = this.f59836b;
        if (bidMachineAd.currentState.ordinal() > 2) {
            return;
        }
        bidMachineAd.log("processLoadSuccess");
        bidMachineAd.currentState = b1.f60314f;
        nm.j.onUiThread(new v0(this));
        nm.j.ifNotNull(bidMachineAd.getAdResponse(), new u0(this, 0));
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processShowFail(pr.a aVar) {
        this.f59836b.log("processShowFail - " + aVar);
        nm.j.onUiThread(new s0(this, aVar, 0));
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processShown() {
        BidMachineAd bidMachineAd = this.f59836b;
        if (bidMachineAd.currentState.ordinal() > 3) {
            return;
        }
        bidMachineAd.log("processShown");
        nm.j.onUiThread(new w0(this));
    }

    @Override // io.bidmachine.b4, io.bidmachine.AdProcessCallback
    public void processVisibilityTrackerImpression() {
        BidMachineAd bidMachineAd = this.f59836b;
        if (bidMachineAd.currentState.ordinal() > 3) {
            return;
        }
        bidMachineAd.log("processImpression");
    }
}
