package fn;

import com.iab.omid.library.appodeal.adsession.media.MediaEvents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f55745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f55746c;

    public e(r rVar, float f10) {
        this.f55746c = rVar;
        this.f55745b = f10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MediaEvents mediaEvents = this.f55746c.f55768g;
            if (mediaEvents != null) {
                mediaEvents.volumeChange(this.f55745b);
                r.a("onMediaVolumeChanged");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
