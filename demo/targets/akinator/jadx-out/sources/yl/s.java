package yl;

import com.iab.omid.library.appodeal.adsession.media.MediaEvents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f94620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f94621c;

    public s(u uVar, float f10) {
        this.f94621c = uVar;
        this.f94620b = f10;
    }

    @Override // java.lang.Runnable
    public void run() {
        u uVar = this.f94621c;
        try {
            MediaEvents mediaEvents = uVar.f94609h;
            if (mediaEvents != null) {
                mediaEvents.volumeChange(this.f94620b);
                uVar.b("onMediaVolumeChanged");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
