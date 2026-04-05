package yl;

import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.ErrorType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ErrorType f94599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f94600c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f94601e;

    public h(j jVar, ErrorType errorType, String str) {
        this.f94601e = jVar;
        this.f94599b = errorType;
        this.f94600c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f94601e;
        try {
            AdSession adSession = jVar.f94607f;
            if (adSession != null) {
                adSession.error(this.f94599b, this.f94600c);
                jVar.b("error");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
