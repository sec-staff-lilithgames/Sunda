package io.bidmachine;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements AdProcessCallback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f60594a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f60595b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f60596c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f60597d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f60598e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f60599f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f60600g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f60601h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f60602i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f60603j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f60604k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f60605l = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile nm.m f60606m = nm.m.f77062c;

    public m(n nVar) {
        this.f60594a = new WeakReference(nVar);
    }

    public final boolean a() {
        int iOrdinal = this.f60606m.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal == 2 && (!this.f60601h.get() || this.f60602i.get()) && this.f60600g.get() : this.f60600g.get() : !this.f60601h.get() || this.f60602i.get();
    }

    public final void b(Executable executable) {
        synchronized (this.f60596c) {
            try {
                Iterator it = new ArrayList(this.f60595b.keySet()).iterator();
                while (it.hasNext()) {
                    AdProcessCallback adProcessCallback = (AdProcessCallback) it.next();
                    if (adProcessCallback != null) {
                        executable.execute(adProcessCallback);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n c() {
        return (n) this.f60594a.get();
    }

    public final void d() {
        if (this.f60603j.compareAndSet(false, true)) {
            n nVarC = c();
            if (nVarC != null) {
                nm.a.d(nVarC.f61894a, new c(nVarC, 12));
                nVarC.f61908o.stop();
                t.get().c(nVarC);
                up.a adObject = nVarC.getAdObject();
                if (adObject != null) {
                    adObject.onShown();
                }
                nVarC.d(TrackEventType.Show, null, null);
            }
            b(new hv.t(14));
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(Map<String, Object> map) {
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new c(nVarC, 15));
            nVarC.d(TrackEventType.BrokenCreativeDetector, null, map);
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClicked() {
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new c(nVarC, 11));
            up.a adObject = nVarC.getAdObject();
            if (adObject != null) {
                adObject.onClicked();
            }
            nVarC.d(TrackEventType.Click, null, null);
        }
        b(new hv.t(12));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClosed() {
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new ao.n(18, this, nVarC));
            up.a adObject = nVarC.getAdObject();
            if (adObject != null) {
                adObject.onClosed(this.f60605l);
            }
            nVarC.d(TrackEventType.Close, null, null);
        }
        b(new hv.t(15));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processDestroy() {
        b(new hv.t(9));
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new c(nVarC, 8));
            nVarC.c();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processExpired() {
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new c(nVarC, 10));
            up.a adObject = nVarC.getAdObject();
            if (adObject != null) {
                adObject.onExpired();
                nVarC.d(TrackEventType.Expired, null, null);
            }
        }
        b(new hv.t(11));
        if (nVarC != null) {
            nVarC.f(false);
        }
        processDestroy();
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFillAd() {
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new c(nVarC, 13));
            if (nVarC.getAdsType().isFullscreen()) {
                nVarC.f61908o.stop();
                t.get().c(nVarC);
            }
            nVarC.d(TrackEventType.FillAd, null, null);
        }
        b(new hv.t(16));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFinished() {
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new c(nVarC, 14));
            up.a adObject = nVarC.getAdObject();
            if (adObject != null) {
                adObject.onFinished();
            }
            this.f60605l = true;
        }
        b(new hv.t(17));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadFail(pr.a aVar) {
        if (this.f60599f.getAndSet(true)) {
            return;
        }
        this.f60597d.set(false);
        this.f60598e.set(false);
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new b(aVar, 4));
            ExpirationHandler expirationHandler = nVarC.f61915v;
            if (expirationHandler != null) {
                expirationHandler.stop();
            }
            nVarC.f61915v = null;
            nVarC.d(TrackEventType.Load, aVar, null);
        }
        b(new b(aVar, 1));
        processDestroy();
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadSuccess() {
        if (this.f60599f.getAndSet(true)) {
            return;
        }
        this.f60597d.set(true);
        this.f60598e.set(false);
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new c(nVarC, 9));
            ExpirationHandler expirationHandler = nVarC.f61915v;
            if (expirationHandler != null) {
                expirationHandler.stop();
            }
            nVarC.f61915v = null;
            nVarC.d(TrackEventType.Load, null, null);
        }
        UserAgentManager.updateWebViewUserAgent();
        b(new hv.t(10));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShowFail(pr.a aVar) {
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new b(aVar, 2));
            up.a adObject = nVarC.getAdObject();
            if (adObject != null) {
                adObject.onShowFailed();
            }
            nVarC.d(TrackEventType.Show, aVar, null);
        }
        b(new b(aVar, 3));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShown() {
        this.f60600g.set(true);
        if (a()) {
            d();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processStartVisibilityTracker() {
        this.f60601h.set(true);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processVisibilityTrackerImpression() {
        if (this.f60604k.getAndSet(true)) {
            return;
        }
        n nVarC = c();
        if (nVarC != null) {
            nm.a.d(nVarC.f61894a, new c(nVarC, 7));
            up.a adObject = nVarC.getAdObject();
            if (adObject != null) {
                adObject.onImpression();
            }
            nVarC.d(TrackEventType.Impression, null, null);
        }
        b(new hv.t(13));
    }

    @Override // io.bidmachine.AdProcessCallback
    public boolean processVisibilityTrackerShown() {
        this.f60602i.set(true);
        if (!a()) {
            return false;
        }
        d();
        return true;
    }

    @Override // io.bidmachine.AdProcessCallback
    public void setVisibilitySource(nm.m mVar) {
        this.f60606m = mVar;
    }
}
