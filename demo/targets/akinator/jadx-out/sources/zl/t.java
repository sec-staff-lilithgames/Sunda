package zl;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class t implements ExpirationHandler.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f98277a;

    /* renamed from: b, reason: collision with root package name */
    public final l f98278b;

    /* renamed from: c, reason: collision with root package name */
    public final AdsFormat f98279c;

    /* renamed from: d, reason: collision with root package name */
    public final s f98280d;

    /* renamed from: e, reason: collision with root package name */
    public final ExpirationHandler f98281e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f98282f = 1;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f98283g;

    public t(l lVar, AdsFormat adsFormat, s sVar) {
        this.f98277a = new pr.n(lVar.getNetworkName() + "Ad");
        this.f98278b = lVar;
        this.f98279c = adsFormat;
        this.f98280d = sVar;
        this.f98281e = new ExpirationHandler(lVar.getExpirationTimeMs(), this);
    }

    public final void a(boolean z10) {
        nm.a.d(this.f98277a, new g(this, 3));
        WeakReference weakReference = this.f98283g;
        if (weakReference != null) {
            weakReference.clear();
            this.f98283g = null;
        }
        this.f98281e.stop();
        l lVar = this.f98278b;
        if (!z10) {
            lVar.f(this);
            return;
        }
        lVar.getClass();
        nm.j.onUiThread(new zg.h(this, 22));
        lVar.d(this);
    }

    public abstract void b();

    public void destroy() {
        int i10 = this.f98282f;
        a(i10 != 0 && b3.h.c(i10) >= 4);
    }

    public v getAdPresentListener() {
        WeakReference weakReference = this.f98283g;
        if (weakReference != null) {
            return (v) weakReference.get();
        }
        return null;
    }

    public String getAdUnitId() {
        return getGamUnitData().getAdUnitId();
    }

    public AdsFormat getAdsFormat() {
        return this.f98279c;
    }

    public l getGamLoader() {
        return this.f98278b;
    }

    public s getGamUnitData() {
        return this.f98280d;
    }

    public float getScope() {
        return getGamUnitData().getScore();
    }

    public abstract void loadAd(Context context, e0 e0Var);

    public void onAdLoaded() {
        nm.a.d(this.f98277a, new g(this, 4));
        this.f98282f = 3;
        this.f98281e.start();
    }

    public void onAdShown() {
        nm.a.d(this.f98277a, new g(this, 1));
        this.f98278b.d(this);
        this.f98282f = 5;
        this.f98281e.stop();
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        int i10 = this.f98282f;
        if (i10 == 0 || b3.h.c(i10) < 4) {
            nm.a.d(this.f98277a, new g(this, 2));
            this.f98282f = 6;
            v adPresentListener = getAdPresentListener();
            if (adPresentListener != null) {
                ((c) adPresentListener).onAdExpired();
            }
            a(true);
            this.f98278b.c(this.f98279c);
        }
    }

    public void setAdPresentListener(v vVar) {
        this.f98283g = new WeakReference(vVar);
    }

    public String toString() {
        return this.f98277a + ", " + getGamUnitData();
    }
}
