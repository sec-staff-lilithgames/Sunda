package fn;

import com.iab.omid.library.appodeal.adsession.AdEvents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f55754b;

    public j(r rVar) {
        this.f55754b = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AdEvents adEvents = this.f55754b.f55767f;
            if (adEvents != null) {
                adEvents.impressionOccurred();
                r.a("onAdShown");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
