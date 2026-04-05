package yl;

import android.os.Handler;
import com.iab.omid.library.appodeal.adsession.AdSession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f94595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f94596c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f94597e;

    public f(j jVar, Runnable runnable, Handler handler) {
        this.f94597e = jVar;
        this.f94595b = runnable;
        this.f94596c = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f94597e;
        try {
            jVar.f94609h = null;
            jVar.f94608g = null;
            AdSession adSession = jVar.f94607f;
            if (adSession != null) {
                adSession.finish();
            }
            jVar.b("destroy");
            Runnable runnable = this.f94595b;
            if (runnable != null) {
                this.f94596c.postDelayed(runnable, jVar.a());
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
