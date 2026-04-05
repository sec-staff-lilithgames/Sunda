package fn;

import com.iab.omid.library.appodeal.adsession.media.InteractionType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.ironsource.Mf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f55755b;

    public k(r rVar) {
        this.f55755b = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MediaEvents mediaEvents = this.f55755b.f55768g;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
                r.a(Mf.f34998f);
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
