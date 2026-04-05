package s8;

import android.os.StrictMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f85494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f85495c;

    public d(e eVar, Runnable runnable) {
        this.f85495c = eVar;
        this.f85494b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        e eVar = this.f85495c;
        if (eVar.f85499f) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.f85494b.run();
        } catch (Throwable th2) {
            eVar.f85498e.handle(th2);
        }
    }
}
