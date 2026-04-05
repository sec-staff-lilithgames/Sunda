package ds;

import mh.p1;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f52619a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.p f52620b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f52621c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f52622d;

    /* renamed from: e, reason: collision with root package name */
    public int f52623e = 1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52624f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52625g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52626h = false;

    public j(wr.p pVar, boolean z10) {
        this.f52620b = pVar;
        this.f52621c = z10;
    }

    @Override // ds.g
    public void cancel(String str, Throwable th2) {
        this.f52620b.cancel(str, th2);
    }

    @Override // ds.f
    public void disableAutoInboundFlowControl() {
        disableAutoRequestWithInitial(1);
    }

    @Override // ds.g
    public void disableAutoRequestWithInitial(int i10) {
        if (this.f52619a) {
            throw new IllegalStateException("Cannot disable auto flow control after call started. Use ClientResponseObserver");
        }
        p1.checkArgument(i10 >= 0, "Initial requests must be non-negative");
        this.f52623e = i10;
        this.f52624f = false;
    }

    @Override // ds.g, ds.f
    public boolean isReady() {
        return this.f52620b.isReady();
    }

    @Override // ds.g, ds.f, ds.l0
    public void onCompleted() {
        this.f52620b.halfClose();
        this.f52626h = true;
    }

    @Override // ds.g, ds.f, ds.l0
    public void onError(Throwable th2) {
        this.f52620b.cancel("Cancelled by client with StreamObserver.onError()", th2);
        this.f52625g = true;
    }

    @Override // ds.g, ds.f, ds.l0
    public void onNext(Object obj) {
        p1.checkState(!this.f52625g, "Stream was terminated by error, no further calls are allowed");
        p1.checkState(!this.f52626h, "Stream is already completed, no further calls are allowed");
        this.f52620b.sendMessage(obj);
    }

    @Override // ds.g, ds.f
    public void request(int i10) {
        boolean z10 = this.f52621c;
        wr.p pVar = this.f52620b;
        if (z10 || i10 != 1) {
            pVar.request(i10);
        } else {
            pVar.request(2);
        }
    }

    @Override // ds.g, ds.f
    public void setMessageCompression(boolean z10) {
        this.f52620b.setMessageCompression(z10);
    }

    @Override // ds.g, ds.f
    public void setOnReadyHandler(Runnable runnable) {
        if (this.f52619a) {
            throw new IllegalStateException(VPCjETNfjxu.bUhgJNKN);
        }
        this.f52622d = runnable;
    }
}
