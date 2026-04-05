package em;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.protobuf.Waterfall;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u implements v, ExpirationHandler.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f54761a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f54762b;

    /* renamed from: c, reason: collision with root package name */
    public final AdsFormat f54763c;

    /* renamed from: d, reason: collision with root package name */
    public final Waterfall.Configuration.AdUnit f54764d;

    /* renamed from: e, reason: collision with root package name */
    public final w f54765e;

    /* renamed from: f, reason: collision with root package name */
    public final ExpirationHandler f54766f;

    /* renamed from: i, reason: collision with root package name */
    public WeakReference f54769i;

    /* renamed from: j, reason: collision with root package name */
    public x f54770j;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f54768h = 1;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f54767g = new ConcurrentHashMap();

    public u(j0 j0Var, l0 l0Var, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, w wVar) {
        this.f54761a = new pr.n(j0Var.getNetworkName() + "Ad");
        this.f54762b = l0Var;
        this.f54763c = adsFormat;
        this.f54764d = adUnit;
        this.f54765e = wVar;
        this.f54766f = new ExpirationHandler(adUnit.getExpirationTime(), this);
    }

    public final void a(boolean z10) {
        try {
            nm.a.d(this.f54761a, new b(this, 2));
            WeakReference weakReference = this.f54769i;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f54769i = null;
            if (z10) {
                this.f54766f.stop();
                nm.j.onUiThread(new com.unity3d.services.banners.view.a(this, 12));
            }
            ((t0) this.f54765e).onAdDestroyed(this, z10);
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }

    public abstract void b();

    public final void c(Runnable runnable) {
        this.f54762b.execute(runnable);
    }

    public void destroy() {
        int i10 = this.f54768h;
        a(i10 != 0 && b3.h.c(i10) >= 4);
    }

    public z getAdPresentListener() {
        WeakReference weakReference = this.f54769i;
        if (weakReference != null) {
            return (z) weakReference.get();
        }
        return null;
    }

    public Waterfall.Configuration.AdUnit getAdUnit() {
        return this.f54764d;
    }

    @Override // em.v
    public String getAdUnitId() {
        return getAdUnit().getAdUnitId();
    }

    public AdsFormat getAdsFormat() {
        return this.f54763c;
    }

    @Override // em.v
    public Map<String, Object> getCustomParamsMap() {
        return this.f54767g;
    }

    public x getInternalAdLoadData() {
        return this.f54770j;
    }

    @Override // em.v
    public double getPrice() {
        return getAdUnit().getPrice();
    }

    public abstract void loadAd(Context context, g0 g0Var);

    public void onAdLoaded(x xVar) {
        this.f54770j = xVar;
        Waterfall.Result.EstimatedPrice price = xVar != null ? xVar.getPrice() : null;
        nm.a.d(this.f54761a, new t(this, price, 1));
        String strEncodeToString = pr.i.encodeToString(price);
        if (strEncodeToString != null) {
            setCustomParam("gam_estimated_price", strEncodeToString);
        }
        this.f54768h = 3;
        this.f54766f.start();
    }

    public void onAdShown() {
        nm.a.d(this.f54761a, new b(this, 3));
        ((t0) this.f54765e).onAdShown(this);
        this.f54768h = 5;
        this.f54766f.stop();
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        int i10 = this.f54768h;
        if (i10 == 0 || b3.h.c(i10) < 4) {
            nm.a.d(this.f54761a, new b(this, 1));
            ((t0) this.f54765e).onAdExpired(this);
            this.f54768h = 6;
            z adPresentListener = getAdPresentListener();
            if (adPresentListener != null) {
                ((g) adPresentListener).onAdExpired();
            }
            a(true);
        }
    }

    public void onPaidEvent(Waterfall.Result.EstimatedPrice estimatedPrice) {
        nm.a.d(this.f54761a, new t(this, estimatedPrice, 0));
        String strEncodeToString = pr.i.encodeToString(estimatedPrice);
        if (strEncodeToString != null) {
            setCustomParam("gam_estimated_price", strEncodeToString);
        }
        ((t0) this.f54765e).onPaidEvent(this);
    }

    public void setAdPresentListener(z zVar) {
        this.f54769i = new WeakReference(zVar);
    }

    public void setCustomParam(String str, Object obj) {
        this.f54767g.put(str, obj);
    }

    public String toString() {
        return this.f54761a + ", " + s.toString(this.f54764d);
    }
}
