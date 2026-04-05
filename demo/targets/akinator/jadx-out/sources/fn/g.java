package fn;

import com.iab.omid.library.appodeal.adsession.AdSession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f55748b;

    public g(r rVar) {
        this.f55748b = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r rVar = this.f55748b;
        try {
            rVar.f55768g = null;
            rVar.f55767f = null;
            AdSession adSession = rVar.f55766e;
            if (adSession != null) {
                adSession.finish();
            }
            r.a("destroy");
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
