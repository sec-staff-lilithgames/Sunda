package yl;

import com.iab.omid.library.appodeal.adsession.AdEvents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f94593b;

    public d(j jVar) {
        this.f94593b = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AdEvents adEvents;
        j jVar = this.f94593b;
        try {
            if (!(jVar.f94607f != null) || (adEvents = jVar.f94608g) == null) {
                return;
            }
            adEvents.impressionOccurred();
            jVar.b("onAdShown");
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
