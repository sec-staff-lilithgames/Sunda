package yl;

import com.iab.omid.library.appodeal.adsession.media.MediaEvents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f94611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f94612c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f94613e;

    public l(u uVar, float f10, float f11) {
        this.f94613e = uVar;
        this.f94611b = f10;
        this.f94612c = f11;
    }

    @Override // java.lang.Runnable
    public void run() {
        u uVar = this.f94613e;
        try {
            MediaEvents mediaEvents = uVar.f94609h;
            if (mediaEvents != null) {
                mediaEvents.start(this.f94611b / 1000.0f, this.f94612c);
                uVar.b("onMediaStarted");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
