package fn;

import android.content.Context;
import com.iab.omid.library.appodeal.Omid;
import com.iab.omid.library.appodeal.adsession.Partner;
import io.bidmachine.BuildConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f55770b;

    public s(Context context) {
        this.f55770b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (Omid.isActive()) {
                return;
            }
            Omid.activate(this.f55770b);
            Omid.updateLastActivity();
            t.f55773c = Partner.createPartner("Appodeal", BuildConfig.OMSDK_VERSION_NAME);
            t.f55772b.set(true);
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
