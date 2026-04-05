package fn;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class r implements sm.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f55764b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f55765c;

    /* renamed from: e, reason: collision with root package name */
    public AdSession f55766e;

    /* renamed from: f, reason: collision with root package name */
    public AdEvents f55767f;

    /* renamed from: g, reason: collision with root package name */
    public MediaEvents f55768g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f55769h;

    public r() {
        this(false);
    }

    public static void a(String str) {
        nm.a.d("AdMeasurer", str);
    }

    public abstract void b(AdEvents adEvents);

    public final void c(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.f55766e = adSessionCreateAdSession;
            this.f55767f = AdEvents.createAdEvents(adSessionCreateAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.f55768g = MediaEvents.createMediaEvents(this.f55766e);
            }
            AdSession adSession = this.f55766e;
            WeakReference weakReference = this.f55769h;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null) {
                adSession.registerAdView(view);
                a("registerAdView");
            }
            this.f55769h = null;
            this.f55766e.start();
            b(this.f55767f);
            a("prepareAdSession");
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }

    public void destroy() {
        nm.j.onUiThread(new g(this));
    }

    public void error(String str) {
        nm.j.onUiThread(new h(this, ErrorType.GENERIC, str));
    }

    @Override // sm.a
    public void onAdClicked() {
        nm.j.onUiThread(new k(this));
    }

    @Override // sm.a
    public void onAdShown() {
        if (this.f55764b) {
            return;
        }
        trackShown();
    }

    @Override // sm.a
    public void onError(qm.b bVar) {
        error(bVar.getMessage());
    }

    public void onMediaCompleted() {
        nm.j.onUiThread(new p(this));
    }

    public void onMediaFirstQuartile() {
        nm.j.onUiThread(new m(this));
    }

    public void onMediaMidpoint() {
        nm.j.onUiThread(new n(this));
    }

    public void onMediaPaused() {
        nm.j.onUiThread(new q(this));
    }

    public void onMediaResumed() {
        nm.j.onUiThread(new d(this));
    }

    public void onMediaSkipped() {
        nm.j.onUiThread(new f(this));
    }

    public void onMediaStarted(float f10, float f11) {
        nm.j.onUiThread(new l(this, f10, f11));
    }

    public void onMediaThirdQuartile() {
        nm.j.onUiThread(new o(this));
    }

    public void onMediaVolumeChanged(float f10) {
        nm.j.onUiThread(new e(this, f10));
    }

    @Override // sm.a
    public void registerAdContainer(ViewGroup viewGroup) {
        nm.j.onUiThread(new i(this, viewGroup));
    }

    public void trackShown() {
        if (this.f55765c.compareAndSet(false, true)) {
            nm.j.onUiThread(new j(this));
        }
    }

    public void videoError(String str) {
        nm.j.onUiThread(new h(this, ErrorType.VIDEO, str));
    }

    public r(boolean z10) {
        this.f55764b = z10;
        this.f55765c = new AtomicBoolean(false);
    }

    @Override // sm.a, sm.b
    public void onAdViewReady(View view) {
    }

    @Override // sm.a
    public void registerAdView(View view) {
    }
}
