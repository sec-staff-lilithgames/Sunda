package fi;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c implements b, a {

    /* renamed from: b, reason: collision with root package name */
    public final e f55709b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55710c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f55711e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f55712f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public CountDownLatch f55713g;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f55709b = eVar;
        this.f55710c = i10;
        this.f55711e = timeUnit;
    }

    @Override // fi.a
    public void logEvent(String str, Bundle bundle) {
        synchronized (this.f55712f) {
            try {
                ei.f.getLogger().v("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f55713g = new CountDownLatch(1);
                this.f55709b.logEvent(str, bundle);
                ei.f.getLogger().v("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f55713g.await(this.f55710c, this.f55711e)) {
                        ei.f.getLogger().v("App exception callback received from Analytics listener.");
                    } else {
                        ei.f.getLogger().w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    ei.f.getLogger().e("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f55713g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fi.b
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f55713g;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
