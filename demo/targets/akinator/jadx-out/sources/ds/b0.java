package ds;

import mh.p1;
import wr.e4;
import wr.k5;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 extends x {

    /* renamed from: a, reason: collision with root package name */
    public final k5 f52588a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52589b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f52590c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52591d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52593f;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f52594g;

    /* renamed from: h, reason: collision with root package name */
    public Runnable f52595h;

    /* renamed from: k, reason: collision with root package name */
    public Runnable f52598k;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52592e = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52596i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f52597j = false;

    public b0(k5 k5Var, boolean z10) {
        this.f52588a = k5Var;
        this.f52589b = z10;
    }

    @Override // ds.f
    public void disableAutoInboundFlowControl() {
        disableAutoRequest();
    }

    @Override // ds.x
    public void disableAutoRequest() {
        p1.checkState(!this.f52591d, "Cannot disable auto flow control after initialization");
        this.f52592e = false;
    }

    @Override // ds.x
    public boolean isCancelled() {
        return this.f52588a.isCancelled();
    }

    @Override // ds.x, ds.f
    public boolean isReady() {
        return this.f52588a.isReady();
    }

    @Override // ds.x, ds.f, ds.l0
    public void onCompleted() {
        this.f52588a.close(m6.f91037e, new e4());
        this.f52597j = true;
    }

    @Override // ds.x, ds.f, ds.l0
    public void onError(Throwable th2) {
        e4 e4VarTrailersFromThrowable = m6.trailersFromThrowable(th2);
        if (e4VarTrailersFromThrowable == null) {
            e4VarTrailersFromThrowable = new e4();
        }
        this.f52588a.close(m6.fromThrowable(th2), e4VarTrailersFromThrowable);
        this.f52596i = true;
    }

    @Override // ds.x, ds.f, ds.l0
    public void onNext(Object obj) {
        if (this.f52590c && this.f52589b) {
            throw m6.f91038f.withDescription("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception").asRuntimeException();
        }
        p1.checkState(!this.f52596i, "Stream was terminated by error, no further calls are allowed");
        p1.checkState(!this.f52597j, "Stream is already completed, no further calls are allowed");
        if (!this.f52593f) {
            this.f52588a.sendHeaders(new e4());
            this.f52593f = true;
        }
        this.f52588a.sendMessage(obj);
    }

    @Override // ds.x, ds.f
    public void request(int i10) {
        this.f52588a.request(i10);
    }

    @Override // ds.x
    public void setCompression(String str) {
        this.f52588a.setCompression(str);
    }

    @Override // ds.x, ds.f
    public void setMessageCompression(boolean z10) {
        this.f52588a.setMessageCompression(z10);
    }

    @Override // ds.x
    public void setOnCancelHandler(Runnable runnable) {
        p1.checkState(!this.f52591d, "Cannot alter onCancelHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
        this.f52595h = runnable;
    }

    @Override // ds.x
    public void setOnCloseHandler(Runnable runnable) {
        p1.checkState(!this.f52591d, "Cannot alter onCloseHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
        this.f52598k = runnable;
    }

    @Override // ds.x, ds.f
    public void setOnReadyHandler(Runnable runnable) {
        p1.checkState(!this.f52591d, "Cannot alter onReadyHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
        this.f52594g = runnable;
    }
}
