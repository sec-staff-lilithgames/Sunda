package yl;

import android.view.View;
import com.iab.omid.library.appodeal.adsession.AdSession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f94602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f94603c;

    public i(j jVar, View view) {
        this.f94603c = jVar;
        this.f94602b = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f94603c;
        try {
            AdSession adSession = jVar.f94607f;
            if (adSession != null) {
                adSession.registerAdView(this.f94602b);
                jVar.b("registerView");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
