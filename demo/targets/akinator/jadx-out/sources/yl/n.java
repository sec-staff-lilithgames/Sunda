package yl;

import com.iab.omid.library.appodeal.adsession.media.MediaEvents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f94615b;

    public n(u uVar) {
        this.f94615b = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u uVar = this.f94615b;
        try {
            MediaEvents mediaEvents = uVar.f94609h;
            if (mediaEvents != null) {
                mediaEvents.midpoint();
                uVar.b("onMediaMidpoint");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
