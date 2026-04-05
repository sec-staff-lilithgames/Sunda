package yl;

import android.view.View;
import android.view.ViewGroup;
import br.h0;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j implements ar.e {

    /* renamed from: b, reason: collision with root package name */
    public final pr.n f94604b = new pr.n("OMMeasurer");

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f94605c = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f94606e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public AdSession f94607f;

    /* renamed from: g, reason: collision with root package name */
    public AdEvents f94608g;

    /* renamed from: h, reason: collision with root package name */
    public MediaEvents f94609h;

    public long a() {
        return 0L;
    }

    public final void b(String str) {
        nm.a.d(this.f94604b, str);
    }

    public abstract void c(AdEvents adEvents);

    public final void d(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.f94607f = adSessionCreateAdSession;
            this.f94608g = AdEvents.createAdEvents(adSessionCreateAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.f94609h = MediaEvents.createMediaEvents(this.f94607f);
            }
            this.f94607f.start();
            b("prepareAdSession");
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }

    @Override // ar.e
    public void destroy(Runnable runnable) {
        nm.j.onUiThread(new f(this, runnable, nm.j.createHandlerWithMyOrMainLooper()));
    }

    @Override // ar.e
    public void onClicked() {
        nm.j.onUiThread(new e(this));
    }

    @Override // ar.e
    public void onError(h0 h0Var) {
        trackError(h0Var.getMessage());
    }

    @Override // ar.e
    public void onShown() {
        if (this.f94606e.compareAndSet(false, true)) {
            nm.j.onUiThread(new d(this));
        }
    }

    public void trackError(String str) {
        nm.j.onUiThread(new h(this, ErrorType.GENERIC, str));
    }

    public void trackVideoError(String str) {
        nm.j.onUiThread(new h(this, ErrorType.VIDEO, str));
    }

    @Override // ar.e
    public void onViewCreated(View view) {
    }

    @Override // ar.e
    public void onViewReady(View view) {
    }

    @Override // ar.e
    public void onViewAddedToContainer(View view, ViewGroup viewGroup) {
    }
}
