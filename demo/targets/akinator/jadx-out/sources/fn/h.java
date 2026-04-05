package fn;

import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.ErrorType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ErrorType f55749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55750c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f55751e;

    public h(r rVar, ErrorType errorType, String str) {
        this.f55751e = rVar;
        this.f55749b = errorType;
        this.f55750c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AdSession adSession = this.f55751e.f55766e;
            if (adSession != null) {
                adSession.error(this.f55749b, this.f55750c);
                r.a("error");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
