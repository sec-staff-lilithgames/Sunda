package fn;

import com.iab.omid.library.appodeal.adsession.media.MediaEvents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f55756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f55757c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f55758e;

    public l(r rVar, float f10, float f11) {
        this.f55758e = rVar;
        this.f55756b = f10;
        this.f55757c = f11;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MediaEvents mediaEvents = this.f55758e.f55768g;
            if (mediaEvents != null) {
                mediaEvents.start(this.f55756b / 1000.0f, this.f55757c);
                r.a("onMediaStarted");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
