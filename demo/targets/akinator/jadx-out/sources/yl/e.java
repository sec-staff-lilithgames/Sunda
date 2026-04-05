package yl;

import com.iab.omid.library.appodeal.adsession.media.InteractionType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.ironsource.Mf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f94594b;

    public e(j jVar) {
        this.f94594b = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f94594b;
        try {
            MediaEvents mediaEvents = jVar.f94609h;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
                jVar.b(Mf.f34998f);
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
