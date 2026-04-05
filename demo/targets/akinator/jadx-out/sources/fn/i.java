package fn;

import android.view.ViewGroup;
import com.iab.omid.library.appodeal.adsession.AdSession;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f55752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f55753c;

    public i(r rVar, ViewGroup viewGroup) {
        this.f55753c = rVar;
        this.f55752b = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            r rVar = this.f55753c;
            AdSession adSession = rVar.f55766e;
            ViewGroup viewGroup = this.f55752b;
            if (adSession == null) {
                rVar.f55769h = new WeakReference(viewGroup);
            } else {
                adSession.registerAdView(viewGroup);
                r.a("registerAdView");
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
